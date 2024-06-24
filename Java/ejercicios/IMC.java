package ejercicios;

public class IMC {
    public static void main(String[] args) {
        double peso = 70;
        double altura = 1.75;
        calcularIMC(peso, altura);
        // Tu IMC es: 23.0 Normal

        peso = 50;
        calcularIMC(peso, altura);
        //Tu IMC es: 16.0 Bajo peso

        peso = 80;
        calcularIMC(peso, altura);
        // Tu IMC es: 26.0 Sobrepeso

        peso = 95;
        calcularIMC(peso, altura);
        // Tu IMC es: 31.0 Obesidad
    }

    static void calcularIMC(double peso, double altura){
        double imc =  Math.round(peso / Math.pow(altura, 2));
        System.out.print("Tu IMC es: " + imc + " ");
        if(imc < 18.5){
            System.out.println("Bajo peso");
        } else if(imc >= 18.5 && imc < 24.9){
            System.out.println("Normal");
        } else if(imc >= 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

    }
}
