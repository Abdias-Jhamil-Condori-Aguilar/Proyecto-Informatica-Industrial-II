import java.util.Date;

public class Provee {
    Producto producto;
    Proveedor proveedor;
    Date fecha;
    int cantidad;

    public Provee(Producto producto, Proveedor proveedor, Date fecha, int cantidad) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Provee{" +
                "producto=" + producto +
                ", proveedor=" + proveedor +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }
}
