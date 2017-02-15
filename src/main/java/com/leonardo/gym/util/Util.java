/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.gym.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Javy
 */
public class Util {

    public Util() {
    }
 
    
    
    
    public int CalcularEdad(String fecha_nac){
        

    Date fechaActual = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd");
    String hoy = formato.format(fechaActual);
    String[] dat1 = fecha_nac.split("-");
    String[] dat2 = hoy.split("/");
    int anos = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
    int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
    if (mes < 0) {
      anos = anos - 1;
    } else if (mes == 0) {
      int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
      if (dia > 0) {
        anos = anos - 1;
      }
    }
    return anos;
  }
        
    }
