package Introduccion;

public class IfElse {

    //Uso de condicional if-else

    public static void main(String[] args) {
        boolean valor = false;
        int num1, num2;
        num1 = 5;
        num2 = 7;

        if (num1 != num2){ //Si num1 es diferente de num2
            System.out.println("Los valores son diferentes");
        }else{ //Si no son diferentes entonces son iguales
            System.out.println("Los valores son iguales");
        }

        if(valor){ //Si valor es verdadero
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es falso");
        }
    }
}
