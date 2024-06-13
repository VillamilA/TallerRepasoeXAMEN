public class TipoEvento extends ReservaEvento{
    public String Tipo_evento;
    public Double costo_base;

    public TipoEvento(String id_cliente, String fecha, String tipo_evento, Double costo_base) {
        super(id_cliente, fecha);
        Tipo_evento = tipo_evento;
        this.costo_base = costo_base;
    }

    public String getTipo_evento() {
        return Tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        Tipo_evento = tipo_evento;
    }

    public Double getCosto_base() {
        return costo_base;
    }

    public void setCosto_base(Double costo_base) {
        this.costo_base = costo_base;
    }

}