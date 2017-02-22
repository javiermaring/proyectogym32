package com.leonardo.gym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Clientes {

    public Clientes() {

    }
    ResultSet rs;

    public ResultSet busquedaID(String id) {
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", 
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where id_cliente=" + id);

        } catch (ClassNotFoundException | SQLException cn) {
        }
        return rs;
    }

    public ResultSet busquedaNombre(String nombre) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", 
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where nombre= '" + nombre + "'");
    
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return rs;
    }

    public ResultSet busquedaApellido(String apellido) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", 
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where apellidos like '%" + apellido + "%'");
     
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return rs;
    }

    public ResultSet busquedaNif(String nif) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", 
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where nif= '" + nif + "'");
     
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return rs;
    }

    public ResultSet busquedaTelefonoFijo(String telefonoFijo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where telefono_fijo=" + telefonoFijo);
   
        } catch (ClassNotFoundException | SQLException cn) {
            cn.getMessage();
        }
        return rs;
    }
        public ResultSet busquedaTelefonoMovil(String telefonoMovil) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", 
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where telefono_movil=" + telefonoMovil);

        } catch (ClassNotFoundException | SQLException cn) {
            cn.getMessage();
        }
        return rs;
    }

    public ResultSet busquedaEmail(String email) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            rs = sentencia.executeQuery("SELECT * FROM Clientes where email='" + email + "'");
    
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return rs;
    }
}
