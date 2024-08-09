package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio3;

public class Main {
    public static void main(String[] args) {
        FormaFigura cuadrado = new Cuadrardo(20, 20);
        FormaFigura triangulo = new Triangulo(20, 20);
        FormaFigura circulo = new Circulo(20, 20);

        System.out.println("Area cuadrado: " +cuadrado.calcularArea());
        System.out.println("Perimetro cuadrado: " +cuadrado.calcularPerimetro());
        System.out.println("Area triangulo: " + triangulo.calcularArea());
        System.out.println("Perimetro triangulo: " +triangulo.calcularPerimetro());
        System.out.println("Area circulo: " +circulo.calcularArea());
        System.out.println("Perimetro circulo: " +circulo.calcularPerimetro());
    }
}
