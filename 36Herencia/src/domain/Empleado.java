package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Constructor
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        this(); //Llamada al constructor vacio de la clase empleado
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Getter and Setter
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Método ToString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado {");
        sb.append("id Empleado: ").append(this.idEmpleado);
        sb.append(", Nombre: ").append(this.nombre);
        sb.append(", Sueldo: $").append(this.sueldo);
        sb.append('}');
        sb.append('\n').append(super.toString());
        return sb.toString();
    }
}
