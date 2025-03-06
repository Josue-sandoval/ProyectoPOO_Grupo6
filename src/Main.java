
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        System.out.println("Bienvenido al sistema de registro de personas.");

        // Menú para elegir la profesión
        System.out.println("¿Qué tipo de persona desea registrar?");
        System.out.println("1. Doctor");
        System.out.println("2. Deportista");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Variables comunes
        String nombre, genero;
        int edad;

        // Solicitar datos comunes
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Ingrese el género: ");
        genero = scanner.nextLine();

        // Procesar la opción seleccionada
        if (opcion == 1) {
            // Registrar un Doctor
            System.out.print("Ingrese la especialidad: ");
            String especialidad = scanner.nextLine();

            // Crear el objeto Doctor
            Doctor doctor = new Doctor(nombre, edad, genero, especialidad);

            // Mostrar la información del Doctor
            System.out.println("\nInformación del Doctor:");
            doctor.mostrarInformacion();
        } else if (opcion == 2) {
            // Registrar un Deportista
            System.out.print("Ingrese el deporte: ");
            String deporte = scanner.nextLine();

            // Crear el objeto Deportista
            Deportista deportista = new Deportista(nombre, edad, genero, deporte);

            // Mostrar la información del Deportista
            System.out.println("\nInformación del Deportista:");
            deportista.mostrarInformacion();
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }

        scanner.close(); // Cerrar el scanner
    }
}
