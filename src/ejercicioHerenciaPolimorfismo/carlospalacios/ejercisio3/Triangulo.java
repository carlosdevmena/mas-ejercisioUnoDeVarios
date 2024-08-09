package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio3;

public class Triangulo extends FormaFigura implements FiguraGeometrica, Poligono{

    public Triangulo(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public int calcularArea() {
        return (int) (Math.sqrt((3) / 4) * getAncho() * getAncho());
    }

    @Override
    public int calcularPerimetro() {
        return 3 * getAncho();
    }

    @Override
    public void mostrarEsPoligono() {
        System.out.println("Esta figura es poligono");
    }
}
