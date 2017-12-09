/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodController;

import CrudMoodModel.Mood;
import CrudMoodModel.MoodList;
import CrudMoodModel.MoodTable;
import CrudMoodView.CrudMoodView;
import DatabaseController.DatabaseController;
import NavigationController.NavigationController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 * 
 * @author michaelcavallaro
 */
public class CrudMoodController 
{
    private CrudMoodView theCrudMoodView;
    NavigationController theNavigationController;
    MoodList theMoodList;
    /**
     * Constructs a new empty CrudIntakeController
     * @param parentNavigationController This is the original NavigationController object
     */
    public CrudMoodController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to CrudMoodController");
        this.theNavigationController = parentNavigationController;
        this.theMoodList = new MoodList();
    }
    
    public void requestCrudMoodView()
    {
        this.theCrudMoodView = new CrudMoodView(this);
        this.theCrudMoodView.setTitle("Input Mood");
        this.theCrudMoodView.setLocationRelativeTo(null);
        this.theCrudMoodView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theCrudMoodView.setVisible(true);
    }
    
    public void addMood(Mood m)
    {
        this.theMoodList.add(m);
    }
    
    public ArrayList getListOfMoods()
    {
        return this.theMoodList.getListOfMoods();
    }
    
    public MoodList getMoodListClass()
    {
        return this.theMoodList;
    }
    
    public void setListOfMoods(ArrayList<Mood> updatedListOfMoods)
    {
        this.theMoodList.setListOfMoods(updatedListOfMoods);
    }
       
    public TableModel getMoodListTableModel() 
    {
        return new MoodTable(this.theMoodList);
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theCrudMoodView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
    
    public NavigationController getParentNavigationController() 
    {
        return this.theNavigationController;
    }
}
