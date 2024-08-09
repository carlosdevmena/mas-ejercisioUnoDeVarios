package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio3;

public abstract class FormaFigura implements FiguraGeometrica {
    private int alto;
    private int ancho;

    public FormaFigura(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
