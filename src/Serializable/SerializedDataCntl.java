/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import CrudIntakeModel.Food;
import CrudIntakeModel.FoodList;
import CrudIntakeModel.Drink;
import CrudIntakeModel.DrinkList;
import CrudMoodModel.Mood;
import CrudMoodModel.MoodList;
import CrudUserProfileModel.User;
import CrudUserProfileModel.UserList;
import FoodRecModel.FoodRec;
import FoodRecModel.FoodRecList;

/**
 * 
 * @author Gisward
 */
public class SerializedDataCntl 
{

    private static SerializedDataCntl serializedDataController;
    public static String EXTERNAL_DATA_PATH = "data/";

    private SerializedData sdModel;

    private SerializedDataCntl() {
        getSerializedDataModel();
    }

    public static SerializedDataCntl getSerializedDataCntl() {
        if (serializedDataController == null) {
            serializedDataController = new SerializedDataCntl();
        }

        return serializedDataController;
    }

    public SerializedData getSerializedDataModel() {
        if (sdModel == null) {
            sdModel = new SerializedData();
        }

        return sdModel;
    }

    private void writeFile(String filePath) {
        long curTime = System.currentTimeMillis();
        FileOutputStream fos;
        ObjectOutputStream out;

        try {
            fos = new FileOutputStream(filePath);
            out = new ObjectOutputStream(fos);
            out.writeObject(sdModel);
            out.close();

            System.out.println("Data write to " + filePath + " was successful.");
        } catch (IOException ex) {
            System.out.println("Data write to " + filePath + " failed.");
        }

        curTime = System.currentTimeMillis() - curTime;
        System.out.println("Saving took " + curTime + "ms");
    }

    private void readFile(String filePath) {
        FileInputStream fis;
        ObjectInputStream in;

        try {
            fis = new FileInputStream(filePath);
            in = new ObjectInputStream(fis);
            sdModel = (SerializedData) in.readObject();
            System.out.println(sdModel.getList());
        } catch (IOException | ClassNotFoundException ex) {
            sdModel = new SerializedData();
        }
    }

    public void setList(ArrayList listToSave, String filePath) {
        sdModel.setList(listToSave);
        writeFile(filePath);
    }

    private ArrayList getList(String filePath) {
        readFile(filePath);

        System.out.println("Getting data at " + filePath);
        if (sdModel.isEmpty()) {
            System.out.println("No data found at " + filePath);
        } else {
            System.out.println("Data found at " + filePath);
        }

        return sdModel.getList();
    }
    
    public ArrayList<Food> getFoodList()
    {
        return (ArrayList<Food>) getList(FoodList.STORAGE_FILE_PATH);
    }

    public ArrayList<Drink> getDrinkList() 
    {
        return (ArrayList<Drink>) getList(DrinkList.STORAGE_FILE_PATH);
    }

    public ArrayList<Mood> getMoodList() 
    {
        return (ArrayList<Mood>) getList(MoodList.STORAGE_FILE_PATH);
    }

    public ArrayList<User> getUserList() 
    {
        return (ArrayList<User>) getList(UserList.STORAGE_FILE_PATH);
    }
    
    public ArrayList<FoodRec> getFoodRecList()
    {
        return (ArrayList<FoodRec>) getList(FoodRecList.STORAGE_FILE_PATH);
    }
}
