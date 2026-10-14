package eva2_2_lista.simple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nayar
 */
public class ListaSimple {
    private NODO inicio;
    private NODO fin;
    public ListaSimple(){
        inicio = null;// al crear la lista, se crea vacia
        fin = null;
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
            //movernos al final
            /*NODO temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo); // conecto nuevo al final de la lista*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        } 
    }
    // O(N)
    public void imprimir(){
       NODO temp = inicio;
       while(temp != null){
           System.out.println("[" + temp.getValor() + "]");
           temp = temp.getSiguiente();
       }
    }
    public void imprimrInverso(){
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
        int cont = 0;
       NODO temp = inicio;
       while(temp != null){
           cont++;
           temp = temp.getSiguiente();
       }
       return cont;
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
    }
    // Validar: posicion tenga un valor válido
    // O(N)                                 // throws
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
    // La primer aparicion del valor de la lista
    // Regresar la posicion
    // O(N)
    public int encontrarEn(int valor){
        boolean bande = false;
        int posi = 0;
        NODO temp = inicio;
        while(temp != null){
            if(valor == temp.getValor()){
                bande = true;
                break;
            }
            temp = temp.getSiguiente();
            posi++;
        }
        if(bande)
            return posi;
        else 
            return -1;
    }
    public void insertarEn(int valor, int posicion){
        if(posicion < 0 || posicion > longitud()){
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else {
            NODO nuevo = new NODO(valor);
            if(posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null){
                    fin = nuevo;
                }
            } else if(posicion == longitud()){
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else {
                NODO temp = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }
    public void borrarEn(int posicion){
        if(posicion < 0 || posicion >= longitud()){
            throw new RuntimeException("la posicion " + posicion + "no es valida para borrar");
        }
        if(posicion == 0){
            inicio = inicio.getSiguiente();
            if(inicio == null){
                fin = null;
            }
        }
        else {
            NODO temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if(temp.getSiguiente() == null){
                fin = temp;
            }
        }
    }
}  