/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camionesfunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CamionesFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        short i;
        ArrayList<Camion> c =  new ArrayList();
        
        Scanner sc=new Scanner(new FileReader("latlongtrenes.txt"));
        for(i=0;i<=5;i++){
            sc.next();
        }
        while (sc.hasNext()){
            Camion cam = new Camion();
            cam.setMatricula(sc.next());
            cam.setTemperatura(sc.nextByte());
            cam.setLatitud(sc.nextDouble());
            cam.setLongitud(sc.nextDouble());
            System.out.println(cam);
            c.add(cam);
        }
        try {
        FileWriter fos = new FileWriter("latlongtrenes.txt");
        PrintWriter dos = new PrintWriter(fos);
        dos.print("Matricula\tNivel de Temperatura\tLatitud\tLongitud\t");
        for(i=0;i<c.size();i++){
            c.get(i).movimiento();
            dos.print(c.get(i).getMatricula()+"\t");
            dos.print(c.get(i).getTemperatura()+"\t");
            dos.print(c.get(i).getLatitud()+"\t");
            dos.print(c.get(i).getLongitud()+"\t");
        }
        dos.close();
        fos.close();
        } catch (IOException e) {
        System.out.println("Error Printing Tab Delimited File");
        }
    }
    
}
