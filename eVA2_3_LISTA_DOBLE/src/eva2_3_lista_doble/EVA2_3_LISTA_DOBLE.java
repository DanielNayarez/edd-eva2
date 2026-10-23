/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author Usuario
 */
public class EVA2_3_LISTA_DOBLE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      ListaDoble lista = new ListaDoble();
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      lista.imprimir();
      System.out.println("Orden Inverso: ");
      lista.ImprimirInverso();
      System.out.println("Insertar en el valor 3: ");
      lista.insertarEn(300, 0);
      lista.imprimir();
      System.out.println("Borrar en el valor 2: ");
      lista.borrarEn(2);
      lista.imprimir();
      
   }
   
}
