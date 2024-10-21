package Introduccion.POO;

public class Miembro {
    private String nombre;
    private String id;

    public Miembro(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }

    public void realizarTarea(){
        System.out.println(nombre + " esta realizando una tarea.");
    }
}
