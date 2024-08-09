package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio2;

import java.time.LocalDate;

public class Clasica extends TarjetaCredito {

    public Clasica(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
