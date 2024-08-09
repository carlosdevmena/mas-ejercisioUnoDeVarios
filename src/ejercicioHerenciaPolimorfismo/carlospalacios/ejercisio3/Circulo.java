package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio3;

public class Circulo extends FormaFigura implements FiguraGeometrica {

    public Circulo(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public int calcularArea() {
        return (int) Math.PI * ((getAncho()/2) * (getAncho()/2));
    }

    @Override
    public int calcularPerimetro() {
        return (int) ((int) 2 * Math.PI * (getAncho()/2));
    }
}
