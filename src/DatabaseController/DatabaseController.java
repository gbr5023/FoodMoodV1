/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseController;

import java.sql.Connection;

/**
 *
 * @author michaelcavallaro
 */
public interface DatabaseController {
    final String DB_NAME="";
    final String DB_HOST="";
    final String DB_USERNAME="";
    final String DB_PASSWORD="";
    
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
    boolean executeNonUpdateQuery(Connection con, String sql);
    
    /**
     * Executes a new update query
     * @param con Connection to given database
     * @param sql Statement string to be executed
     * @return Result will be true if statement executed without error
     */
    boolean executeQuery(Connection con, String sql);
}
