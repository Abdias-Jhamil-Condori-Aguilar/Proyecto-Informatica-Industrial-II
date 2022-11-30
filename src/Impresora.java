import interfaces.IReseteable;

public class Impresora extends Producto implements IReseteable {
    int velocidad;

    public Impresora(String codigo, String modelo, int velocidad) {
        super(codigo, modelo);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "velocidad=" + velocidad +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando Impresora ...");
    }
}
