/*
 * add search functionality
 */
package CrudIntakeController;

import CrudIntakeModel.*;
import CrudIntakeView.*;
import CrudMoodController.CrudMoodController;
import NavigationController.NavigationController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author michaelcavallaro
 */
public class CrudIntakeController{
    NavigationController theNavigationController;
    CrudMoodController theCrudMoodController;
    private CrudIntakeView theCrudIntakeView;
    FoodList theFoodList;
    DrinkList theDrinkList;
    FoodTable theFoodTable;
    DrinkTable theDrinkTable;
    ArrayList<Integer> foodRowsFound;
    ArrayList<Integer> drinkRowsFound;
    String theIntake;
    
    /**
     * Creates CrudIntakeController, FoodList, and DrinkList
     */
    
    public CrudIntakeController()
    {
        System.out.println("CrudIntakeController instantiated.");    
        this.theFoodList = new FoodList();
        this.theDrinkList = new DrinkList();
        this.theCrudMoodController = new CrudMoodController();
        theIntake = "";
    }
    
    /**
     * Returns parent NavigationController class
     * @return theNavigationController
     */
    public NavigationController getParentNavigationController() {
        return this.theNavigationController;
    }
    
    /**
     * Sets parent NavigationController, requests CrudIntakeView
     * @param parentNavigationController 
     */
    public void setParentNavigationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to CrudIntakeController.");
        this.theNavigationController = parentNavigationController;
        this.requestCrudIntakeView();
    }
    
    /**
     * Creates CrudIntakeView
     */
    public void requestCrudIntakeView()
    {
        this.theCrudIntakeView = new CrudIntakeView(this);
        this.theCrudIntakeView.setTitle("Input Intake");
        this.theCrudIntakeView.setLocationRelativeTo(null);
        this.theCrudIntakeView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theCrudIntakeView.setVisible(true);
    }
    
    public CrudMoodController getCrudMoodController()
    {
        return this.theNavigationController.requestCrudMoodController();
    }
    
    /**
     * Return parent ArrayList of Food
     * @return ArrayList
     */
    public ArrayList getListOfFoods()
    {
        return this.theFoodList.getParentFoodList();
    }
    
    /**
     * Return parent ArrayList of Drink
     * @return ArrayList
     */
    public ArrayList getListOfDrinks()
    {
        return this.theDrinkList.getParentDrinkList();
    }
    
    /**
     * Update ArrayList of Food
     * @param updatedListOfFoods 
     */
    public void setListOfFoods(ArrayList<Food> updatedListOfFoods)
    {
        this.theFoodList.setListOfFoods(updatedListOfFoods);
    }
    
    /**
     * Update ArrayList of Drink
     * @param updatedListOfDrinks 
     */
    public void setListOfDrinks(ArrayList<Drink> updatedListOfDrinks)
    {
        this.theDrinkList.setListOfDrinks(updatedListOfDrinks);
    }
    
    /**
     * Returns TableModel of FoodList for StatisticView
     * @return TableModel
     */
    public TableModel getFoodListTableModel() 
    {
        this.theFoodTable = new FoodTable(this.theFoodList);
        
        return this.theFoodTable;
    }
    
    /**
     * Returns TableModel of DrinkList for StatisticView
     * @return TableModel
     */
    public TableModel getDrinkListTableModel()
    {
        this.theDrinkTable = new DrinkTable(this.theDrinkList);
        
        return this.theDrinkTable;
    }

    /**
     * Update Food and Drink TableModels
     */
    public void updateTableModel()
    {
        this.theFoodTable.update();
        this.theDrinkTable.updeate();
    }
    
    public boolean requestSearchFoodList(String foodToSearch)
    {
        boolean searchedFoodFound = this.theFoodList.requestSearchFoodList(foodToSearch);
        
        return searchedFoodFound;
    }
    
    public boolean requestSearchDrinkList(String drinkToSearch)
    {
        boolean searchedDrinkFound = this.theDrinkList.requestSearchDrinkList(drinkToSearch);
        
        return searchedDrinkFound;
    }
    
    public ArrayList<Integer> getListOfFoodRowsFound()
    {
        this.foodRowsFound = this.theFoodList.getListOfFoodRowsFound();
        
        return this.foodRowsFound;
    }
    
    public ArrayList<Integer> getListOfDrinkRowsFound()
    {
        this.drinkRowsFound = this.theDrinkList.getListOfDrinkRowsFound();
        
        return this.drinkRowsFound;
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theCrudIntakeView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    }   
}
