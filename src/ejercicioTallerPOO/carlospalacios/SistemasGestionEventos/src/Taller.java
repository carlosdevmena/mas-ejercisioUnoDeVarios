public class Taller extends Evento{
    //Atributos
    private String[] materialesNecesarios;
    private int duracion;

    //Constructor
    public Taller(String nombre, String fechaInicio, String fechaFin, String lugar, int capacidadMaxima, Asistente[] listaAsistentes, String[] materialesNecesarios,int duracion){
        super(nombre, fechaInicio, fechaFin, lugar, capacidadMaxima, listaAsistentes);
        this.materialesNecesarios = materialesNecesarios;
        this.duracion = duracion;
    }

    //GetterAndSetter
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String[] getMaterialesNecesarios() {
        return materialesNecesarios;
    }

    public void setMaterialesNecesarios(String[] materialesNecesarios) {
        this.materialesNecesarios = materialesNecesarios;
    }

    //Metodos
    public void agregarUnMaterial(String material) {
        for (int i = 0; i < materialesNecesarios.length; i++) {
            if (materialesNecesarios[i] == null) {
                materialesNecesarios[i] = material;
                return;
            }
        }
    }
}
