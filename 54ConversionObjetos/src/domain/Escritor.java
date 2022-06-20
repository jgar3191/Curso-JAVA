package domain;

public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipo escritura: " + this.tipoEscritura;
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escritor{");
        sb.append("Tipo Escritura: ").append(tipoEscritura);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
