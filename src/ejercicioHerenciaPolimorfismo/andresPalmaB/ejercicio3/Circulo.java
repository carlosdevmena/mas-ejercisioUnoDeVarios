package ejercicioHerenciaPolimorfismo.andresPalmaB.ejercicio3;

public class Circulo implements FiguraGeometrica{
    private double radio;
    private final double pi = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return pi * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * pi * radio;
    }
}
