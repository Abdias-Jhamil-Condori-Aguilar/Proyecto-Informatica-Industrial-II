public class ServicioTecnico {
    Cliente cliente;
    Impresora impresora;
    Double totalFacturado;

    public ServicioTecnico(Cliente cliente, Impresora impresora, Double totalFacturado) {
        this.cliente = cliente;
        this.impresora = impresora;
        this.totalFacturado = totalFacturado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public Double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(Double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }

    @Override
    public String toString() {
        return "ServicioTecnico{" +
                "cliente=" + cliente +
                ", impresora=" + impresora +
                ", totalFacturado=" + totalFacturado +
                '}';
    }
}
