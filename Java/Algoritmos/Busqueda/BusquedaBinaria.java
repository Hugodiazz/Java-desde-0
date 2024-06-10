package Algoritmos.Busqueda;

import java.util.Scanner;
public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //Declaración de un objeto Scanner para leer datos del usuario

        int[] lista = new int[101]; //Declaración de un arreglo de 101 elementos

        for (int i = 0; i < 101; i++) { //Ciclo para llenar el arreglo con números del 0 al 100
            lista[i] = i;
        }

        System.out.println("Que numero deseas buscar entre el 0 y el 100?: ");

        int entrada = lector.nextInt(); //Entrada del usuario

        System.out.println("El numero se encuentra en la posicion: " + busquedaBinaria(lista, entrada)); //Llamada al método de busqueda binaria pasando
    }

    //Funcion de busqueda binaria. Recibe un arreglo y un número a buscar
    public static int busquedaBinaria(int[] lista, int numeroBuscado){
        int mayor = lista.length - 1; //Toma el valor de la longitud del arreglo y le resta 1
        int menor = 0;

        while(menor <= mayor){ //Mientras el valor menor sea menor o igual al valor mayor
            int medio = (mayor + menor) / 2; //Calcula el valor medio del arreglo

            System.out.println("El numeroBuscado mayor: " + mayor);
            System.out.println("El numeroBuscado medio: " + medio);
            System.out.println("El numeroBuscado menor: " + menor);

            //Si el valor medio es igual al número buscado, regresa la posición
            if(lista[medio] == numeroBuscado){
                return medio;
            }else if(lista[medio] < numeroBuscado){ //Si el valor medio es menor al número buscado, el valor menor se convierte en el valor medio + 1
                menor = medio + 1;
            }else{ //Si el valor medio es mayor al número buscado, el valor mayor se convierte en el valor medio - 1
                mayor = medio - 1;
            }
        }
        return -1; //Si no se encuentra el número, regresa -1
    }
}
