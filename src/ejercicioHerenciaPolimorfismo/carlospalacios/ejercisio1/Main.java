package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio1;

public class Main {
    public static void main(String[] args) {

        Profesion profesionIngeniero = new Ingeniero(5_000_000);
        Profesion profesionArquitecto = new Arquitecto(2_000_000);
        Profesion profesionMedico = new Medico(3_000_000);

        System.out.println(profesionIngeniero.calcularSueldo());
        System.out.println(profesionArquitecto.calcularSueldo());
        System.out.println(profesionMedico.calcularSueldo());
    }
}
