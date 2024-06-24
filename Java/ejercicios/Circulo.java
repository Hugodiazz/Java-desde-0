package ejercicios;

public class Circulo {
    public static void main(String[] args){
        double radio = 5;

        System.out.println("El area del circulo es: "
                + areaCirculo(radio));
        //El area del circulo es: 78.54
    }

    static double areaCirculo(double radio){
        //DEVUELVE EL VALOR REDONDEADO A 3 CIFRAS
        //DESPUES DEL PUNTO DECIMAL

        return Math.round(Math.PI * Math.pow(radio, 2) * 1000.0) / 1000.0;
    }
}

