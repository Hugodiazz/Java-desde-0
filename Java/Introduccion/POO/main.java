package Introduccion.POO;

public class main {
    public static void main(String[] args) {
        /*
        Libro libro1 = new Libro();
        libro1.setTitulo("Libro 1");
        libro1.setAutor("Desconocido");
        libro1.setIdentificador("1234");

        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Identificador: " + libro1.getIdentificador());



        Miembro miembro1 = new Miembro("Juan", "123");
        miembro1.mostrarInformacion();

        Bibliotecario bibliotecario1 = new Bibliotecario("Jose", "145", "Mañana");
        bibliotecario1.mostrarInformacion();

         */

        Miembro[] miembros = new Miembro[3];

        miembros[0] = new Bibliotecario("Ana", "1");
        miembros[1] = new Usuario("Carlos", "2");
        miembros[2] = new Usuario("Laura", "3");

        for(Miembro miembro: miembros){
            miembro.realizarTarea();
        }
    }
}
