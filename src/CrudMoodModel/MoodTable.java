/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudMoodModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gisward
 */
public class MoodTable extends AbstractTableModel
{
    private static final String[] COLUMNS = {"Mood", "Intake"};
    private final ArrayList<Mood> theMoodListData;
    
    /**
     *
     * @param theMoodListClass
     */
    public MoodTable(MoodList theMoodListClass) {
        theMoodListData = theMoodListClass.getParentMoodList();
    }
    
    public void update()
    {
        super.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return theMoodListData.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Mood theMood = theMoodListData.get(row);

        switch (col) {
            case 0:
                return theMood.getMood();
            case 1:
                return theMood.getMoodIntake();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int index) {
        return COLUMNS[index];
    }
}