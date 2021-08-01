/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camionesfunction;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class Camion {
    String Matricula;
    Byte Temperatura;
    double latitud;
    double longitud;

    public Camion() {
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setTemperatura(Byte Temperatura) {
        this.Temperatura = Temperatura;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getMatricula() {
        return Matricula;
    }

    public Byte getTemperatura() {
        return Temperatura;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
    
    
    
    public void movimiento(){
        Random r = new Random();
        double nlat,nlong;
        nlat = (r.nextDouble())/10;
        nlong = (r.nextDouble())/10;
        this.latitud=19.36+nlat;
        this.longitud=-99.19+nlong;
    }

    @Override
    public String toString() {
        return "Camion{" + "Matricula=" + Matricula + ", Temperatura=" + Temperatura + ", latitud=" + latitud + ", longitud=" + longitud + '}';
    }
    
    
}
