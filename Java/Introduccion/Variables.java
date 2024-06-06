package Introduccion;

public class Variables {
    /*
    Las variables sirven como un contenedor a fin de guardar
    un valor que puede cambiar o no durante la ejecución de un programa.
     */

    public static void main(String[] args) {
        //Declaración de variables y tipos de datos.

        /*
        Estructura.
        Tipo de dato + nombre de variable + simbolo de asignación ( = ) + Valor
         */
        String hola = "Hola mundo"; //Declaración de variable hola tipo cadena de caracter

        /*
        Declaración de variable sin valor.
        Tipo de dato + nombre de la variable.
         */
        int edad; //Tipo numerica entera
        float altura; //Tipo numerica con decimal
        double peso; //Tipo numerica con decimal
        char inicial; //Tipo caracter
        boolean verdad; //Tipo Boolean. Verdadero o Falso / 0 o 1

        //Asignación de valores a las variables
        edad = 21;
        altura= 1.72f;
        peso = 72.0;
        inicial = 'H';
        verdad = true;


        //Muestra valor por consola
        System.out.println(hola);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(inicial);
        System.out.println(verdad);
    }
}
