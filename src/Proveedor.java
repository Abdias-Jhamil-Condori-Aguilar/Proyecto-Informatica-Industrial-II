public class Proveedor {
    int nif;
    String direccion;

    public Proveedor(int nif, String direccion) {
        this.nif = nif;
        this.direccion = direccion;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nif=" + nif +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
