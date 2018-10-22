package learn;
import static java.lang.Thread.sleep;
import java.util.Scanner;
/**
  * @Autor Johan Benavides
 */
public class Trick {
    static String black     = "\033[39m";
    static String red       = "\033[31m";
    public void imprimir(String[] cartas) throws InterruptedException
    {
        for(int i=0;i<cartas.length;i++){  
         sleep(600); 
         System.out.print(cartas[i]+"        ");
         if(i==2||i==5||i==8||i==11||i==14||i==17||i==20)
             System.out.print("\n");                        
        } 
    }        
    public String[] reordenar(String[] cartasmod, String[] cartas, int opcion){
        if(opcion==1){            
            cartasmod[0]=cartas[1];    cartasmod[1]=cartas[4];    cartasmod[2]=cartas[7];            cartasmod[3]=cartas[10];   cartasmod[4]=cartas[13];   cartasmod[5]=cartas[16];
            cartasmod[6]=cartas[19];   cartasmod[7]=cartas[0];    cartasmod[8]=cartas[3];            cartasmod[9]=cartas[6];    cartasmod[10]=cartas[9];   cartasmod[11]=cartas[12];
            cartasmod[12]=cartas[15];  cartasmod[13]=cartas[18];  cartasmod[14]=cartas[2];            cartasmod[15]=cartas[5];   cartasmod[16]=cartas[8];   cartasmod[17]=cartas[11];
            cartasmod[18]=cartas[14];  cartasmod[19]=cartas[17];  cartasmod[20]=cartas[20];
        }
        if(opcion==2){
            cartasmod[0]=cartas[0];    cartasmod[1]=cartas[3];    cartasmod[2]=cartas[6];            cartasmod[3]=cartas[9];    cartasmod[4]=cartas[12];   cartasmod[5]=cartas[15];
            cartasmod[6]=cartas[18];   cartasmod[7]=cartas[1];    cartasmod[8]=cartas[4];            cartasmod[9]=cartas[7];    cartasmod[10]=cartas[10];  cartasmod[11]=cartas[13];
            cartasmod[12]=cartas[16];  cartasmod[13]=cartas[19];  cartasmod[14]=cartas[2];            cartasmod[15]=cartas[5];   cartasmod[16]=cartas[8];   cartasmod[17]=cartas[11];
            cartasmod[18]=cartas[14];  cartasmod[19]=cartas[17];  cartasmod[20]=cartas[20];
        }   
        if(opcion==3){
            cartasmod[0]=cartas[0];    cartasmod[1]=cartas[3];    cartasmod[2]=cartas[6];            cartasmod[3]=cartas[9];    cartasmod[4]=cartas[12];   cartasmod[5]=cartas[15];
            cartasmod[6]=cartas[18];   cartasmod[7]=cartas[2];    cartasmod[8]=cartas[5];            cartasmod[9]=cartas[8];    cartasmod[10]=cartas[11];  cartasmod[11]=cartas[14];
            cartasmod[12]=cartas[17];  cartasmod[13]=cartas[20];  cartasmod[14]=cartas[1];            cartasmod[15]=cartas[4];   cartasmod[16]=cartas[7];   cartasmod[17]=cartas[10];
            cartasmod[18]=cartas[13];  cartasmod[19]=cartas[16];  cartasmod[20]=cartas[19];
        }    
    return cartasmod;
}
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * 
     */
    public static void main(String[] args) throws InterruptedException {
       
        Scanner leer = new Scanner(System.in);        
        Trick f = new Trick();
        
        String cartas[],cartasmod[];
        cartas = new String[21];
        cartasmod =new String[21];
        int numeroAleatorio = (int) (Math.random()*21);
        int opcion;
        
    cartas[0]=red+"A♥A";    cartas[1]=red+"2♥2";     cartas[2]=red+"3♥3";
    cartas[3]=red+"4♥4";    cartas[4]=red+"5♥5";    cartas[5]=red+"6♥6";
    cartas[6]=red+"7♥7";     cartas[7]=red+"8♥8";    cartas[8]=red+"9♥9"; 
    cartas[9]=red+"K♥K";    
    
    cartas[10]=red+"♥"+black+"J"+black+"♠";//Carta especial
    
    cartas[11]=black+"A♠A";     cartas[12]=black+"2♠2";     cartas[13]=black+"3♠3"; 
    cartas[14]=black+"4♠4";    cartas[15]=black+"5♠5";    cartas[16]=black+"6♠6"; 
    cartas[17]=black+"7♠7";    cartas[18]=black+"8♠8";    cartas[19]=black+"9♠9"; 
    cartas[20]=black+"K♠K";
    
    System.out.println("Observa las siguientes cartas y escoge solo una, tienes 10 segundos\n");
    sleep(2500); 
    
    for(int i=0;i<cartas.length;i++){  
         System.out.print(cartas[i]+"  ");                        
    }    
    sleep(10000);
    
    System.out.println("\n\nVamos a repartir las cartas...");
    sleep(2000);
    System.out.println("No pierdas de vista la tuya...\n");
    sleep(2000); 
    
    cartasmod=f.reordenar(cartasmod, cartas, 2);        
    f.imprimir(cartasmod);    
    System.arraycopy(cartasmod, 0, cartas, 0, 21);
    
    System.out.print("\nTu carta en cual grupo está 1, 2 o 3?   ");
    opcion=leer.nextInt();
    
    cartasmod=f.reordenar(cartasmod, cartas, opcion);
    System.out.println("\nVamos a repartir de nuevo las cartas...");
    sleep(1500);
    System.out.println("No pierdas de vista la tuya...\n");
    sleep(2000);        
    f.imprimir(cartasmod);    
    System.arraycopy(cartasmod, 0, cartas, 0, 21);        
    System.out.print("\nTu carta en cual grupo está 1, 2 o 3?   ");
    opcion=leer.nextInt();
    
    cartasmod=f.reordenar(cartasmod, cartas, opcion);
    System.out.println("\nVamos a repartir las cartas una vez más...");
    sleep(1500);
    System.out.println("No pierdas de vista la tuya...\n");
    sleep(2000);        
    f.imprimir(cartasmod);    
    System.out.print("\nTu carta en cual grupo está 1, 2 o 3?   ");
    opcion=leer.nextInt();
    
        switch (opcion) {
            case 1:
                System.out.print("\nTu carta es: ");
                for(int i=0;i<30;i++){
                    sleep(300);
                    System.out.print(".");
                }
                System.out.println("\t"+cartasmod[numeroAleatorio]+"\n");
                if( numeroAleatorio != 9){
                    sleep(3000);                
                    System.out.println("Espera, espera... era broma...\n");
                    sleep(3000);
                    System.out.print("Tu carta es: ");
                    for(int i=0;i<30;i++){
                      sleep(300);
                        System.out.print(".");
                    }
                    System.out.println("\t"+cartasmod[9]+"\n");
                }
                break;
            case 2:
                System.out.print("\nTu carta es: ");
                for(int i=0;i<30;i++){
                    sleep(300);
                    System.out.print(".");
                }
                System.out.println("\t"+cartasmod[numeroAleatorio]+"\n");
                if( numeroAleatorio != 10){
                    sleep(3000);                
                    System.out.println("Espera, espera... era broma...\n");
                    sleep(3000);
                    System.out.print("Tu carta es: ");
                    for(int i=0;i<30;i++){
                     sleep(300);
                     System.out.print(".");
                    }
                    System.out.println("\t"+cartasmod[10]+"\n");
                }
                break;
            default:
                System.out.print("\nTu carta es: ");
                for(int i=0;i<30;i++){
                    sleep(300);
                    System.out.print(".");
                }
                System.out.println("\t"+cartasmod[numeroAleatorio]+"\n");
                if( numeroAleatorio != 11){
                    sleep(3000);                
                    System.out.println("Espera, espera... era broma...\n");
                    sleep(3000);
                    System.out.print("Tu carta es: ");
                    for(int i=0;i<30;i++){
                       sleep(300);
                      System.out.print(".");
                    }
                    System.out.println("\t"+cartasmod[11]+"\n");
                }
                break;
        }               
    }    
}
