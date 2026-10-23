/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_tipos_genericos;

/**
 *
 * @author Usuario
 */
public class EVA2_6_TIPOS_GENERICOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // int --> Integer, double --> Double
      Ejemplo <Integer> prueba = new Ejemplo<String>();
   }
   
}
class ListaDoble()
class Ejemplo <T>{
   private T dato;
   
   public Ejemplo(){
   }
   
   public Ejemplo(T dato){
      this.dato = dato;
   }
   
   public int getDato(){
      return dato;
   }
   
   public void setDato(){
      this.dato = dato;
   }
}

