package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Mayor {
    public static void main(String[] args) {
        //Programa que identifique el número mayor en una lista desordenada
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(7);
        lista.add(3);
        lista.add(15);
        lista.add(25);

        // lista = [5, 10, 7, 3, 15, 25]
        numeroMayor(lista); //El número mayor es 25
    }

    static void numeroMayor(List<Integer> lista){
        int numeroMayor = lista.get(0);
        for(int numero: lista){
            if(numero > numeroMayor){
                numeroMayor = numero;
            }
        }
        System.out.println("El número mayor es: " + numeroMayor);
    }
}
