package Introduccion;

public class CicloFor {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 15; i++) { //Se inicia en 1, se ejecuta mientras i sea menor o igual a  y avanza de 1 en 1
            suma = suma + i; //Sobreescribe el valor con su valor anterior más el valor de i
            System.out.println("Valor: " + i);
            System.out.println("Suma: " + suma);
            if(i == 8){
                break; //Finaliza el ciclo al llegar a 8
            }
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
}
