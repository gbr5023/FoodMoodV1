/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudIntakeModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gisward
 */
public class DrinkTable extends AbstractTableModel
{
    private static final String[] COLUMNS = {"Drink", "Weight (oz)", "Time Since Last Consumed"};
    private final ArrayList<Drink> theDrinkListData;
    
    /**
     *
     * @param theDrinkListClass
     */
    public DrinkTable(DrinkList theDrinkListClass) {
        theDrinkListData = theDrinkListClass.getParentDrinkList();
    }
    
    public void updeate()
    {
        super.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return theDrinkListData.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Drink theDrink = theDrinkListData.get(row);

        switch (col) {
            case 0:
                return theDrink.getName();
            case 1:
                return theDrink.getWeight();
            case 2:
                return theDrink.getTimeSinceLastConsumed();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int index) {
        return COLUMNS[index];
    }
}
