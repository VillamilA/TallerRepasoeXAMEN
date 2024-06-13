public class ReservaEvento {
    public String id_cliente;
    public String fecha;

    public ReservaEvento(String id_cliente, String fecha) {
        this.id_cliente = id_cliente;
        this.fecha = fecha;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double Calculo_costo(){
        return 0;
    }
}