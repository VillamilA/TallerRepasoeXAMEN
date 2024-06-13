public class Boda extends TipoEvento{
    public String fecha;
    public String lugar;

    public Boda(String id_cliente, Double costo_base, String fecha1, String lugar) {
        super(id_cliente, fecha, tipo_evento, costo_base);
        this.fecha = fecha1;
        this.lugar = lugar;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public double Calculo_costo() {
        return costo_base+1000;
    }
}