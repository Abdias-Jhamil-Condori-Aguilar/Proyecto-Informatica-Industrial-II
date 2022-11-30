import interfaces.IReseteable;

public class Monitores extends Alquilable implements IReseteable {
    String resolucionMaxima;

    public Monitores(String codigo, String modelo, double precioHora, String resolucionMaxima) {
        super(codigo, modelo, precioHora);
        this.resolucionMaxima = resolucionMaxima;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitores{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando Monitor ....");
    }
}
