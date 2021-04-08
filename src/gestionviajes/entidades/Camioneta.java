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
public class Camioneta extends Vehiculo{
    
    public Camioneta(String marca, String patente, Combustible tipoCombustible, double costoPeaje){
        super(marca, patente, tipoCombustible, costoPeaje);
    }
    
    @Override
    public double calcularCostoCombustible(double kmViaje){
        double cantLitros = kmViaje * 10/100;
        return cantLitros * this.getTipoCombustible().getPrecio() /1;
    }
}