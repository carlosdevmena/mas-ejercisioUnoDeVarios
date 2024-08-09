package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio2;

import java.time.LocalDate;

public class TarjetaCredito {

    private  String emisor;
    private long cupo;
    private String numeroTarjeta;
    private int cvv;
    private LocalDate fechaVencimiento;



    public TarjetaCredito() {
        this.emisor = "";
        this.cupo = 0;
        this.numeroTarjeta = "XXXX-XXXXX-XXXX-XXXX";
        this.cvv = 544;
        this.fechaVencimiento = null;
    }

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void imprimir() {
        System.out.println("Emisor: " + emisor);
        System.out.println("Cupo: " + cupo);
        System.out.println("Numero de Tarjeta: " + numeroTarjeta);
        System.out.println("CVV: " + cvv);
        System.out.println("Fecha de Vencimiento: " + (fechaVencimiento != null ? fechaVencimiento : "No disponible"));
    }




}
