package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro;
    private boolean vip;

    //Constructor
    public Cliente(Date fechaRegistro,boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    //Getters and Setters
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String formatoFecha(Date fechaRegistro){
        SimpleDateFormat fechaFormato = new SimpleDateFormat("MM/dd/yyyy");
        String stringDate = fechaFormato.format(fechaRegistro);

        return stringDate;
    }

    //MétodoToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente {");
        sb.append("idCliente= ").append(idCliente);
        sb.append(", fechaRegistro= ").append(formatoFecha(fechaRegistro));
        sb.append(", vip= ").append(vip).append('}');
        sb.append('\n').append(super.toString());
        return sb.toString();
    }
}
