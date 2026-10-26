/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author nayar
 */
public class MyStack {
    private NODO inicio;
    private NODO fin;

    public MyStack(){
        inicio = null;
        fin = null;
    }
    public void agregar(int valor){
        NODO nuevo = new NODO(valor);//creamos nodo para el valor a insertar
        //y luego ??
        if (inicio == null){ //lista vacia?
            inicio = nuevo;
            fin = nuevo;
        } else{
            /*Nodos   temp = inicio;
            while (temp.getSiguiente() != null) { 
                temp = temp.getSiguiente();*/ // ya no necesitamos recorrer la lista, ya tenemos el fin
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }

    public void imprimir(){
        NODO  temp = inicio;
        while (temp != null) {
            System.out.print("["+ temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
    }
    
    public void imprimirInv(){
    NODO temp = fin;
    while (temp != null) {
        System.out.print("[" + temp.getValor() + "] ");
        temp = temp.getPrevio();
    }
    System.out.println();

    
    }

    
    public int longitud(){
        NODO temp = inicio;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    //longitud o(1)
    public int longitud2(){
       return this.longitud();
    }
    public boolean listaVacia(){
         if (inicio == null){ 
            return true;
         }else 
            return false;

        }
    public void vaciarLista(){
        inicio = null;
        fin = null;
        }
        //Insertar en 
        public void InsertarEn(int posicion, int valor){
            if (posicion < 0 || posicion > this.longitud()) {
                System.out.println("Posición inválida");
                return;
            }
            NODO nuevo = new NODO(valor);
            if (posicion == 0) {
                nuevo.setSiguiente(inicio);
                if (inicio != null) {
                    inicio.setPrevio(nuevo);
                }
                inicio = nuevo;
                if (fin == null) {
                    fin = nuevo;
                }
            } else if (posicion == this.longitud()) {
                fin.setSiguiente(nuevo);
                nuevo.setPrevio(fin);
                fin = nuevo;
            } else {
                NODO temp = inicio;
                for (int i = 0; i < posicion; i++) {
                    temp = temp.getSiguiente();
                }
                NODO previo = temp.getPrevio();
                previo.setSiguiente(nuevo);
                nuevo.setPrevio(previo);
                nuevo.setSiguiente(temp);
                temp.setPrevio(nuevo);
            }

        }
        //Eliminar en
        public void EliminarEn(int posicion){
            if (posicion < 0 || posicion >= this.longitud()) {
                System.out.println("Posición inválida");
                return;
            }
            NODO temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            NODO anterior = temp.getPrevio();
            NODO siguiente = temp.getSiguiente();
            if (anterior != null) {
                anterior.setSiguiente(siguiente);
            } else {
                inicio = siguiente;
            }
            if (siguiente != null) {
                siguiente.setPrevio(anterior);
            } else {
                fin = anterior;
            }
        }
        public int valorEn(int posicion ) {
            //excepción
            //validar posicion 
            posicion = posicion - 1; // Ajustar la posición para que sea cero-indexada
            if (posicion < -1 || posicion >= longitud()) {
                throw new IndexOutOfBoundsException("Posición inválida: " + (posicion + 1));
            }
            NODO temp = inicio;
            for (int i = -1; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }
        public void borrarEn(int posicion){
            //primero validamos la posicion
            if (posicion <0 || posicion >= longitud()){
                throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
            } else if (posicion == 0) { 
                inicio = inicio.getSiguiente();
                if (inicio == null) { // Si la lista queda vacía, actualizar fin
                    fin = null;
                } else {
                    inicio.setPrevio(null); // el nuevo primero ya no tiene anterior
                }
            } else {
                NODO temp = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                
                if (temp.getSiguiente() == null) { // Si se borró el último nodo, actualizar fin
                    fin = temp;
                } else {
                    temp.getSiguiente().setPrevio(temp); // reconectar el anterior
                }
            }
        }   
        //Esto es para stack (LIFO): se agrega y se saca por el mismo extremo (el fin = tope)
        //Public void push Agrega un valor en el tope
        public void push (int valor){
            agregar (valor);
        }
        //public int peek Lee el valor del tope (último nodo) sin eliminarlo
        public int peek (){
            if (fin == null) {
                throw new java.util.EmptyStackException();
            }
            return fin.getValor();
        }
        //public int pop Elimina el tope (último nodo) y regresa su valor
        public int pop () {
            if (fin == null) {
                throw new java.util.EmptyStackException();
            }
            int valor = fin.getValor(); // Obtener el valor del tope
            fin = fin.getPrevio();    // El tope ahora es el nodo anterior
            if (fin == null) {          // Si la pila queda vacía, actualizar inicio
                inicio = null;
            } else {
                fin.setSiguiente(null); // Cortar el enlace al nodo eliminado
            }
            return valor; // Devolver el valor eliminado
        }

}
