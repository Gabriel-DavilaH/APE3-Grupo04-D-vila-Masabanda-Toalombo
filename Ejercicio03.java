import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            // Si es salir, no pide numeros
            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Validacion de opcion
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida. Intente de nuevo.");
                continue;
            }

            System.out.print("Ingrese primer numero: ");
            double n1 = sc.nextDouble();
            System.out.print("Ingrese segundo numero: ");
            double n2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    // Validacion division entre cero
                    while (n2 == 0) {
                        System.out.print("No se puede dividir entre cero. Ingrese otro divisor: ");
                        n2 = sc.nextDouble();
                    }
                    System.out.println("Resultado: " + (n1 / n2));
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}
