/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseController;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author michaelcavallaro
 */
public interface DatabaseController {
    final String DB_NAME="FoodMood";
    final String DB_HOST="jdbc:derby://localhost:1527/";
    final String DB_USERNAME="ist412";
    final String DB_PASSWORD="ist412";
    
    /**
     * Returns a new connection to the system's database
     * @return The connection to be used
     */
    Connection newConnection();
    
    /**
     * Executes a new non-update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    ResultSet executeNonUpdateQuery(Connection con, String sql);
    
    /**
     * Executes a new update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    int executeQuery(Connection con, String sql);
}
