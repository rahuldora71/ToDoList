/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanagement;

import java.sql.*;
/**
 *
 * @author rahul
 */
public class DatabaseConnection {
    private static final String password="dbPassword";
    public static Connection getCon(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/taskmanagement","root","password");
            return con;
        }
        catch(Exception e){
            return null;
        }
    } 
}     
    

    
    

