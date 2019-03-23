/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacredito;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author David
 */
public class Persona implements Serializable {
    private int identificacion;
    private String nombre;
    private String apellidos;
    

    HashMap<Integer, Reportes> reporte;
    
    public Persona(int identificacion, String nombre, String apellidos, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        
        this.reporte = new HashMap();
    }

    

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

    /**
     * @return the reporte
     */
    public HashMap<Integer, Reportes> getReporte() {
        return reporte;
    }
    
    public void setReportes(HashMap<Integer, Reportes> reporte){
        this.reporte = reporte;
    }

    
    
}
