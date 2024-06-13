public class Concierto extends TipoEvento{
    public String Conierto;
    public String fecha;

    public Concierto(String id_cliente, String fecha, String tipo_evento, Double costo_base, String conierto) {
        super(id_cliente, fecha, tipo_evento, costo_base);
        Conierto = conierto;
        this.fecha = fecha;
    }

    public String getConierto() {
        return Conierto;
    }

    public void setConierto(String conierto) {
        Conierto = conierto;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public double Calculo_costo() {
        return costo_base+1500;
    }
}
