package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        TarjetaCredito tarjetaCreditoClasica = new TarjetaCredito("Banco A", 5000, "1234-5678-9012-3456", 123, LocalDate.of(2025, 12, 31));
        TarjetaCredito tarjetaCreditoBlack = new Black();
        TarjetaCredito tarjetaCreditoPlatinium = new Platinium("Banco C", 15000, "3456-7890-1234-5678", 345, LocalDate.of(2027, 10, 29));
        TarjetaCredito tarjetaCreditoDorada = new Dorada("Banco D", 20000, "4567-8901-2345-6789", 456, LocalDate.of(2028, 9, 28));

        tarjetaCreditoClasica.imprimir();
        tarjetaCreditoPlatinium.imprimir();
        tarjetaCreditoDorada.imprimir();
        tarjetaCreditoBlack.imprimir();
    }
}
