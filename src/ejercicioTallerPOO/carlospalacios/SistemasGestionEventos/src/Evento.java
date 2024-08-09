public abstract class  Evento {
    //Atributos
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private String lugar;
    private int capacidadMaxima;
    private Asistente[] listaAsistentes;

    //Constructor
    public Evento(String nombre, String fechaInicio, String fechaFin, String lugar, int capacidadMaxima, Asistente[] listaAsistentes) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lugar = lugar;
        this.capacidadMaxima = capacidadMaxima;
        this.listaAsistentes = listaAsistentes;
    }

    //GetteAndSetters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Asistente[] getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(Asistente[] listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    //Metodos
    public void agregarAsistente(Asistente asistenteEntrante) {
        for (int i = 0; i < listaAsistentes.length; i++ ) {
            if (listaAsistentes[i] == null) {
                listaAsistentes[i] = asistenteEntrante;
                return;
            }
        }
        System.out.println("La lista de asistente esta llena");
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " +this.getNombre()+ "" +
                "\n Fecha de inicio: " +this.getFechaInicio()+ "\n Fecha de fin: " +this.getFechaFin()+ "" +
                "\n  Lugar: " +this.getLugar()+ "" +
                "\n Capacidad maxima: " +this.getCapacidadMaxima()+ "" +
                "\n Lista de asistentes: " +this.getListaAsistentes().toString());
    }
}
