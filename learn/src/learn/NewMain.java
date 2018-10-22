/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
class NewMain {
   private void print() {
     System.out.println("a");
   }
   private void print(String str) {
     System.out.println("b");
   }
   private void print(int x) {
     System.out.println("c");
   }		
   public static void main(String[ ] args) {	
     NewMain  object = new NewMain ();
     object.print(12);	
   }	
}
