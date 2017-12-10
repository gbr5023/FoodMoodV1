/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodRecModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gisward
 */
public class FoodRecTable extends AbstractTableModel
{
    private static final String[] COLUMNS = {"Food Recommendation", "Category"};
    private final ArrayList<FoodRec> theFoodRecData;
    
    public FoodRecTable(FoodRecList theFoodRecListClass)
    {
        this.theFoodRecData = theFoodRecListClass.getParentFoodRecList();
    }
    
    public void update()
    {
        super.fireTableDataChanged();
    }

    @Override
    public int getRowCount() 
    {
        return theFoodRecData.size();    
    }

    @Override
    public int getColumnCount() 
    {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int row, int col) 
    {
        FoodRec theFoodRec = this.theFoodRecData.get(row);

        switch (col) {
            case 0:
                return theFoodRec.getFoodRec();
            case 1:
                return theFoodRec.getFoodRecCategory();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int index) 
    {
        return COLUMNS[index];
    }
}
