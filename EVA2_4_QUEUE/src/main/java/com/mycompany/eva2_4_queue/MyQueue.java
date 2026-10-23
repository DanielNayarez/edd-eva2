/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_queue;

/**
 *
 * @author Usuario
 */
public class MyQueue {
    private NODO inicio;
   private NODO fin;
   private int tama;
   
   public MyQueue(){
        inicio = null;// al crear la lista, se crea vacia
        fin = null;
    }
   // O(N)
    public void imprimir(){
       NODO temp = inicio;
       while(temp != null){
           System.out.println("[" + temp.getValor() + "]");
           temp = temp.getSiguiente();
       }
    }
    public void ImprimirInverso(){
       for (int i = longitud() - 1; i >= 0; i--) { 
        NODO temp = inicio;
        for (int j = 0; j < i; j++) {
            temp = temp.getSiguiente();
        }
        System.out.print("[" + temp.getValor() + "] ");
    }
    System.out.println();
    }
    // O(N)
    public int longitud(){
       return tama;
    }
    //O(1)
    public boolean listaVacia(){
      if(inicio == null){ // lista vacia verdadero
            return true;
        } else { // Lista con nodos
          return false;
      } 
    }
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    // Siempre se agregan al final de la lista
    //  Version: 1 O(N) ---> Se agrega al final se recorren todos
    //  Version Mejorada: 0(1) ---> Con nodo fin, ya no se recorren todos
    public void agregar(int valor){
        NODO nuevo = new NODO(valor); // creo el nodo para el valor a insertar
        if(inicio == null){ // lista vacia verdadero
            inicio = nuevo;
            fin = nuevo;// nuevo es el primer nodo de la lista
        } else { // Lista con nodos
            fin.setSiguiente(nuevo);
            // Conectar previo
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        this.tama++;
    }
    public void insertarEn(int valor, int posicion) {
    if (posicion < 0 || posicion > longitud()) {
        throw new IndexOutOfBoundsException("Posicion no valida");
    }
    
    NODO nuevo = new NODO(valor);
    
    if (posicion == 0) {
        // Insertar al inicio
        if (inicio == null) { // Lista vacía
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setPrevio(nuevo);
            inicio = nuevo;
        }
    } else if (posicion == longitud()) {
        // Insertar al final
        nuevo.setPrevio(fin);
        fin.setSiguiente(nuevo);
        fin = nuevo;
    } else {
        // Insertar en medio
        NODO temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        NODO siguienteNodo = temp.getSiguiente();
        
        nuevo.setSiguiente(siguienteNodo);
        nuevo.setPrevio(temp);
        
        temp.setSiguiente(nuevo);
        if (siguienteNodo != null) {
            siguienteNodo.setPrevio(nuevo);
        }
    }
    this.tama++;
}
     public void borrarEn(int posicion) {
    if (posicion < 0 || posicion >= longitud()) {
        throw new RuntimeException("La posicion " + posicion + " no es valida para borrar");
    }
    
    if (posicion == 0) {
        // Borrar el primero
        inicio = inicio.getSiguiente();
        if (inicio != null) {
            inicio.setPrevio(null);
        } else {
            fin = null; // La lista se quedó vacía
        }
    } else if (posicion == longitud() - 1) {
        // Borrar el último
        fin = fin.getPrevio();
        if (fin != null) {
            fin.setSiguiente(null);
        } else {
            inicio = null;
        }
    } else {
        // Borrar en medio
        NODO temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        
        NODO previo = temp.getPrevio();
        NODO siguiente = temp.getSiguiente();
        
        if (previo != null) {
            previo.setSiguiente(siguiente);
        }
        if (siguiente != null) {
            siguiente.setPrevio(previo);
        }
    }
    this.tama--;
   }
     public int valorEn(int posicion) throws RuntimeException{
       // excepcion
        // Validar posicion
        // que posiciones son validas? de 0 a n -1 (n es la cantidad de nodos)
        int tama = longitud();
         if(posicion >= 0 && posicion < tama){
             NODO temp = inicio;
             for (int i = 0; i < posicion; i++) {    
                temp = temp.getSiguiente(); 
             }
             return temp.getValor();
         }else{
             throw new RuntimeException("la posicion " + posicion + " no es valida!" );
             
         }
   }
     //QUEUE --> FIFO(PRIMERO EN LLEGAR PRIMERO EN SALIR)
     //AGREGAR UN VALOR AL FINAL DE LISTA
     public void push(int valor){
        agregar(valor); 
     }
     //LEE EL VALOR DIRECTAMENTE ACCESIBLE SIN BORRARLO
     public int peek(){
         return valorEn(0);
     }
     //LEE EL VALOR DIRECTAMENTE ACCESIBLE Y DESPUES LO BORRA
     public int pop(){
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
     }
}
