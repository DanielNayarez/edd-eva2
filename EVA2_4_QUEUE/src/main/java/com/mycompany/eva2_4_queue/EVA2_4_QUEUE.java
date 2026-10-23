/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_queue;

/**
 *
 * @author Usuario
 */
public class EVA2_4_QUEUE {

    public static void main(String[] args) {
      MyQueue lista = new MyQueue();
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
