package ejercicioHerenciaPolimorfismo.carlospalacios.ejercisio1;

public abstract class Profesion {

    private long sueldo;
    private long bono;

    public Profesion(long bono) {
        this.sueldo = 2_000_000;
        this.bono = bono;
    }

    public Profesion() {
        this.sueldo = 2_000_000;
        this.bono = 0;
    }

    public long getBono() {
        return bono;
    }

    public void setBono(long bono) {
        this.bono = bono;
    }

    public long calcularSueldo() {
        return sueldo + getBono();
    }
}
