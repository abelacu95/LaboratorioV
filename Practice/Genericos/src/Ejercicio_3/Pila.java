package Ejercicio_3;

import java.util.ArrayList;

public class Pila<T> {

    private Nodo<T> first;

    private Nodo<T> getFirst(){
        return this.first;
    }

    //push : Agrega un elemento a la Pila

    public void add(T value){

        if( first == null){
            this.first = new Nodo<T>(value);
        }
        else{
            Nodo<T> next = first;

            while( next.getNext() != null){
                next = next.getNext();
            }

            next.setNext(new Nodo<T>(value));
        }
    }

    //pop : Tomar el primer elemento de la pila y lo devuelve
    public T pop( ){

        if( first == null){
            return null;
        }
        else{
            Nodo<T> next = first;

            while( next.getNext() != null){
                next = next.getNext();
            }

            return next.getData();
        }
    }


    //size : Cuenta la cantidad de elementos que hay en la Pila

    public int size(){
        int i = 1;

        if( first == null){
            return 0;
        }
        else{
            Nodo<T> next = first;

            while( next.getNext() != null){
                next = next.getNext();
                i++;
            }

            return i;
        }

    }

}
