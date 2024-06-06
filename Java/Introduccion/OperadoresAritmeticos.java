package Introduccion;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Uso de operadores aritmeticos
        //Declaracion de variables
        int numero1 = 5;
        int numero2 = 10;

        System.out.println("Valor inicial de numero 1: " + numero1);
        System.out.println("Valor inicial de numero 2: " + numero2);

        int suma = numero1 + numero2; //5+10 = 15
        int resta = numero1 - numero2; // 5-10 = -5
        int division = numero1 / numero2; // 5 / 10 = 0
        int modulo = numero1 % numero2; // 5
        float division2 = (float)numero1 / (float) numero2; // 5.0/10.0 = 0.5
        int multiplicacion = numero1 * numero2; // 5 * 10 = 50

        System.out.println("Resultado de suma " + suma);
        System.out.println("Resultado de resta " + resta);
        System.out.println("Resultado de division " + division);
        System.out.println("Residuo de la division: " + modulo);
        System.out.println("Division con punto flotante: " + division2);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);


        //numero1 = numero1 - 1;
        //Operador de incremento.
        numero1--; // ; 5-1= 4
        //Operadador de decremento.
        numero2++; //10+1 = 11
        System.out.println("Nuevo valor de numero 1: " + numero1);
        System.out.println("Nuevo valor de numero 2: " + numero2);


        //Forma abreviada de operadores aritmeticos
        //numero1 = numero1 + 2;
        numero1 += 2; //4+2 = 6
        numero2 -= 3; //11-3 = 8
        numero1 *= 2; //6 * 2 = 12
        numero2 /= 2; //8 / 2 = 4

        System.out.println("Nuevo valor de numero 1: " + numero1);
        System.out.println("Nuevo valor de numero 2: " + numero2);
    }
}
