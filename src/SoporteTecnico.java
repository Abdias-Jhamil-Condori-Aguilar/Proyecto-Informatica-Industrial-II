public class SoporteTecnico {
    Empresa empresa;
    AltaTecnologia altaTecnologia;
    Double precio;

    public SoporteTecnico(Empresa empresa, AltaTecnologia altaTecnologia, Double precio) {
        this.empresa = empresa;
        this.altaTecnologia = altaTecnologia;
        this.precio = precio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public AltaTecnologia getAltaTecnologia() {
        return altaTecnologia;
    }

    public void setAltaTecnologia(AltaTecnologia altaTecnologia) {
        this.altaTecnologia = altaTecnologia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SoporteTecnico{" +
                "empresa=" + empresa +
                ", altaTecnologia=" + altaTecnologia +
                ", precio=" + precio +
                '}';
    }
}
