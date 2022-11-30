import interfaces.IReseteable;

public class DiscoDuro extends Alquilable implements IReseteable {
    int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad) {
        super(codigo, modelo, precioHora);
        this.capacidad = capacidad;

    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "capacidad=" + capacidad +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Formateando disco duro ...");
    }
}
