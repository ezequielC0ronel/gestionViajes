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
public class Ciudad {
    private double kmUbicacion;
    private String nombreCiudad;
    private int nroRuta;
    
    public Ciudad(double kmUbicacion, String nombreCiudad, int nroRuta){
        this.kmUbicacion = kmUbicacion;
        this.nombreCiudad = nombreCiudad;
        this.nroRuta = nroRuta;
    }

    public double getKmUbicacion() {
        return kmUbicacion;
    }

    public void setKmUbicacion(double kmUbicacion) {
        this.kmUbicacion = kmUbicacion;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
    public int getNroRuta() {
        return nroRuta;
    }

    public void setNroRuta(int nroRuta) {
        this.nroRuta = nroRuta;
    }
    
    
}
