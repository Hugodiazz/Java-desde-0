package Introduccion;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        Switch case es una estructura que permite evaluar una variable y ejecutar un bloque de código
        dependiendo del valor de la variable. Es más eficiente que usar if-else cuando se tienen múltiples condiciones
         */

        int dia = 8; //Variable a evaluar
        String nombreDia; //Variable para almacenar el valor del día

        switch(dia){ //Se evalua el valor de la variable dia
            case 1: //Si el valor de dia es 1
                nombreDia = "Domingo"; //Se asigna el valor "Domingo" a la variable nombreDia.
                break; //Se sale del switch.
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "Día invalido";
                break;
        }
        System.out.println("El dia es: " + nombreDia); //Imprime en consola el valor de la variable nombreDia.
    }
}
