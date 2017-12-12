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
public class FoodTable extends AbstractTableModel
{
    private static final String[] COLUMNS = {"Food", "Weight (oz)", "Time Since Last Consumed"};
    private final ArrayList<Food> theFoodListData;
    
    /**
     * Constructor for FoodTable
     * @param theFoodListClass (FoodList)
     */
    public FoodTable(FoodList theFoodListClass) {
        theFoodListData = theFoodListClass.getParentFoodList();
    }
    
    public void update()
    {
        super.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return theFoodListData.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Food theFood = theFoodListData.get(row);

        switch (col) {
            case 0:
                return theFood.getName();
            case 1:
                return theFood.getWeight();
            case 2:
                return theFood.getTimeSinceLastConsumed();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int index) {
        return COLUMNS[index];
    }
}
