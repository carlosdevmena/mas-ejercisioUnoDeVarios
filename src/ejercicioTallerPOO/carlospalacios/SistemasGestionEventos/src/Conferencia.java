public class Conferencia extends Evento {
    //Atributos
    public String tema;
    public Persona[] ponentes;

    //Constructor
    public Conferencia(String nombre, String fechaInicio, String fechaFin, String lugar, int capacidadMaxima, Asistente[] listaAsistentes, String tema, Persona[] ponentes){
        super(nombre, fechaInicio, fechaFin, lugar, capacidadMaxima, listaAsistentes);
        this.tema = tema;
        this.ponentes = ponentes;
    }

    //GetterAndSetter
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Persona[] getPonentes() {
        return ponentes;
    }

    public void setPonentes(Persona[] ponentes) {
        this.ponentes = ponentes;
    }

    //Metodos
    public void agregarTema(String tema) {
        this.tema = tema;
    }

    public void agregarPonente(Persona persona) {
        for (int i = 0; i < ponentes.length; i++) {
            if (ponentes[i] == null) {
                ponentes[i] = persona;
                return;
            }
        }
    }


}
