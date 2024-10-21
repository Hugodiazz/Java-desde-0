package Introduccion.POO;

public class Usuario extends Miembro{
    public Usuario(String nombre, String id) {
        super(nombre, id);
    }

    public void realizarTarea(){
        System.out.println(getNombre() + " quiere un libro.");
    }
}
