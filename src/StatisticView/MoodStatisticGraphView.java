/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatisticView;

import CrudMoodModel.Mood;
import CrudMoodModel.MoodList;
import CrudUserProfileModel.User;
import StatisticController.StatisticController;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Gisward
 */
public class MoodStatisticGraphView extends JFrame
{
    private static final long serialVersionUID = 1L;
    StatisticController theStatisticController;
    ArrayList<Mood> parentListOfMoods;
    MoodList theMoodList;
    User currentUser;

    public MoodStatisticGraphView(String applicationTitle, String chartTitle, User currentUser) 
    {
        super(applicationTitle);
        // This will create the dataset
        PieDataset dataset = createDataset();
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);

    }
    
    public void setStatisticController(StatisticController parentStatisticController)
    {
        this.theStatisticController = parentStatisticController;
        this.currentUser = this.theStatisticController.getCurrentUser();
        this.theMoodList = new MoodList(this.currentUser);
    }

    /**
     * Creates a sample dataset
     */
    private  PieDataset createDataset() 
    {
        DefaultPieDataset result = new DefaultPieDataset();
        this.parentListOfMoods = new ArrayList<Mood>();
        this.parentListOfMoods = this.theMoodList.getParentMoodList();
        ArrayList<String> temp = new ArrayList();
        
        for(int i = 0; i < this.parentListOfMoods.size(); i++)
        {
            String currentMood = this.parentListOfMoods.get(i).getMood();
            for(int j = 0; j < this.parentListOfMoods.size(); j++)
            {
                if(this.parentListOfMoods.get(i).getMood().equalsIgnoreCase(currentMood))
                {
                    temp.add(currentMood);
                }
            }
            result.setValue(currentMood, temp.size());
        }
        //result.setValue("Linux", 29);
        //result.setValue("Mac", 20);
        //result.setValue("Windows", 51);
        return result;

    }

    /**
     * Creates a chart
     */
    private JFreeChart createChart(PieDataset dataset, String title) 
    {

        JFreeChart chart = ChartFactory.createPieChart3D(
            title,                  // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;

    }
}
