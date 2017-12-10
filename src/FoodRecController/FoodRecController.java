/*
 * add search functionality
 */

package FoodRecController;

import FoodRecModel.FoodRec;
import FoodRecModel.FoodRecList;
import FoodRecModel.FoodRecTable;
import FoodRecView.FoodRecView;
import NavigationController.NavigationController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class FoodRecController 
{
    NavigationController theNavigationController;
    FoodRecView theFoodRecView;
    FoodRecList theFoodRecList;
    FoodRecTable theFoodRecTable;
    ArrayList<Integer> foodRecRowsFound;
    ArrayList<Integer> foodRecCategoryRowsFound;
    
    /**
     * Creates FoodRecController and FoodRecList
     */
    public FoodRecController()
    {
        System.out.println("FoodRecController instantiated.");
        this.theFoodRecList = new FoodRecList();
        this.theFoodRecTable = new FoodRecTable(this.theFoodRecList);
    }
    
    /**
     * Returns parent NavigationController class
     * @return theNavigationController
     */
    public NavigationController getParentNavigationController() {
        return this.theNavigationController;
    }
    
    /**
     * Sets parent NavigationController, requests FoodRecView
     * @param parentNavigationController 
     */
    public void setParentNavigationController(NavigationController parentNavigationController)
    {
        System.out.println("Made it to FoodRecController.");
        this.theNavigationController = parentNavigationController;
        this.requestFoodRecView();
    }
    
    /**
     * Creates FoodRecView
     */
    public void requestFoodRecView()
    {
        theFoodRecView = new FoodRecView(this);
        theFoodRecView.setTitle("Food Recommendations");
        theFoodRecView.setLocationRelativeTo(null);
        theFoodRecView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFoodRecView.setVisible(true);
    }
    
    /**
     * Returns parent ArrayList of FoodRec
     * @return ArrayList
     */
    public ArrayList getListOfFoodRecs()
    {
        return this.theFoodRecList.getParentFoodRecList();
    }
    
    /**
     * Updates ArrayList of FoodRec
     * @param updatedListOfFoodRecs 
     */
    public void setListOfFoodRecs(ArrayList<FoodRec> updatedListOfFoodRecs)
    {
        this.theFoodRecList.setListOfFoodRecs(updatedListOfFoodRecs);
    }
       
    /**
     * Returns TableModel of FoodRecList for FoodRecView
     * @return TableModel
     */
    public TableModel getFoodRecListTableModel() 
    {   
        return this.theFoodRecTable;
    }
    
    /**
     * Update FoodRec TableModel
     */
    public void updateTableModel()
    {
        this.theFoodRecTable.update();
    }
    
    /**
     * Search for FoodRec name in ArrayList of FoodRec
     * @param foodRecToSearch
     * @return boolean
     */
    public boolean requestSearchFoodRecList(String foodRecToSearch)
    {
        boolean searchedFoodRecFound = this.theFoodRecList.requestSearchFoodRecList(foodRecToSearch);
        return searchedFoodRecFound;
    }
    
    /**
     * Search for FoodRec category in ArrayList of FoodRec
     * @param foodRecToSearch
     * @return boolean
     */
    public boolean requestSearchFoodRecListCategory(String foodRecToSearch)
    {
        boolean searchedFoodRecCategoryFound = this.theFoodRecList.requestSearchFoodRecListCategory(foodRecToSearch);
        return searchedFoodRecCategoryFound;
    }
    
    /**
     * Return ArrayList of Integer of FoodRec name found
     * @return ArrayList
     */
    public ArrayList<Integer> getListOfFoodRecRowsFound()
    {
        this.foodRecRowsFound = this.theFoodRecList.getListOfFoodRecRowsFound();
        
        return this.foodRecRowsFound;
    }
    
    /**
     * Return ArrayList of Integer of FoodRec category found
     * @return ArrayList
     */
    public ArrayList<Integer> getListOfFoodRecCategoryRowsFound()
    {
        this.foodRecCategoryRowsFound = this.theFoodRecList.getListOfFoodRecCategoryRowsFound();
        return this.foodRecCategoryRowsFound;
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theFoodRecView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    } 
}
