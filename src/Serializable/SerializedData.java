/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Serializable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class SerializedData implements Serializable 
{

    private ArrayList listToSave;
    
    public SerializedData()
    {
        listToSave = new ArrayList();
    }
    
    public SerializedData(ArrayList listToSave)
    {
        this.listToSave = listToSave;
    }
    
    public ArrayList getList()
    {
        return listToSave;
    }
    
    public void setList(ArrayList listToSave)
    {
        this.listToSave = listToSave;
    }
    
    public boolean isEmpty()
    {
        return listToSave.isEmpty();
    }
}