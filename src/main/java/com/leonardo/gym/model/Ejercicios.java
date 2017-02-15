/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.model;

import java.awt.Image;

/**
 *
 * @author Javy
 */
public class Ejercicios {
     private int id_ejercicio,id_musculo;
    private String nombre,descripcion;
    private Image imagen;

    public Ejercicios(int id_ejercicio, int id_musculo, String nombre, String descripcion, Image imagen) {
        this.id_ejercicio = id_ejercicio;
        this.id_musculo = id_musculo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public int getId_musculo() {
        return id_musculo;
    }

    public void setId_musculo(int id_musculo) {
        this.id_musculo = id_musculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    
    
}
