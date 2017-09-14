/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userprofilemodel;

/**
 *
 * @author gbr5023
 */
public class User 
{
    public String username; 
    public String password;
    
    /**
     * This is the default constructor for the User class
     */
    public User()
    {
        
    }
    
    /**
     * This is the method that authenticates the User
     * @param username This is the User's username to authenticate
     * @param password This is the User's password to authenticate
     */
    public boolean authenticate(String username, String password)
    {
        return true;
    }
}
