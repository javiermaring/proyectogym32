/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.model;

/**
 *
 * @author Javy
 */
public class DetallesRutinas {
   private int idDetalleRutina,idEjercicio,idRutina; 
    private int repeticiones,nSeries;
    private float descansos;

    public DetallesRutinas(int idDetalleRutina, int idEjercicio, int idRutina, int repeticiones, int nSeries, float descansos) {
        this.idDetalleRutina = idDetalleRutina;
        this.idEjercicio = idEjercicio;
        this.idRutina = idRutina;
        this.repeticiones = repeticiones;
        this.nSeries = nSeries;
        this.descansos = descansos;
    }

    public DetallesRutinas() {
        
         this.idDetalleRutina = 0;
        this.idEjercicio = 0;
        this.idRutina = 0;
        this.repeticiones = 0;
        this.nSeries = 0;
        this.descansos =0;
        
    }
    
    
    

    public int getIdDetalleRutina() {
        return idDetalleRutina;
    }

    public void setIdDetalleRutina(int idDetalleRutina) {
        this.idDetalleRutina = idDetalleRutina;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getnSeries() {
        return nSeries;
    }

    public void setnSeries(int nSeries) {
        this.nSeries = nSeries;
    }

    public float getDescansos() {
        return descansos;
    }

    public void setDescansos(float descansos) {
        this.descansos = descansos;
    }
    
    
}
