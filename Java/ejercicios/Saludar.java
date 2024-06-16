package ejercicios;

import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        String nombre = lector.nextLine();

        System.out.println("Tu nombre es: " + nombre);
    }
}
