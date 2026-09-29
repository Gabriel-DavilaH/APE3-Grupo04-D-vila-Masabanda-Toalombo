import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menores = 0; // < 18
        int adultos = 0; // 18 - 65
        int mayores65 = 0; // > 65
        int totalPersonas = 0;
        int sumaEdades = 0;

        System.out.println("Ingrese edades (termine con -1):");

        while (true) {
            System.out.print("Edad: ");
            int edad = sc.nextInt();

            // Centinela
            if (edad == -1) {
                break;
            }

            // Validación: no se aceptan edades negativas ni irreales
            while (edad < 0 || edad > 120) {
                System.out.print("Edad invalida (0-120). Ingrese de nuevo: ");
                edad = sc.nextInt();
                if (edad == -1) break;
            }
            
            if (edad == -1) break;

            // Acumulador y contador general
            sumaEdades += edad;
            totalPersonas++;

            // Contadores por categoria
            if (edad < 18) {
                menores++;
            } else if (edad <= 65) {
                adultos++;
            } else {
                mayores65++;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        if (totalPersonas > 0) {
            double promedio = (double) sumaEdades / totalPersonas;
            System.out.println("Total personas: " + totalPersonas);
            System.out.println("Menores de edad (<18): " + menores);
            System.out.println("Adultos (18-65): " + adultos);
            System.out.println("Mayores de 65: " + mayores65);
            System.out.println("Promedio de edades: " + promedio);
        } else {
            System.out.println("No se ingreso ninguna edad.");
        }

        sc.close();
    }
}
