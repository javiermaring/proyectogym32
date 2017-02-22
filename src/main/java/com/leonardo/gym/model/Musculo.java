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
public class Musculo {
    private int id_musculo;
    private String nombre;

    
        public Musculo(int id_musculo, String nombre) {
        this.id_musculo = id_musculo;
        this.nombre = nombre;
    }

    public Musculo() {
        
         this.id_musculo = 0;
        this.nombre = "";
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


    
    
    
}

