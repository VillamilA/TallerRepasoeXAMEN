public class Artista extends Servicios{
    public String artist;
    public int time;

    public Artista(String id_cliente, String fecha, String nombre, double costo, String artist, int time) {
        super(id_cliente, fecha, nombre, costo);
        this.artist = artist;
        this.time = time;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }



    @Override
    public double Calulo_costo() {
        return costo+time*100;
    }
}
