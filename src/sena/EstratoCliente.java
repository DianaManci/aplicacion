/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

import java.util.Scanner;

/**
 *
 * @author manci
 */
public class EstratoCliente {
    short estrato;
    void pedirEstrato(){
        System.out.println("dijite su estracto");
        Scanner teclado =new Scanner(System.in);
        estrato=teclado.nextShort();
    }  
     void  clasificarEstrato(){
         if (estrato<3){
             System.out.println("estrato bajo");
         }else{
             System.out.println("estrato alto");
         }
         }
     
     public void ejecutar(){
         pedirEstrato();
         clasificarEstrato();
         
     }
}
    
