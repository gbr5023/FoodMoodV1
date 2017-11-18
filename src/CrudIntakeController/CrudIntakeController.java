/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudIntakeController;

import CrudIntakeModel.Food;
import CrudIntakeModel.Drink;
import CrudIntakeView.CrudIntakeView;
import DatabaseController.DatabaseController;
import NavigationController.NavigationController;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author michaelcavallaro
 */
public class CrudIntakeController implements DatabaseController{
    private CrudIntakeView view;
    NavigationController theNavigationController;
    Food theFoodClass;
    Drink theDrinkClass;
    ArrayList<Food> fList;
    ArrayList<Drink> dList;
    
    /**
     * Constructs a new empty CrudIntakeController
     * @param parentNavigationController This is the original NavigationController object
     */
    
    public CrudIntakeController(NavigationController parentNavigationController)
    {
        this.fList = new ArrayList();
        this.dList = new ArrayList();
        this.theNavigationController = parentNavigationController;
        view = new CrudIntakeView(this);
        view.setTitle("Input Intake");
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }
    
    public void addFood(Food f)
    {
        this.fList.add(f);
    }
    
    public ArrayList getFoodList()
    {
        return this.fList;
    }
    
    public void addDrink(Drink d)
    {
        this.dList.add(d);
    }
    
    public ArrayList getDrinkList()
    {
        return this.dList;
    }
    
    /**
     * Constructs a new CrudIntakeView
     * @param view This is the CrudIntakeView local object
     */
    public CrudIntakeController(CrudIntakeView view) {
        //this.fList = new List<Food>();
        this.view = view;
    }
    
    /**
     * Calls the original NavigationView GUI
     */
    public void requestNavigationView()
    {
        this.theNavigationController.requestNavigationView();
    }
    
    /**
     * New connection to a database
     * @return SQL Connection 
     */
    @Override
    public Connection newConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Execute query to read in information
     * @param con Connection to database
     * @param sql SQL Statement string
     * @return Result will be true if statement executed without error
     */
    @Override
    public ResultSet executeNonUpdateQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Execute update statement to make changes, removals, etc.
     * @param con Connection to database
     * @param sql SQL Statement string
     * @return Result will be true if statement executed without error
     */
    @Override
    public int executeQuery(Connection con, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
