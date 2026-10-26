/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author Usuario
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack lista = new MyStack();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.imprimir();
        System.out.println();
        lista.push(14);
        lista.imprimir();
        System.out.println();
        lista.push(15);
        lista.imprimir();
        lista.pop();
        System.out.println();
        lista.imprimir();

    }
    
}
