package Ejercicio_1y2;

import java.util.ArrayList;
import java.util.List;

public class Generic<T extends Comparable> {

    private List<T> array;

    public Generic() {
        this.array = new ArrayList<T>();
    }

    public void add(T value){
        this.array.add(value);
    }


    //a) Verificar si un objeto existe en el array

    public boolean exist(Object value){

        for (T a : this.array ){

            if(a.equals(value))
                return true;
        }
        return false;
    }


    //b) Devolver el máximo

    public T maximumValue(){

        T value = this.array.get(0);

        for (int i=0 ; this.array.size() > i ; i++ ){

            if (this.array.get(i).compareTo(value) > 0) {
                value = array.get(i);
            }
        }
        return value;
    }


    //c) Devolver el mínimo
    public T minimumValue(){

        T value =   this.array.get(0);

        for (int i=0; this.array.size() > i ;i++ ){
            if (this.array.get(i).compareTo(value) < 0) {
                value = this.array.get(i);
            }
        }
        return value;
    }
    

    //Ejercicio 2 : Agregar un metodo para eliminar el ultimo objeto del array y lo devuelva por
    //parametro (Investigar la clase Arrays).

    public T deleteObject(){
        T value = null;
        for(int i=0; i<this.array.size() ;i++){

            if(i == this.array.size()-1){
                value = this.array.get(i);
                this.array.remove(i);
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "array=" + array +
                '}';
    }
}
