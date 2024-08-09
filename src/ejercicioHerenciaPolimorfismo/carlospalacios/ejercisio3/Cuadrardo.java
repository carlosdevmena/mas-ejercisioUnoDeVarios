package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio3;

public class Cuadrardo extends FormaFigura implements FiguraGeometrica, Poligono{

    public Cuadrardo(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public int calcularArea() {
        return getAlto() * getAncho();
    }

    @Override
    public int calcularPerimetro() {
        return 4 * getAlto();
    }

    @Override
    public void mostrarEsPoligono() {
        System.out.println("Esta figura es poligono");
    }
}
