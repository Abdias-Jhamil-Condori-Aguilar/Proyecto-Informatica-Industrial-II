import interfaces.IReseteable;

import java.util.Date;

public class CPUs extends AltaTecnologia implements IReseteable {
    double memoriaPrincipal;

    public CPUs(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa empresa, double memoriaPrincipal) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, empresa);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public Double getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(Double memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "CPUs{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Realizando reseteo ...");
    }
}
