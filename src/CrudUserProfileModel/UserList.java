/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudUserProfileModel;
import Serializable.*;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class UserList 
{
    public static String STORAGE_FILE_PATH = "data/users.ser";
    private ArrayList<User> theListOfUsers;
    User currentUser = new User();
    
    public UserList() {
        theListOfUsers = SerializedDataCntl.getSerializedDataCntl().getUserList();
        if (theListOfUsers.isEmpty()) 
        {
            buildTestUserList();
        }
    }
    
    public User getUserByEmail(String str) 
    {
        for(int i = 0; i < this.theListOfUsers.size(); i++)
        {
            if(this.theListOfUsers.get(i).getEmail().equalsIgnoreCase(str))
            {
                this.currentUser = theListOfUsers.get(i);
            }
        }
        return currentUser;
    }

    public ArrayList<User> getListOfUsers() {
        if (this.theListOfUsers == null) {
            buildTestUserList();
        }
        return this.theListOfUsers;
    }

    public void buildTestUserList() {
        theListOfUsers = new ArrayList();
        for (int i = 0; i < 100; i++) {
            String firstName = "Jane";
            String lastName = "Doe" + i;
            char[] password = {'1', '2', '3', '4'};
            String email = "jdoe" + i +"@email.com";
            Timestamp time = new Timestamp(System.currentTimeMillis());
            User newUser = new User(firstName, lastName, email, password, time);
            System.out.println("New user " + email);
            theListOfUsers.add(newUser);
        }
        System.out.println("Password: 1234");

        SerializedDataCntl.getSerializedDataCntl().setList(theListOfUsers, STORAGE_FILE_PATH);
    }

    public boolean authenticate(String emailToCheck, char[] passwordToCheck) {
        for (int i = 0; i < theListOfUsers.size(); i++) {
            boolean nameMatch = emailToCheck.equals(theListOfUsers.get(i).getEmail());
            boolean passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if (nameMatch && passwordMatch) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(String email) {
        return theListOfUsers.stream().anyMatch((theUser) -> (theUser.getEmail().equals(email)));
    }

    public void add(User theUserToAdd) {
        theListOfUsers.add(theUserToAdd);
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfUsers, STORAGE_FILE_PATH);
    }
}
