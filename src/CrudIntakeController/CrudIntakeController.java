/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeController;

import CrudIntakeModel.*;
import CrudIntakeView.*;
import NavigationController.NavigationController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author michaelcavallaro
 */
public class CrudIntakeController{
    private CrudIntakeView theCrudIntakeView;
    NavigationController theNavigationController;
    FoodList theFoodList;
    DrinkList theDrinkList;
    
    /**
     * Constructs a new empty CrudIntakeController
     * @param parentNavigationController This is the original NavigationController object
     */
    
    public CrudIntakeController(NavigationController parentNavigationController)
    {
        this.theNavigationController = parentNavigationController;
        this.requestCrudIntakeView();
        
        this.theDrinkList = new DrinkList();
        this.theFoodList = new FoodList();
    }
    
    public void requestCrudIntakeView()
    {
        this.theCrudIntakeView = new CrudIntakeView(this);
        this.theCrudIntakeView.setTitle("Input Intake");
        this.theCrudIntakeView.setLocationRelativeTo(null);
        this.theCrudIntakeView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theCrudIntakeView.setVisible(true);
    }
    
    public void addFood(Food f)
    {
        this.theFoodList.add(f);
    }
    
    public ArrayList getListOfFoods()
    {
        return this.theFoodList.getListOfFoods();
    }
    
    public FoodList getFoodListClass()
    {
        return this.theFoodList;
    }
    
    public void setListOfFoods(ArrayList<Food> updatedListOfFoods)
    {
        this.theFoodList.setListOfFoods(updatedListOfFoods);
    }
    
    public void addDrink(Drink d)
    {
        this.theDrinkList.add(d);
    }
    
    public ArrayList getListOfDrinks()
    {
        return this.theDrinkList.getListOfDrinks();
    }
    
    public DrinkList getDrinkListClass()
    {
        return this.theDrinkList;
    }
    
    public void setListOfDrinks(ArrayList<Drink> updatedListOfDrinks)
    {
        this.theDrinkList.setListOfDrinks(updatedListOfDrinks);
    }
    
    public TableModel getFoodListTableModel() 
    {
        return new FoodTable(this.theFoodList);
    }
    
    public TableModel getDrinkListTableModel()
    {
        return new DrinkTable(this.theDrinkList);
    }

    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theCrudIntakeView.setVisible(false);
        this.theNavigationController.requestNavigationView();
    }   

    public Food getFood(int row) {
        return this.theFoodList.get(row);
    }
    
    public Drink getDrink(int row){
        return this.theDrinkList.get(row);
    }

    public NavigationController getParentNavigationController() {
        return this.theNavigationController;
    }

    public void deleteFood(Food theFood) 
    {
        this.theFoodList.delete(theFood);
    } 
    
    public void deleteDrink(Drink theDrink)
    {
        this.theDrinkList.delete(theDrink);
    }
}
