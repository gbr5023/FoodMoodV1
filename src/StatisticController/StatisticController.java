/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatisticController;

import CrudMoodController.CrudMoodController;
import CrudUserProfileModel.User;
import NavigationController.NavigationController;
import StatisticView.StatisticView;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class StatisticController
{
    NavigationController theNavigationController;
    StatisticView theStatisticView;
    CrudMoodController theCrudMoodController;
    TableModel foodTableModel;
    TableModel drinkTableModel;
    TableModel moodTableModel;
    User currentUser;
    /**
     * Creates StatisticController
     */
    public StatisticController(User currentUser)
    {
        this.currentUser = currentUser;
        System.out.println("StatisticController instantiated.");
    }
    
    public User getCurrentUser()
    {
        return this.currentUser;
    }
    
    /**
     * Returns parent NavigationController class
     * @return theNavigationController
     */
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
    
    public CrudMoodController getParentCrudMoodController()
    {
        return this.theCrudMoodController;
    }
    
    public void setParentCrudMoodController(CrudMoodController parentCrudMoodController)
    {
        this.theCrudMoodController = parentCrudMoodController;
    }
    
    public void setTableModels(TableModel foodTableModel, TableModel drinkTableModel, TableModel moodTableModel)
    {
        this.foodTableModel = foodTableModel;
        this.drinkTableModel = drinkTableModel;
        this.moodTableModel = moodTableModel;
    }
    
    public TableModel getFoodTableModel()
    {
        return this.foodTableModel;
    }
    
    public TableModel getDrinkTableModel()
    {
        return this.drinkTableModel;
    }
    
    public TableModel getMoodTableModel()
    {
        return this.moodTableModel;
    }
    
    /**
     * Sets parent NavigationController, requests StatisticView
     * @param parentNavigationController 
     */
    public void setParentNavigationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to StatisticController.");
        this.theNavigationController = parentNavigationController;
        this.theCrudMoodController = this.theNavigationController.requestCrudMoodController();
        this.requestStatisticView();
    }
    
    /**
     * Creates StatisticView
     */
    public void requestStatisticView()
    {
        theStatisticView = new StatisticView(this, this.theNavigationController);
        theStatisticView.setTitle("Statistics");
        theStatisticView.setLocationRelativeTo(null);
        theStatisticView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theStatisticView.setVisible(true);
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theStatisticView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
}
