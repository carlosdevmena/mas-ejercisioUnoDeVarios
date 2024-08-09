public class Asistente extends Persona {
    //Atriutos
    private String correoElectronico;

    //Constructor
    public Asistente(String nombre, String apellido, String correoElectronico){
        super(nombre, apellido);
        this.correoElectronico = correoElectronico;
    }

    //GetterAndSetter
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
