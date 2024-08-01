package ejercicioHerenciaPolimorfismo.andresPalmaB.ejercicio3;

public class Triangulo implements FiguraGeometrica, Poligono{
    private double ladoC;
    private double ladoA;
    private double ladoB;

    public Triangulo(double ladoC, double ladoA, double ladoB) {
        this.ladoC = ladoC;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        double semiP = calcularPerimetro() / 2;
        return Math.sqrt(semiP * (semiP - ladoA) * (semiP - ladoB) * (semiP - ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public int numeroLados() {
        return 3;
    }
}
