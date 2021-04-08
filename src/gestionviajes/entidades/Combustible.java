/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionviajes.entidades;

/**
 *
 * @author Ezequiel Coronel
 */
public class Combustible {
    
    private String tipoCombustible;
    private double precio;
    
    public Combustible(String tipoCombustible, double precio){
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }
    
    public String getTipoCombustible(){
        return this.tipoCombustible;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible =tipoCombustible;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
