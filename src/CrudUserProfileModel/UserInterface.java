/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudUserProfileModel;

/**
 *
 * @author Gisward
 */
public interface UserInterface 
{
    /**
     * This is the method that returns the username
     * @return username This is the username
     */
    public String getUserName();
    
    /**
     * This is the method that sets the user-entered username to the local variable
     * @param username This is the user-entered username
     */
    public void setUserName(String username);
    
    /**
     * This is the method that returns the password
     * @return password This is the password
     */
    public String getPassword();
    
    /**
     * This is the method that sets the user-entered password to the local variable
     * @param password This is the user-entered password
     */
    public void setPassword(String password);
}
