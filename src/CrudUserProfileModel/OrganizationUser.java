/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CrudUserProfileModel;

/**
 *
 * @author Gisward
 */
public class OrganizationUser implements UserInterface
{
    String organizationUserName;
    String organizationPassword;

    /**
     * This is the default constructor of the OrganizationUser class
     * It captures the new username and password
     * It creates a new OrganizationUser object
     * @param organizationUserName
     * @param organizationPassword 
     */
    public OrganizationUser(String organizationUserName, String organizationPassword)
    {
        
    }
    
    /**
     * This is the method that returns the username
     * @return organizationUserName This is the username
     */
    @Override
    public String getUserName() 
    {
        return this.organizationUserName;
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
     * @return organizationPassword This is the password
     */
    @Override
    public String getPassword() 
    {
        return this.organizationPassword;
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
