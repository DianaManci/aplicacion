/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

/**
 *
 * @author manci
 */
public class ActividadCiclos {
    String[]listasNombres=new String[10];  
    
    
    public void cicloMientas(){
    listasNombres=new String[11];
    listasNombres[0]="Edward Snowden";
    listasNombres[1]="Bill Gates";
    listasNombres[2]="Steven Jobs";
    listasNombres[3]="Mark Zukerberg";
    listasNombres[4]="German Cruz";
    listasNombres[5]="Linus Tovards";
    listasNombres[6]="Grigori Perelman";
    listasNombres[7]="Terrence Tao";
    listasNombres[8]="James Gosling";
    listasNombres[9]="Steven Wozniak";
    listasNombres[10]="Stephen Hawking";
    
    int i=0;
    while (i<listasNombres.length){
        if (listasNombres[i].endsWith("s")){
            System.out.println("el aprendiz"+i+"es"+listasNombres[i]);
        }
    
    i++;
    }
    }
    void comienzanpoSt(){
        int i=0;
        do{
            if (listasNombres[i].startsWith("St")){
                System.out.println("el aprendiz"+i+"es"+listasNombres[i]);
            }
        i++;
        } while(i<listasNombres.length);
    
    
    }
}

  