package Algoritmos.Ordenamiento;

import java.util.Arrays;

public class Burbuja {
    public static void main(String[] args) {
        //Arreglo de números desordenados
        int[] miLista = {52, 1, 12, 53, 15, 28, 6, 5, 29};
        System.out.println("Lista original: " + Arrays.toString(miLista));

        ordenamientoBurbuja(miLista); //Llamada al método de ordenamiento pasando la lista desordenada
        System.out.println("Lista ordenada: " + Arrays.toString(miLista)); //Imprime la lista ordenada
    }

    public static int[] ordenamientoBurbuja(int[] lista){

        int n = lista.length; //Tamaño de la lista

        for (int i = 0; i < n; i++) { //Recorre la lista
            for (int j = 0; j < n - 1 - i; j++) {
                if(lista[j] > lista[j + 1]){//Si el número actual es mayor al siguiente
                    int temp = lista[j]; //Guarda el valor actual
                    lista[j] = lista[j + 1]; //El valor actual ahora es el siguiente
                    lista[j + 1] = temp; // El valor siguiente ahora es el actual
                    System.out.println(Arrays.toString(lista));
                }
            }
        }
        return lista;
    }
}
