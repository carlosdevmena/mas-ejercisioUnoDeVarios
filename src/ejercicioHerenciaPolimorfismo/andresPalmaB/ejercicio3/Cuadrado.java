package ejercicioHerenciaPolimorfismo.andresPalmaB.ejercicio3;

public class Cuadrado implements FiguraGeometrica, Poligono{
    private double alto;
    private double ancho;

    public Cuadrado(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return alto + ancho;
    }

    @Override
    public int numeroLados() {
        return 4;
    }
}
