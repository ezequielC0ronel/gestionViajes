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
public class Viaje {
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private double distanciaCiudades;
    private int cantPeajes;
    private Vehiculo vehiculo;
    
    //No estan en la misma ruta.
    public Viaje(Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaCiudades, int cantPeajes,Vehiculo vehiculo){
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.distanciaCiudades = distanciaCiudades;
        this.cantPeajes = cantPeajes;
        this.vehiculo = vehiculo;
    }
    
    
    //Estan en la misma ruta, solo se muestra en que km estan.
    public Viaje(Ciudad ciudadOrigen, Ciudad ciudadDestino, int cantPeajes, Vehiculo vehiculo){
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.cantPeajes = cantPeajes;
        this.vehiculo = vehiculo;
    }
    
    
    public double calculoDistancia(){
        if(ciudadOrigen.getNroRuta() == ciudadDestino.getNroRuta()){
            this.distanciaCiudades = Math.abs(ciudadOrigen.getKmUbicacion() - ciudadDestino.getKmUbicacion());
        }
        
        return this.distanciaCiudades;
    }
    
    public double costoEnPeajes(){
        return vehiculo.getCostoPeaje() * this.cantPeajes;
    }
    
    public double costoEnCombustible(){
        return Math.round(vehiculo.calcularCostoCombustible(distanciaCiudades));
    }
    
    public void costoTotal(){
        System.out.println("Distancia del viaje: " + this.calculoDistancia()+ "km");
        System.out.println("Costo en peajes: "+ this.costoEnPeajes() + " pesos");
        System.out.println("Costo en combustible: " + this.costoEnCombustible() + "pesos");
        System.out.println("Costo total: " + (this.costoEnCombustible() + this.costoEnPeajes()) + " Pesos");
    }
}
