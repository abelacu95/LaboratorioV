import Ejercicio_1y2.Generic;
import Ejercicio_3.Pila;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1

        Generic <Integer> array1 = new Generic<Integer>();

        array1.add(2);
        array1.add(3);
        array1.add(1);
        array1.add(5);
        array1.add(4);

        System.out.println(array1.toString());

        //a) Verificar si un objeto existe en el array
        System.out.println(" Exist : " +array1.exist(4) );
        System.out.println(" Exist : " +array1.exist(0) );

        //b) Devolver el máximo
        System.out.println("Maximum Value : "+array1.maximumValue());

        //c) Devolver el mínimo
        System.out.println("Minimum Value : "+array1.minimumValue());

        System.out.println(array1.toString());


        //Ejercicio 2

        System.out.println("Last Value Deleted : "+array1.deleteObject());

        System.out.println(array1.toString());

        /*

        //Ejercicio 3 - Pila

        // Ejemplo con Enteros
        Pila<Integer> pilita = new Pila<Integer>();

        pilita.add(2);
        pilita.add(5);
        pilita.add(1);
        pilita.add(4);
        pilita.add(3);

        System.out.println(" Tope :  "+pilita.pop());

        System.out.println("Cantidad de elementos : "+pilita.size());

        // Ejemplo con Strings

        Pila<String> pilita2 = new Pila<String>();

        pilita2.add("Pablo");
        pilita2.add("Abel");
        pilita2.add("Tomas");
        pilita2.add("Santiago");

        System.out.println(" Tope :  "+pilita2.pop());

        System.out.println("Cantidad de elementos : "+pilita2.size());

*/


    }
}
