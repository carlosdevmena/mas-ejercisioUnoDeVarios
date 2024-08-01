package ejercicioHerenciaPolimorfismo.andresPalmaB.ejercicio2;

import java.time.YearMonth;
import java.util.Random;

public class Platinum extends TarjetaCredito{
    //Constructores
    public Platinum(String emisor) {
        setEmisor(emisor);
        setCupo(20000000);
        generarNumeroTarjeta();
        generarCvv();
        generarFechaVencimiento();
    }

    //Metodos
    private void generarNumeroTarjeta(){
        Random random = new Random();
        long numeroTarjeta = 1000000000000000L + (long)(random.nextDouble() * 9000000000000000L);
        setNumeroTarjeta(String.valueOf(numeroTarjeta));
    }

    private void generarCvv(){
        Random random = new Random();
        int cvv = 100 + (int)(random.nextDouble() * 900);
        setCvv(cvv);
    }

    private void generarFechaVencimiento(){
        setFechaVencimiento(YearMonth.now().plusYears(3));
    }
}
