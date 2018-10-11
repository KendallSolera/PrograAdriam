/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author Kendall
 */
public class Cajero {
    public static void main(String[] args) {
     Cajero CajeroBAC = new Cajero();
     CajeroBAC.dineroCuenta = 8 ;
     CajeroBAC.dineroRetiro = 9 ;
     CajeroBAC.procesoCajero(CajeroBAC.dineroCuenta,CajeroBAC.dineroRetiro);
    }
    int dineroCuenta;
    int dineroRetiro;
    
    public void procesoCajero(int Cuenta, int Retiro ){
     if (Cuenta>Retiro){
         System.out.println("su retiro es posible");
     }
     else{
        System.out.println("su retiro es imposible");
     }
     
    } 
    
}
