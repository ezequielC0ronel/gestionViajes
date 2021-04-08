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
public abstract class Vehiculo {
    private String marca;
    private String patente;
    private Combustible tipoCombustible;
    private double costoPeaje;
    
    public Vehiculo(String marca, String patente, Combustible tipoCombustible, double costoPeaje){
        this.marca = marca;
        this.patente = patente;
        this.tipoCombustible = tipoCombustible;
        this.costoPeaje = costoPeaje;
    }
    
    public abstract double calcularCostoCombustible(double kmViaje);
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getPatente(){
        return this.patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCostoPeaje() {
        return costoPeaje;
    }

    public void setCostoPeaje(int costoPeaje) {
        this.costoPeaje = costoPeaje;
    }

    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }
    
    
    
    
}
