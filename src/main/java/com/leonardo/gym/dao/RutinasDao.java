/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.dao;

import com.leonardo.gym.model.Rutina;
import com.leonardo.gym.view.Rutinas;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Javy
 */
public class RutinasDao {
    
    ResultSet añadirDatos;
    
    
       public void insertarDetallesRutina(String id_cliente, String fecha_inicio, String fecha_final) throws ParseException {
           
           Rutina rutina=new Rutina();
           rutina.setIdCliente(Integer.parseInt(id_cliente));
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date parsed = format.parse(fecha_inicio);
             java.sql.Date sql1 = new java.sql.Date(parsed.getTime());
             
             Date parsed2 = format.parse(fecha_final);
             java.sql.Date sql2 = new java.sql.Date(parsed2.getTime());
            
           
            rutina.setFecha_inicio(sql1);
            rutina.setFecha_final( sql2);
            
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sql = "INSERT INTO Rutinas (id_cliente,fechaInicio,fechaFin) VALUES (" + rutina.getIdCliente() + ",'"
                    + rutina.getFecha_inicio() + "','" + rutina.getFecha_final() + "' )";

            sentencia.executeUpdate(sql);
            System.out.println("Se ha introducido un rutina ");

        } catch (ClassNotFoundException | SQLException cn) {
        }

    }
       
       
       public ResultSet ConsultarMaxId(){
           
           
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("SELECT max(id_rutina)+1 as nuevoIdRutina FROM Rutinas" );

           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;
        
        
           
           
       }
       public ResultSet ConsultarId(String id_rutina){
           
           
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("SELECT id_rutina as id FROM Rutinas where id_rutina="+ id_rutina);

           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;
        
        
           
           
       }
       
       public ResultSet ConsultarRutinas(String id){
           Rutina rutina=new Rutina();
           rutina.setIdCliente(Integer.parseInt(id));
           
           
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("SELECT id_rutina,id_cliente "
                    + ",DATE_FORMAT(fechaInicio,'%d-%m-%Y') as fechaInicio,DATE_FORMAT(fechaFin,'%d-%m-%Y') as fechaFin FROM Rutinas where id_cliente="+rutina.getIdCliente() );

           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;
        
       }
       
       public void borrarRutina(String id_rutina){
           Rutina rutina=new Rutina();
           rutina.setIdRutina(Integer.parseInt(id_rutina));
              try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");
                
                Statement sentencia = conexion.createStatement();
          

                 String sql = "Delete  FROM Rutinas where  id_rutina=" + rutina.getIdRutina()+"" ;
              sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
     
        
       }

       public  void actualizarRutinas(String fechaInicio,String fechaFin,String id_cliente) throws ParseException{
           
           Rutina rutina=new Rutina();
           rutina.setIdCliente(Integer.parseInt(id_cliente));
             SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
             Date parsed = format.parse(fechaInicio);
             java.sql.Date sql1 = new java.sql.Date(parsed.getTime());
             
             Date parsed2 = format.parse(fechaFin);
             java.sql.Date sql2 = new java.sql.Date(parsed2.getTime());
            
           
            rutina.setFecha_inicio(sql1);
            rutina.setFecha_final( sql2);
           
           
             try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sql="UPDATE Rutinas SET fechaInicio='"+rutina.getFecha_inicio()+"',fechaFin='"+rutina.getFecha_final()+"' where id_cliente="+rutina.getIdCliente()+"";

            sentencia.executeUpdate(sql);
           
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
      
           
       }
     }

