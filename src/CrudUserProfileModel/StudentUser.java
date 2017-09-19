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
public class StudentUser implements User
{
    String studentUserName;
    String studentPassword;
    
    /**
     * This is the default constructor of the StudentUser class
     * It captures the new username and password
     * It creates a new StudentUser object
     * @param studentUserName This is the student username
     * @param studentPassword This is the student password
     */
    public StudentUser(String studentUserName, String studentPassword)
    {
        
    }

    /**
     * This is the method that returns the username
     * @return studentUserName This is the username
     */
    @Override
    public String getUserName() 
    {
        return this.studentUserName;
    }

    /**
     * This is the method that sets the user-entered username to the local variable
     * @param username This is the user-entered username
     */
    @Override
    public void setUserName(String username) 
    {
        
    }

    /**
     * This is the method that returns the password
     * @return studentPassword This is the password
     */
    @Override
    public String getPassword() 
    {
        return this.studentPassword;
    }

    /**
     * This is the method that sets the user-entered password to the local variable
     * @param password This is the user-entered password
     */
    @Override
    public void setPassword(String password) 
    {
        
    }
}
