/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodmoodv1;

import CrudUserProfileController.LoginController;
import NavigationController.NavigationController;
import java.io.File;

/**
 *
 * @author gbr5023
 */
public class FoodMoodV1 
{

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        File newFile = new File(".");
        System.out.println(newFile.getAbsolutePath());
        // TODO code application logic here
        NavigationController theNavigationController = new NavigationController();
        //LoginController theLoginController = new LoginController();
    }

}
