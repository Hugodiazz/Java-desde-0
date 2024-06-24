package ejercicios;

public class Factorial {
    public static void main(String[] args) {
        int resultado = factorial(10);
        System.out.println(resultado);
    }

    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
