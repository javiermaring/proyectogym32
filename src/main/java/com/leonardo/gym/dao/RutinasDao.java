/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javy
 */
public class RutinasDao {
    
    ResultSet añadirDatos;
    
    
       public void insertarDetallesRutina(String id_cliente, String fecha_inicio, String fecha_final) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sql = "INSERT INTO Rutinas (id_cliente,fechaInicio,fechaFin) VALUES (" + id_cliente + ",'"
                    + fecha_inicio + "','" + fecha_final + "' )";

            sentencia.executeUpdate(sql);
            System.out.println("Se ha introducido un rutina ");

        } catch (ClassNotFoundException | SQLException cn) {
        }

    }
       
       
       public ResultSet ConsultarId(String id){
           
           
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("SELECT id_rutina FROM Rutinas where  id_cliente='" + id+"'" );

           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;
        
        
           
           
       }
       
       public ResultSet ConsultarRutinas(String id){
           
           
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("SELECT id_rutina,id_cliente "
                    + ",DATE_FORMAT(fechaInicio,'%d-%m-%Y') as fechaInicio,DATE_FORMAT(fechaFin,'%d-%m-%Y') as fechaFin FROM Rutinas where id_cliente="+id );

           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;
        
       }
       
       public void borrarRutina(String id_rutina){
              try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
                
                Statement sentencia = conexion.createStatement();
          

                 String sql = "Delete  FROM Rutinas where  id_rutina=" + id_rutina+"" ;
              sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
     
        
       }

       public  void actualizarRutinas(String fechaInicio,String fechaFin,String id_cliente){
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sql="UPDATE Rutinas SET fechaInicio='"+fechaInicio+"',fechaFin='"+fechaFin+"' where id_cliente="+id_cliente+"";

            sentencia.executeUpdate(sql);
           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
      
           
       }
     }

