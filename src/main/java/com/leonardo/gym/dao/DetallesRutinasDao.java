package com.leonardo.gym.dao;

import com.leonardo.gym.model.DetallesRutinas;
import com.mysql.jdbc.Connection;
import java.sql.*;

public class DetallesRutinasDao {

    ResultSet añadirDatos;

    public DetallesRutinasDao() {

    }

    public void insertarRutina(String id_rutina, String id_ejercicio, String repeticiones, String descansos, String nseries) {

        DetallesRutinas detRut = new DetallesRutinas();
        detRut.setIdDetalleRutina(Integer.parseInt(id_rutina));
        detRut.setIdEjercicio(Integer.parseInt(id_ejercicio));
        detRut.setRepeticiones(Integer.parseInt(repeticiones));
        detRut.setDescansos(Integer.parseInt(descansos));
        detRut.setnSeries(Integer.parseInt(nseries));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            String sql = "INSERT INTO DetallesRutinas (id_rutina,id_ejercicio,repeticiones,"
                    + "descansos,nseries) VALUES (" + detRut.getIdDetalleRutina() + ","
                    + detRut.getIdEjercicio() + "," + detRut.getRepeticiones() + "," + detRut.getDescansos() + "," + detRut.getnSeries() + " )";

            sentencia.executeUpdate(sql);
            System.out.println("Se ha introducido un Detallerutina ");

        } catch (ClassNotFoundException | SQLException cn) {

        }

    }

    public ResultSet ConsultarDetallesRutinas(String id) {

        DetallesRutinas detRut = new DetallesRutinas();
        detRut.setIdRutina(Integer.parseInt(id));

        try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio",
                    "davinci", "dam2davinci");
            Statement sentencia = conexion.createStatement();

            añadirDatos = sentencia.executeQuery("select d.nseries, d.descansos,"
                    + "d.repeticiones, e.id_ejercicio,e.nombre,e.descripcion from "
                    + "DetallesRutinas d join Ejercicios e on d.id_ejercicio=e.id_ejercicio where id_rutina=" + detRut.getIdRutina());

        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }
        return añadirDatos;

    }

    public void borrarDetallesRutina(String id_ejercicio) {
        DetallesRutinas detRut = new DetallesRutinas();
        detRut.setIdEjercicio(Integer.parseInt(id_ejercicio));
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3307/gimnasio", "davinci", "dam2davinci");

            Statement sentencia = conexion.createStatement();

            String sql = "Delete  FROM DetallesRutinas where  id_ejercicio=" + detRut.getIdEjercicio() + "";
            sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException cn) {
            System.out.println(cn.getMessage());
        }

    }

}
