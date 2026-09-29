import java.util.Scanner;

public class CineCampus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables acumuladoras y contadoras
        double totalAcumulado = 0.0;
        int contadorVentas = 0;
        char respuesta;

        System.out.println("=== SISTEMA DE VENTA DE ENTRADAS CINECAMPUS ===");

        // Estructura de repetición principal
        do {
            contadorVentas++;
            System.out.println("\n--- Venta #" + contadorVentas + " ---");

            // Entrada de datos de la venta actual
            System.out.print("Ingrese el tipo de entrada (Ej: General, 3D, VIP): ");
            String tipoEntrada = scanner.nextLine();

            System.out.print("Ingrese la cantidad de entradas: ");
            int cantidad = scanner.nextInt();

            System.out.print("Ingrese el precio unitario: $");
            double precio = scanner.nextDouble();

            // Cálculo del subtotal
            double subtotal = cantidad * precio;

            // Acumulación del total general
            totalAcumulado += subtotal;

            // Muestra del resumen de la venta actual
            System.out.printf("Subtotal de esta venta (%s x%d): $%.2f%n", tipoEntrada, cantidad, subtotal);
            System.out.printf("Total acumulado hasta el momento: $%.2f%n", totalAcumulado);

            // Pregunta de selección para continuar
            System.out.print("\n¿Desea realizar otra venta? (S/N): ");
            respuesta = scanner.next().toUpperCase().charAt(0);

            // Limpieza del búfer de entrada
            scanner.nextLine();

        } while (respuesta == 'S');

        // Resumen final al salir del bucle
        System.out.println("\n=================================");
        System.out.println("RESUMEN DE VENTAS REGISTRADAS");
        System.out.println("Total de ventas realizadas: " + contadorVentas);
        System.out.printf("Monto total acumulado: $%.2f%n", totalAcumulado);
        System.out.println("=================================");

        scanner.close();
    }
}
