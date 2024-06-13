public class Conferencia extends TipoEvento{
    public String Conferencia;
    public String fecha;

    public Conferencia(String id_cliente, String fecha, String tipo_evento, Double costo_base, String conferencia, String fecha1) {
        super(id_cliente, fecha, tipo_evento, costo_base);
        Conferencia = conferencia;
        this.fecha = fecha1;
    }

    public String getConferencia() {
        return Conferencia;
    }

    public void setConferencia(String conferencia) {
        Conferencia = conferencia;
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
        return costo_base+500;
    }
}
