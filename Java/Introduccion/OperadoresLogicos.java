package Introduccion;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores lógicos
        System.out.println("Operadores LÓGICOS \n");
        boolean a = false;
        boolean b = false;

        boolean and = a && b; //AND lógico &&
        boolean or = a || b; //Or lógico ||
        boolean not = !a; //Not lógico !

        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);

        //Operadores de comparación
        System.out.println("Operadores de comparación");
        int numero1 = 8;
        int numero2 = 7;

        boolean igualdad = numero1 == numero2;  //Igual a ==
        boolean distinto = numero1 != numero2;//Distinto =!
        boolean mayor = numero1 > numero2;// Mayor que >
        boolean menor = numero1 < numero2;//Menor que <
        boolean mayor_igual = numero1 >= numero2; //Mayor o igual que >=
        boolean menor_igual = numero1 <= numero2; //Menor o igual que <=

        System.out.println("Igualdad: " + igualdad);
        System.out.println("Distinto: " + distinto);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor o igual: " + mayor_igual);
        System.out.println("Menor o igual: " + menor_igual);
    }
}
