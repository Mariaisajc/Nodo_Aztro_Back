package models;

import domains.Usuario;

public class Administrador extends Usuario {
    private String rol = "Administrador";

    public Administrador() {
        super();
    }

    public Administrador(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Rol: " + rol + ", Nombre: " + getNombre() + " " + getApellido());
    }
}

