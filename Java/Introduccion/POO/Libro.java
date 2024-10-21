package Introduccion.POO;

public class Libro {
    //Modificadores de acceso
    //private, default, protected, public
    // Atributos o propiedades
    private String titulo;
    private String autor;
    private String identificador;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }



    public Libro(){
        this.autor = "Desconocido";
        this.titulo = "Desconocido";
        this.identificador = "Desconocido";
    }

    public Libro(String titulo, String autor, String identificador){
        this.autor = autor;
        this.titulo = titulo;
        this.identificador = identificador;
    }

    public void prestar(){
        System.out.println("El libro " + titulo + " está prestado");
    }

    public void devolver(){
        System.out.println("El libro " + titulo + " ha sido devulto");
    }

    //Método para probar el objeto
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Libro 1";
        libro1.autor = "Desconocido";
        libro1.identificador = "1234";

        System.out.println("Titulo: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Identificador: " + libro1.identificador);

        Libro libro2 = new Libro();
        System.out.println("Autor: " + libro2.autor);
        System.out.println("Identificador: " + libro2.identificador);
        System.out.println("TItulo: " + libro2.titulo);

        Libro libro3 = new Libro("Libro 3", "Autor 3", "3");
        System.out.println("Autor: " + libro3.autor);
        System.out.println("Identificador: " + libro3.identificador);
        System.out.println("TItulo: " + libro3.titulo);

        libro3.prestar();
        libro3.devolver();
    }
}
