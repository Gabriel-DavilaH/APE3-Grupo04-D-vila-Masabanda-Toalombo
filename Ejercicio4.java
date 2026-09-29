import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        // Validación del número
        while (numero < 1 || numero > 12) {
            System.out.print("Ingrese un número entre 1 y 12: ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 12) {
                System.out.println("Dato incorrecto. Intente nuevamente.");
            }
        }

        // Generar tabla de multiplicar
        System.out.println("\nTabla del " + numero);

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
