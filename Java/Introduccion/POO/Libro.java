package Introduccion.POO;

public class Libro {
    String titulo;
    String autor;
    String identificador;

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Libro 1";
        libro1.autor = "Desconocido";
        libro1.identificador = "1234";

        System.out.println("Titulo: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Identificador: " + libro1.identificador);
    }
}
