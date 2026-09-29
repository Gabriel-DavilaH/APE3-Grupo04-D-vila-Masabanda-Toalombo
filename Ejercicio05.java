import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 100.00;
        double valor;
        int opcion;
        int transacciones = 0;

        do {
            System.out.println("\n===== CAJERO UNIVERSITARIO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver número de transacciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Saldo disponible: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el valor a depositar: ");
                    valor = sc.nextDouble();

                    if (valor > 0) {
                        saldo = saldo + valor;
                        transacciones++;
                        System.out.println("Depósito realizado correctamente.");
                    } else {
                        System.out.println("El valor debe ser mayor que 0.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el valor a retirar: ");
                    valor = sc.nextDouble();

                    if (valor <= 0) {
                        System.out.println("El valor debe ser mayor que 0.");
                    } else if (valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valor;
                        transacciones++;
                        System.out.println("Retiro realizado correctamente.");
                    }
                    break;

                case 4:
                    System.out.println("Número de transacciones: " + transacciones);
                    break;

                case 0:
                    System.out.println("Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
