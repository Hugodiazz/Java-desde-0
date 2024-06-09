package Introduccion;

public class CiclosWhile {
    public static void main(String[] args) {
        int contador = 0;

        //Se ejecuta cuando el valor sea verdadero
        while(contador < 10){ //Se ejecuta mientras contador sea menor que 10
            System.out.println(contador + ": Hola");
            contador++;
        }
        System.out.println(contador);

        /*
        Se ejecuta por lo menos una vez, aunque la condición sea falsa
         */
        contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        }while(contador < 10); //Se ejecuta mientras contador sea menor que 10.
        System.out.println(contador);
    }
}
