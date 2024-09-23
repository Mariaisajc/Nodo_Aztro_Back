import models.*;
import java.util.Scanner;

public class AgenciaDeViajes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos personales del cliente
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa tu fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Ingresa tu dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingresa tu número de teléfono: ");
        String telefono = scanner.nextLine();

        // Instanciar clase Cliente con los datos ingresados
        Cliente cliente = new Cliente(1, nombre, apellido, fechaNacimiento, direccion, telefono);

        // Instanciar clases hijas
        Administrador administrador = new Administrador(2, "María", "Gómez", "1985-05-10", "Avenida Siempre Viva", "555-5678");
        GestorDeViajes gestor = new GestorDeViajes(3, "Carlos", "López", "1988-09-15", "Boulevard del Sol", "555-8765");

        // Interacción con el cliente
        System.out.println("Bienvenido a la Agencia de Viajes");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());

        String primerDestino = null;
        System.out.print("¿Deseas agregar un destino? (si/no): ");
        String respuesta = scanner.nextLine();

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingresa el destino: ");
            String destino = scanner.nextLine();
            cliente.agregarDestino(destino);

            // Guardar el primer destino ingresado
            if (primerDestino == null) {
                primerDestino = destino;
            }

            System.out.print("¿Deseas agregar otro destino? (si/no): ");
            respuesta = scanner.nextLine();
        }

        // Si el usuario no responde si o no
        if (respuesta.isEmpty()) {
            System.out.println("Información ingresada:");
            cliente.mostrarInfo();
            scanner.close();
            return; // Termina el programa
        }


        if (primerDestino != null) {
            System.out.print("Selecciona un proveedor (1: AirBnB, 2: Booking): ");
            String proveedorSeleccionado = scanner.nextLine();
            Proveedor proveedor;

            if ("1".equals(proveedorSeleccionado)) {
                proveedor = new Proveedor(1, "AirBnB");
            } else if ("2".equals(proveedorSeleccionado)) {
                proveedor = new Proveedor(2, "Booking");
            } else {
                System.out.println("Proveedor no válido. Se usará AirBnB por defecto.");
                proveedor = new Proveedor(1, "AirBnB");
            }

            Viaje viaje1 = new Viaje(1, primerDestino);

            // Mostrar información del cliente
            cliente.mostrarInfo();

            // Mostrar información del administrador y gestor
            administrador.mostrarInfo();
            gestor.mostrarInfo();
            // Mostrar información de viaje y proveedor
            System.out.println(viaje1);
            System.out.println(proveedor);
        } else {
            System.out.println("No se ingresó ningún destino.");
        }

        scanner.close();
    }
}
