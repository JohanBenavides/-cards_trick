/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import static java.lang.Thread.sleep;


/**
 *
 * @author Usuario
 */
public class cartas {
    static String black     = "\033[39m";
    static String red       = "\033[31m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
    cartas f = new cartas();
    
    String cartas[];
    
    cartas = new String[51];
    cartas[0]=red+"♥A ";
    cartas[1]=red+"♥2 ";
    cartas[2]=red+"♥3 ";
    cartas[3]=red+"♥4 ";
    cartas[4]=red+"♥5 ";
    cartas[5]=red+"♥6 ";
    cartas[6]=red+"♥7 ";
    cartas[7]=red+"♥8 ";
    cartas[8]=red+"♥9 ";
    cartas[9]=red+"♥10";
    cartas[10]=red+"♥J ";
    cartas[11]=red+"♥Q ";
    cartas[12]=red+"♥K ";
    cartas[13]=black+"♦A ";
    cartas[14]=black+"♦2 ";
    cartas[15]=black+"♦3 ";
    cartas[16]=black+"♦4 ";
    cartas[17]=black+"♦5 ";
    cartas[18]=black+"♦6 ";
    cartas[19]=black+"♦7 ";
    cartas[20]=black+"♦8 ";
    cartas[21]=black+"♦9 ";
    cartas[22]=black+"♦10";
    cartas[23]=black+"♦J ";
    cartas[24]=black+"♦Q ";
    cartas[25]=black+"♦K ";
    cartas[26]=red+"♣A ";
    cartas[27]=red+"♣2 ";
    cartas[28]=red+"♣3 ";
    cartas[29]=red+"♣4 ";
    cartas[30]=red+"♣5 ";
    cartas[31]=red+"♣6 ";
    cartas[32]=red+"♣7 ";
    cartas[33]=red+"♣8 ";
    cartas[34]=red+"♣9 ";
    cartas[35]=red+"♣10";
    cartas[36]=red+"♣J ";
    cartas[37]=red+"♣Q ";
    cartas[38]=red+"♣K ";
    cartas[39]=black+"♠A ";
    cartas[40]=black+"♠2 ";
    cartas[41]=black+"♠3 ";
    cartas[42]=black+"♠4 ";
    cartas[43]=black+"♠5 ";
    cartas[44]=black+"♠6 ";
    cartas[45]=black+"♠7 ";
    cartas[46]=black+"♠8 ";
    cartas[47]=black+"♠9 ";
    cartas[48]=black+"♠10";
    cartas[49]=black+"♠J ";
    cartas[50]=black+"♠Q ";
    //cartas[51]=black+"♠K ";
        
    
  
for(int i=0;i<cartas.length;i++){  
         sleep(700); 
         System.out.print(cartas[i]+"     ");
         if(i==2||i==5||i==8||i==11||i==14||i==17||i==20)
             System.out.println("\n");
                        
        }
   
    
    }
    
    
}
