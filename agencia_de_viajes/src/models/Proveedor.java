package models;

public class Proveedor {
    private int id;
    private String nombrePlataforma;

    public Proveedor(int id, String nombrePlataforma) {
        this.id = id;
        this.nombrePlataforma = nombrePlataforma;
    }

    public int getId() {
        return id;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    @Override
    public String toString() {
        return " El Proveedor" + id + " es " + nombrePlataforma + ".";
    }
}

