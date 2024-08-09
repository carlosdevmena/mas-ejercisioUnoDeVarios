package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio2;

import java.time.LocalDate;

public class Platinium extends TarjetaCredito {

    public Platinium(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
