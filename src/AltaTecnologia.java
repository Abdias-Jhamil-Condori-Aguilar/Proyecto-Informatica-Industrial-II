import java.util.Date;

public class AltaTecnologia extends Producto{
    String paisOrigen;
    Date fechaFabricacion;
    Empresa empresa;

    public AltaTecnologia(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa empresa) {
        super(codigo, modelo);
        this.paisOrigen = paisOrigen;
        this.fechaFabricacion = fechaFabricacion;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "AltaTecnologia{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", empresa=" + empresa +
                '}';
    }
}
