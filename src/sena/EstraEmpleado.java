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
public class EstraEmpleado {
    int estrato;
     public void pedirEstrato(){
        Scanner teclado =new Scanner(System.in);
        System.out.println("escribe el estrato");
        estrato=teclado.nextInt();
    }
        String cuidad,nombreCompleto;
        float estatura;
        double distancia;
        
        void pedircuidad(){
        Scanner teclado =new Scanner(System.in);
        System.out.println("escriba la cuidad");
        cuidad=teclado.next();
        System.out.println("escriba la estatura");
        estatura=teclado.nextFloat();
        System.out.println("escriba la distancia");
        distancia=teclado.nextDouble();
        System.out.println("escriba nombres y apellidos");
        nombreCompleto=teclado.nextLine();
        
    }
    
    
    
}
