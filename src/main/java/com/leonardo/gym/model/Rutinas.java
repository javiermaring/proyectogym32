/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.model;

import java.sql.Date;

/**
 *
 * @author Javy
 */
public class Rutinas {
    
    private int idRutina,idCliente;
    private Date fecha_inicio,fecha_final;

    public Rutinas(int idRutina, int idCliente, Date fecha_inicio, Date fecha_final) {
        this.idRutina = idRutina;
        this.idCliente = idCliente;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }
    
    
    
}
