/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Util {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String IP="localhost";
        String instanceName="DESKTOP-I86L24K\\SQLEXPRESS";
        String port="1433";
        String uid="sa";
        String pwd="12345";
        String db="DentalClinicSystem";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://" +IP+"\\"+ instanceName+":"+port
                 +";databasename="+db+";user="+uid+";password="+pwd;
        Class.forName(driver);
        conn=DriverManager.getConnection(url);
        return conn;
    }
}
