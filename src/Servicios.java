public abstract class Servicios extends ReservaEvento{
    public String nombre;
    public double costo;

    public Servicios(String id_cliente, String fecha, String nombre, double costo) {
        super(id_cliente, fecha);
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public double Calculo_costo() {
        return costo;
    }

    public abstract double Calulo_costo();
}
