package Introduccion;

public class Funciones {
    public static void main(String[] args) {
        Funciones funcion = new Funciones();

        funcion.saludar();
        funcion.saludar("Hugo");
        funcion.saludar("Hugo", "Dev");

        String nombre = funcion.nombre();
        System.out.println("Tu nombre es " + nombre);
        String nombreCompleto = funcion.nombre("Hugo", "Dev");
        System.out.println("Tu nombre completo es: " + nombreCompleto);

        mensaje();
    }

    //Funcion estática
    static void mensaje(){
        System.out.println("Hola mundo");
    }

    //Funciones sin retorno
    void saludar(){
        System.out.println("Hola");
    }

    void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }

    void saludar(String nombre, String apellido){
        System.out.println("Hola " + nombre + " " + apellido);
    }
    //Funciones con retorno

    String nombre(){
        return "Hugo";
    }

    String nombre(String nombre, String apellido){
        return nombre + " " + apellido;
    }
}
