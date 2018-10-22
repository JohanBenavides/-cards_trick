/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class test2 {
    static String black     = "\033[39m";
    static String red       = "\033[31m";
    public void imprimir(String cartas[]){    
        
        for(int i=0;i<cartas.length;i++){
         System.out.println(cartas[i]+"     "+cartas[i+1]+"     "+cartas[i+2]);
         i+=2;                 
        } 
    } 

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        String cartas[],cartasmod[];
        test2 f = new test2();
        int opcion;
   
    cartas = new String[9];
    cartasmod =new String[9];
    
    cartas[0]=red+"♥A ";
    cartas[1]=red+"♥2 ";
    cartas[2]=red+"♥3 ";
    cartas[3]=red+"♥4 ";
    cartas[4]=red+"♥5 ";
    cartas[5]=red+"♥6 ";
    cartas[6]=red+"♥7 ";
    cartas[7]=red+"♥8 ";
    cartas[8]=red+"♥9 ";
      
    System.out.println("Observa las siguientes cartas y escoje una\n");
    f.imprimir(cartas);
    
    System.out.print("\ntu carta en cual grupo esta 1, 2 o 3 ??:");
    opcion=leer.nextInt();
    
    if(opcion==1){
    cartasmod[0]=cartas[1];
    cartasmod[1]=cartas[4];
    cartasmod[2]=cartas[7];
    cartasmod[3]=cartas[0];
    cartasmod[4]=cartas[3];
    cartasmod[5]=cartas[6];
    cartasmod[6]=cartas[2];
    cartasmod[7]=cartas[5];
    cartasmod[8]=cartas[8];
    }
    if(opcion==2){
    cartasmod[0]=cartas[0];
    cartasmod[1]=cartas[3];
    cartasmod[2]=cartas[6];
    cartasmod[3]=cartas[1];
    cartasmod[4]=cartas[4];
    cartasmod[5]=cartas[7];
    cartasmod[6]=cartas[2];
    cartasmod[7]=cartas[5];
    cartasmod[8]=cartas[8];
    }   
    if(opcion==3){
    cartasmod[0]=cartas[0];
    cartasmod[1]=cartas[3];
    cartasmod[2]=cartas[6];
    cartasmod[3]=cartas[2];
    cartasmod[4]=cartas[5];
    cartasmod[5]=cartas[8];
    cartasmod[6]=cartas[1];
    cartasmod[7]=cartas[4];
    cartasmod[8]=cartas[7];
    }    
    System.out.print("\n");
    f.imprimir(cartasmod);
    
    System.out.print(black+"\ntu carta en cual grupo esta 1, 2 o 3?");
    opcion=leer.nextInt();
    if(opcion==1){
        System.out.println("\ntu carta es :"+cartasmod[3]);
    }
    if(opcion==2){
        System.out.println("\ntu carta es :"+cartasmod[4]);        
    }
    if(opcion==3){
        System.out.println("\ntu carta es :"+cartasmod[5]);        
    }
       
    }
    
}

