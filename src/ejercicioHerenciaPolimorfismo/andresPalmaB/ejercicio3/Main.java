package ejercicioHerenciaPolimorfismo.andresPalmaB.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(12.5, 14.6);
        Triangulo triangulo = new Triangulo(9, 5, 7);
        Circulo circulo = new Circulo(12);

        System.out.printf("Cuadrado" +
                "El perimetro del cuadrado es: %.2f%n" +
                "El area de un cuadrado es: %.2f%n%n" +
                "Triangulo" +
                "El perimetro del cuadrado es: %.2f%n" +
                "El area de un cuadrado es: %.2f%n%n" +
                "Circulo" +
                "El perimetro del cuadrado es: %.2f%n" +
                "El area de un cuadrado es: %.2f%n", cuadrado.calcularPerimetro(), cuadrado.calcularArea(), triangulo.calcularPerimetro(), triangulo.calcularArea(),circulo.calcularPerimetro(), circulo.calcularArea());
    }
}
