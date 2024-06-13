public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("1", "Juan Pérez");

        // Crear una boda
        Boda boda = new Boda("1",2000.0, "2024-12-12", "Playa");

        // Crear una conferencia
        Conferencia conferencia = new Conferencia("2", "2024-11-11", "Conferencia", 3000.0, "Conferencia Internacional de Tecnología","2024-11-11");

        // Crear un concierto
        Concierto concierto = new Concierto("3", "2024-10-10", "Concierto", 700.0, "Concierto de Rock");

        // Crear un artista
        Artista artista = new Artista("5", "2024-10-12", "Banda XYZ", 50.0,"Juan",6);

        // Crear comida
        Comida comida = new Comida("Catering", "2024-10-12", "Buffet", 200.0,100,"Mariscos");

        // Calcular costos
        System.out.println("Costo de la boda: " + boda.Calculo_costo());
        System.out.println("Costo de la conferencia: " + conferencia.Calculo_costo());
        System.out.println("Costo del concierto: " + concierto.Calculo_costo());
        System.out.println("Costo del artista: " + artista.Calculo_costo());
        System.out.println("Costo de la comida: " + comida.Calculo_costo());
    }
}