/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudUserProfileModel;

import java.awt.Image;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Gisward
 */
public class User implements Serializable
{
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private char[] password;
    private char[] confirmPassword;
    private Timestamp timeStamp;
    private String profilePicPath;
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        profilePicPath = "resources/default-profile.png";
    }
    
    public User(String first, String last, String email, char[] pass, Timestamp time) {
        firstName = first;
        lastName = last;
        this.email = email;
        password = pass;
        timeStamp = time;
        profilePicPath = "resources/default-profile.png";
    }
    
    public User(String first, String last, String email, char[] pass, char[] confirmPass) {
        firstName = first;
        lastName = last;
        this.email = email;
        password = pass;
        confirmPassword = confirmPass;
        profilePicPath = "resources/default-profile.png";
    }
    
    public User(String first, String last, String email, char[] pass, Timestamp time, String imagePath) {
        firstName = first;
        lastName = last;
        this.email = email;
        password = pass;
        timeStamp = time;
        profilePicPath = imagePath;
    }
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public char[] getPassword() {
        return password;
    }

    public char[] getConfirmPassword() {
        return confirmPassword;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }
    
    public String getProfilePicPath() {
        return profilePicPath;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public void setConfirmPassword(char[] confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    public void setProfilePicPath(String path) {
        profilePicPath = path;
    }
    
    
    
}
