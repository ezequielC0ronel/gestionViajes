/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionviajes.principal;
import gestionviajes.entidades.*;
/**
 *
 * @author Ezequiel Coronel
 */
public class GestionViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad(15,"Villa Mercedes",7);
        Ciudad ciudad2 = new Ciudad(10,"San Luis",7);
        
        Ciudad ciudad3 = new Ciudad(20,"Buenos Aires",9);
        Ciudad ciudad4 = new Ciudad(80,"Cordoba",21);
        
        Combustible nafta = new Combustible("Nafta súper",81.70);
        Combustible infinia = new Combustible("Infinia",93.90);
        Combustible dieselInfinia = new Combustible("Diesel Infinia",91.20);
        
        Auto auto1 = new Auto("Ford","BDF230", nafta, 80);
        Camioneta camioneta1 = new Camioneta("Chevrolet", "VWX998", infinia, 80);
        Camion camion1 = new Camion("Scania", "BFG300", dieselInfinia, 130);
        
//        Viaje slVm = new Viaje(ciudad1, ciudad2, 3, auto1);
//        slVm.costoTotal();

        Viaje bsCb = new Viaje(ciudad3, ciudad4, 685.5, 4, camioneta1);
        bsCb.costoTotal();
        
    }
    
}
