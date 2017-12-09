/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import Serializable.SerializedDataCntl;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class DrinkList 
{
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "drink.ser";
    
    private ArrayList<Drink> theListOfDrinks;

    public DrinkList() {
        theListOfDrinks = SerializedDataCntl.getSerializedDataCntl().getDrinkList();
        if (this.theListOfDrinks.isEmpty()) {
            buildTestDrinkList();
        }
    }

    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfDrinks, STORAGE_FILE_PATH);
    }

    public void setListOfDrinks(ArrayList<Drink> theDrinkList) {
        theListOfDrinks = theDrinkList;
    }

    public void buildTestDrinkList() {
        this.theListOfDrinks = new ArrayList();

        // Not using add() method in order to save time saving
        theListOfDrinks.add(new Drink("Bubble Tea", 16, "2 hr"));
        theListOfDrinks.add(new Drink("Beer", 8, "12 hr"));
        theListOfDrinks.add(new Drink("Tea", 6, "20 min"));
        theListOfDrinks.add(new Drink("Water", 16, "5 min"));

        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfDrinks.size(); i++) {
            System.out.println(this.theListOfDrinks.get(i).getName() + ", Weight: "
                    + this.theListOfDrinks.get(i).getWeight() + ", Time Since Last Consumed: "
                    + this.theListOfDrinks.get(i).getTimeSinceLastConsumed());
        }

        save();
    }

    public void add(Drink theDrinkToAdd) {
        theListOfDrinks.add(theDrinkToAdd);
        save();
    }

    /* just copied from UserList class, but use the same logic to search for drinks */
    public int searchDrinkName(String nameToSearch) {
        for (int i = 0; i < this.theListOfDrinks.size(); i++) {
            if (this.theListOfDrinks.get(i).getName().toLowerCase().contains(nameToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public int searchDrinkWeight(double weightToSearch) {
        boolean weightMatch;

        for (int i = 0; i < this.theListOfDrinks.size(); i++) {
            weightMatch = this.theListOfDrinks.get(i).getWeight() == weightToSearch;
            if (weightMatch) {
                return i;
            }
        }

        return -1;
    }

    public int searchTimeSinceLastConsumed(String timeSinceLastConsumedToSearch) {
        for (int i = 0; i < this.theListOfDrinks.size(); i++) {
            if (this.theListOfDrinks.get(i).getTimeSinceLastConsumed().toLowerCase().contains(timeSinceLastConsumedToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public void delete(Drink theDrinkToDelete) {
        boolean removed = theListOfDrinks.remove(theDrinkToDelete);
        System.out.println("REMOVED : " + removed);
        save();
    }

    public Drink get(int theDrinkID) {
        return theListOfDrinks.get(theDrinkID);
    }
}
