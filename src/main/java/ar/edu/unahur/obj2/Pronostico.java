package ar.edu.unahur.obj2;

public class Pronostico implements Display {
    private double temperatura;
    private double humedad;
    private double presion;


    @Override
    public void actualizarDatos(double temperatura, double humedad, double presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    @Override
    public String toString() {
        return "CondicionesActualesDisplay{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", presion=" + presion +
                '}';
    }
}
