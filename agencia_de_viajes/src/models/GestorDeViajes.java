package models;

import domains.Usuario;

public class GestorDeViajes extends Usuario {
    private String rol = "Gestor de Viajes";

    public GestorDeViajes() {
        super();
    }

    public GestorDeViajes(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Rol: " + rol + ", Nombre: " + getNombre() + " " + getApellido());
    }
}

