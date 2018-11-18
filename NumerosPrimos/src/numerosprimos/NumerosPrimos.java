/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author soler
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     int actual= 90;
     int anterior = actual - 1;
     int resultado;
     for(int i=2; i<=anterior; i++){
         resultado=actual%i;
     if(resultado==0){
         System.out.println("el numero no es primo");
         break;
     }
     else if(i==anterior){
         System.out.println("el numero es primo");
         break;
     }
    }
}
} 
