/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev2_8_recursividad;

/**
 *
 * @author Usuario
 */
public class EV2_8_RECURSIVIDAD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      imprimirCiclo(5);
      imprimirRecu(5);
   }
   
   public static void imprimirCiclo(int numero){
      for (int i = numero; i >= 1; i--) {
         System.out.print(i + " - ");
      }
      System.out.println("");
   }
   public static void imprimirRecu(int numero){
      // RESUELVA UNA PARTE DEL PROBLEMA
      System.out.print(numero + " - ");
      // SE LLAME A SI MISMO
      if(numero > 1) // DETENER LA RECURSIVIDAD
         imprimirRecu(numero - 1);
      
   }
}
