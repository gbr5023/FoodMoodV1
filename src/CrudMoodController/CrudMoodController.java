/*
 * add search functionality
 */
package CrudMoodController;

import CrudMoodModel.Mood;
import CrudMoodModel.MoodList;
import CrudMoodModel.MoodTable;
import CrudMoodView.CrudMoodView;
import CrudUserProfileModel.User;
import NavigationController.NavigationController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 * 
 * @author michaelcavallaro
 */
public class CrudMoodController 
{
    NavigationController theNavigationController;
    private CrudMoodView theCrudMoodView;
    MoodList theMoodList;
    MoodTable theMoodTable;
    ArrayList<Integer> moodRowsFound;
    String theIntake;
    User currentUser;
    /**
     * Creates CrudIntakeController and MoodList
     */
    public CrudMoodController(User currentUser)
    {
        System.out.println("CrudMoodController instantiated.");
        this.theMoodList = new MoodList(currentUser);
        theIntake = "";
        this.currentUser= currentUser;
    }
    
    /**
     * Sets parent NavigationController, requests CrudIntakeView
     * @param parentNavigationController 
     */
    public void setParentNavigationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to CrudIntakeController.");
        this.theNavigationController = parentNavigationController;
    }
    
    /**
     * Returns parent NavigationController class
     * @return theNavigationController
     */
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
    
    /**
     * Creates CrudMoodView
     */
    public void requestCrudMoodView(String theIntake)
    {
        System.out.println("Made it to CrudIntakeController.");
        this.theCrudMoodView = new CrudMoodView(this, theIntake);
        this.theCrudMoodView.setTitle("Input Mood");
        this.theCrudMoodView.setLocationRelativeTo(null);
        this.theCrudMoodView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theCrudMoodView.setVisible(true);
    }
    
    /**
     * Return parent ArrayList of Mood
     * @return ArrayList
     */
    public ArrayList getListOfMoods()
    {
        return this.theMoodList.getParentMoodList();
    }
    
    /**
     * Update ArrayList of Mood
     * @param updatedListOfMoods 
     */
    public void setListOfMoods(ArrayList<Mood> updatedListOfMoods)
    {
        this.theMoodList.setListOfMoods(updatedListOfMoods);
    }
       
    /**
     * Return TableModel of MoodList for StatisticView
     * @return TableModel
     */
    public TableModel getMoodListTableModel() 
    {
        this.theMoodTable = new MoodTable(this.theMoodList);
        
        return this.theMoodTable;
    }
    
    /**
     * Update Mood TableModel
     */
    public void updateTableModel()
    {
        this.theMoodTable.update();
    }
    
    public boolean requestSearchMoodList(String moodToSearch)
    {
        boolean searchedMoodFound = this.theMoodList.requestSearchMoodList(moodToSearch);
        return searchedMoodFound;
    }
    
    public ArrayList<Integer> getListOfMoodRowsFound()
    {
        this.moodRowsFound = this.theMoodList.getListOfMoodRowsFound();
        
            return this.moodRowsFound;
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theNavigationController.requestNavigationView();
    } 
}
