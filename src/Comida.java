public class Comida extends Servicios{
    public int platos;
    public String nombre_plato;

    public Comida(String id_cliente, String fecha, String nombre, double costo, int platos, String nombre_plato) {
        super(id_cliente, fecha, nombre, costo);
        this.platos = platos;
        this.nombre_plato = nombre_plato;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public String getNombre_plato() {
        return nombre_plato;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    @Override
    public double Calulo_costo() {
        return costo + platos * 50;
    }

}
