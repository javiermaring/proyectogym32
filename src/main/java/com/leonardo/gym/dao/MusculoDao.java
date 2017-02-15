/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javy
 */
public class MusculoDao {

        
          ResultSet añadirDatos;
    
    public ResultSet AñadirMusculo(){
        
          try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("SELECT nombre FROM Musculos");

           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;
        
        
        
    }
    }

