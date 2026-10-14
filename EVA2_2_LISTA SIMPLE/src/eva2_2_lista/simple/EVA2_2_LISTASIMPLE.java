/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista.simple;

/**
 *
 * @author nayar
 */
public class EVA2_2_LISTASIMPLE {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        /*int[]arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime(); // Tomamos la "hora" antes de empezar
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
        fin = System.nanoTime(); // Tomamos la "hora" despues de realizar el proceso
        tiempo = fin = ini;
        System.out.println("Tiempo arreglo = " + tiempo);
        
        ini = System.nanoTime(); // Tomamos la "hora" antes de empezar
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random()*100));
        }
        fin = System.nanoTime(); // Tomamos la "hora" despues de realizar el proceso
        tiempo = fin = ini;
        System.out.println("Tiempo lista = " + tiempo);*/
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamaño de la lista: " + lista.longitud());
        System.out.println("Valor en la posicion 0: " + lista.valorEn(0));
        System.out.println("Valor en la posicion 1: " + lista.valorEn(1));
        System.out.println("Valor en la posicion 2: " + lista.valorEn(2));
        System.out.println("Valor en la posicion 3: " + lista.valorEn(3));
        System.out.println("Valor en la posicion 4: " + lista.valorEn(4));
        System.out.println("Posicion del valor 100: " + lista.encontrarEn(100));
        System.out.println("Posicion del valor 200: " + lista.encontrarEn(200));
        System.out.println("Posicion del valor 300: " + lista.encontrarEn(300));
        System.out.println("Posicion del valor 400: " + lista.encontrarEn(400));
        System.out.println("Posicion del valor 500: " + lista.encontrarEn(500));
        System.out.println("Insertar el valor 500: ");
        lista.insertarEn(500, 0);
        lista.imprimir();
        System.out.println("Borrar en el valor 3: ");
        lista.borrarEn(3);
        lista.imprimir();
        System.out.println("Orden Inverso: ");
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimrInverso();
        
        
        
        
        
        
        
    }
    
}
