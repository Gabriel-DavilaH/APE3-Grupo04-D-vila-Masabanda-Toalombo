import java.util.Scanner;

public class SistemaVentasIntegrado {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 1. ACUMULADORES Y CONTADORES GLOBALES
            int numeroVentas = 0;
            int totalUnidadesVendidas = 0;
            double totalRecaudado = 0.0;
            double ventaMayor = 0.0;

            int opcionMenu = 0;

            // 2. MENÚ PRINCIPAL CON DO-WHILE
            do {
                System.out.println("\n=================================");
                System.out.println("   SISTEMA INTEGRADO DE VENTAS   ");
                System.out.println("=================================");
                System.out.println("1. Registrar venta");
                System.out.println("2. Mostrar estadísticas");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                // Validar que la opción ingresada sea un entero
                while (!sc.hasNextInt()) {
                    System.out.print("Entrada inválida. Ingrese un número entre 1 y 3: ");
                    sc.next();
                }
                opcionMenu = sc.nextInt();
                sc.nextLine(); // Limpieza de búfer

                // 3. ESTRUCTURA DE SELECCIÓN SWITCH
                switch (opcionMenu) {

                    case 1:
                        System.out.println("\n--- REGISTRO DE NUEVA VENTA ---");

                        // Nombre del producto
                        System.out.print("Ingrese el nombre del producto: ");
                        String producto = sc.nextLine().trim();
                        while (producto.isEmpty()) {
                            System.out.print("El nombre no puede estar vacío. Ingrese producto: ");
                            producto = sc.nextLine().trim();
                        }

                        // Cantidad vendida con validación
                        System.out.print("Ingrese la cantidad vendida: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Inválido. Ingrese un entero para la cantidad: ");
                            sc.next();
                        }
                        int cantidad = sc.nextInt();
                        while (cantidad <= 0) {
                            System.out.print("La cantidad debe ser mayor a 0: ");
                            cantidad = sc.nextInt();
                        }

                        // Precio unitario con validación
                        System.out.print("Ingrese el precio unitario: $");
                        while (!sc.hasNextDouble()) {
                            System.out.print("Inválido. Ingrese un precio numérico válido: $");
                            sc.next();
                        }
                        double precio = sc.nextDouble();
                        while (precio <= 0) {
                            System.out.print("El precio debe ser mayor a $0.00: $");
                            precio = sc.nextDouble();
                        }

                        // Cálculo del subtotal de la venta
                        double subtotalVenta = cantidad * precio;

                        // Actualización de contadores y acumuladores
                        numeroVentas++;
                        totalUnidadesVendidas += cantidad;
                        totalRecaudado += subtotalVenta;

                        // Determinación de la mayor venta
                        if (numeroVentas == 1 || subtotalVenta > ventaMayor) {
                            ventaMayor = subtotalVenta;
                        }

                        // Detalle del comprobante
                        System.out.println("\n--- Resumen de Transacción ---");
                        System.out.println("Producto: " + producto);
                        System.out.println("Unidades: " + cantidad);
                        System.out.printf("Precio Unitario: $%.2f%n", precio);
                        System.out.printf("Subtotal: $%.2f%n", subtotalVenta);
                        System.out.println("¡Venta registrada exitosamente!");
                        break;

                    case 2:
                        System.out.println("\n=================================");
                        System.out.println("     ESTADÍSTICAS GENERALES      ");
                        System.out.println("=================================");

                        if (numeroVentas == 0) {
                            System.out.println("Aún no se han registrado ventas en el sistema.");
                        } else {
                            // Cálculo del promedio por venta
                            double promedioPorVenta = totalRecaudado / numeroVentas;

                            System.out.println("Número total de ventas: " + numeroVentas);
                            System.out.println("Unidades totales vendidas: " + totalUnidadesVendidas);
                            System.out.printf("Total acumulado recaudado: $%.2f%n", totalRecaudado);
                            System.out.printf("Venta de mayor monto: $%.2f%n", ventaMayor);
                            System.out.printf("Promedio por venta realizada: $%.2f%n", promedioPorVenta);
                        }
                        System.out.println("=================================");
                        break;

                    case 3:
                        System.out.println("\nCerrando el sistema de ventas. ¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("\nOpción inválida. Seleccione una opción entre 1 y 3.");
                        break;
                }

            } while (opcionMenu != 3);
        }
    }
}
