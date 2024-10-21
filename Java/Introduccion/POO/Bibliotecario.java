package Introduccion.POO;

public class Bibliotecario extends Miembro{
    private String turno;

    public Bibliotecario(String nombre, String id){
        super(nombre, id);
    }
    public Bibliotecario(String nombre, String id, String turno){
        super(nombre, id);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Turno: " + turno);
    }

    public void realizarTarea(){
        System.out.println(getNombre() + " está acomodando libros.");
    }
}
