package models;

public class Viaje {
    private int id;
    private String nombreCiudad;

    public Viaje(int id, String nombreCiudad) {
        this.id = id;
        this.nombreCiudad = nombreCiudad;
    }

    public int getId() {
        return id;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    @Override
    public String toString() {
        return "Viaje" + id + ", con destino a la ciudad de " + nombreCiudad + ".";
    }
}

