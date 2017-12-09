/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import CrudUserProfileController.LoginController;
import Serializable.SerializedDataCntl;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class FoodList 
{
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + LoginController.getCurrentUser() + "-food.ser";
    private ArrayList<Food> theListOfFoods;

    public FoodList() {
        theListOfFoods = SerializedDataCntl.getSerializedDataCntl().getFoodList();
        if (this.theListOfFoods.isEmpty()) {
            buildTestFoodList();
        }
    }
    
    public ArrayList<Food> getListOfFoods() {
        if (this.theListOfFoods == null) {
            buildTestFoodList();
        }
        return this.theListOfFoods;
    }

    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfFoods, STORAGE_FILE_PATH);
    }

    public void setListOfFoods(ArrayList<Food> theFoodList) {
        theListOfFoods = theFoodList;
    }

    public void buildTestFoodList() {
        this.theListOfFoods = new ArrayList();

        // Not using add() method in order to save time saving
        theListOfFoods.add(new Food("Hamburger", 5, "14 hr"));
        theListOfFoods.add(new Food("Spaghetti", 16, "5 hr"));
        theListOfFoods.add(new Food("Sandwich", 3, "30 min"));
        theListOfFoods.add(new Food("Strawberries", 8, "2 min"));

        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfFoods.size(); i++) {
            System.out.println(this.theListOfFoods.get(i).getName() + ", Weight: "
                    + this.theListOfFoods.get(i).getWeight() + ", Time Since Last Consumed: "
                    + this.theListOfFoods.get(i).getTimeSinceLastConsumed());
        }

        save();
    }

    public void add(Food theFoodToAdd) {
        theListOfFoods.add(theFoodToAdd);
        save();
    }

    /* just copied from UserList class, but use the same logic to search for foods */
    public int searchFoodName(String nameToSearch) {
        for (int i = 0; i < this.theListOfFoods.size(); i++) {
            if (this.theListOfFoods.get(i).getName().toLowerCase().contains(nameToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public int searchFoodWeight(double weightToSearch) {
        boolean weightMatch;

        for (int i = 0; i < this.theListOfFoods.size(); i++) {
            weightMatch = this.theListOfFoods.get(i).getWeight() == weightToSearch;
            if (weightMatch) {
                return i;
            }
        }

        return -1;
    }

    public int searchTimeSinceLastConsumed(String timeSinceLastConsumedToSearch) {
        for (int i = 0; i < this.theListOfFoods.size(); i++) {
            if (this.theListOfFoods.get(i).getTimeSinceLastConsumed().toLowerCase().contains(timeSinceLastConsumedToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public void delete(Food theFoodToDelete) {
        boolean removed = theListOfFoods.remove(theFoodToDelete);
        System.out.println("REMOVED : " + removed);
        save();
    }

    public Food get(int theFoodID) {
        return theListOfFoods.get(theFoodID);
    }
}
