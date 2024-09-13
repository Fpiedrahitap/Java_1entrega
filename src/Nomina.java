public class Nomina {
    public String empleado;
    public double montoDePago;
    public String fechaDePago;

    public Nomina(String empleado, double montoDePago, String fechaDePago) {
        this.empleado = empleado;
        this.montoDePago = montoDePago;
        this.fechaDePago = fechaDePago;
    }

    public String getEmpleado() {
        return empleado;
    }

    public double getMontoDePago() {
        return montoDePago;
    }

    public String getFechaDePago() {
        return fechaDePago;
    }
}
