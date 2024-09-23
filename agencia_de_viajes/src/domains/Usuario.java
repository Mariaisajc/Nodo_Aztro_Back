package domains;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private final String fechaNacimiento; // Solo getter
    private String direccion;
    private String telefono;

    public Usuario() {
        this.fechaNacimiento = ""; // Inicialización por defecto
    }

    public Usuario(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento; // Solo getter
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public abstract void mostrarInfo(); //Método abstracto para implementación en subclases
}

