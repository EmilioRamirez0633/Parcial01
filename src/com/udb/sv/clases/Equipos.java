/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udb.sv.clases;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Estudiante
 */
public class Equipos {

    public List getJuga() {
        return juga;
    }

    public void setJuga(List juga) {
        this.juga = juga;
    }
    List juga;

    public void setnom(String nomEquipo){
        if(juga == null)
        {
            juga = new ArrayList<>();
        }else{
            juga.add(nomEquipo);
        }
    }
}
