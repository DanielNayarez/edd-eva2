/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_queue;

/**
 *
 * @author nayar
 */
public class NODO {
    //DOS ATRIBUTOS
    private int valor;
    private NODO siguiente;
    private NODO previo;
    // CONSTRUCTORES
    public NODO(){
        siguiente = null;
        previo = null;// ESTO ES MUY IMPORTANTE
    }
    public NODO(int dato){ // PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = dato;
        siguiente = null;
        previo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
    }

   public NODO getPrevio() {
      return previo;
   }

   public void setPrevio(NODO previo) {
      this.previo = previo;
   }
    
}
