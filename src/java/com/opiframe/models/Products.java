/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opiframe.models;

/* this is Plain Old Java Object (POJO) */ 
public class Products {
    
    private String nimi;
    private double hinta;
    private int maara;
    private int id;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        
        this.nimi = nimi;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        if(hinta >= 0.0d){
            this.hinta = hinta;
        }
        else{
            this.hinta = 0.0d;
        }
            
    }

    public int getMaara() {
        return maara;
    }

    public void setMaara(int maara) {
        if(maara < 0){
            this.maara = maara;
        }
        else{
            this.maara = 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
