import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes N: ");
        int N = sc.nextInt();
        
        while (N <= 0) {
            System.out.print("N debe ser mayor a 0. Ingrese de nuevo: ");
            N = sc.nextInt();
        }

        double suma = 0;
        double mayor = -1;
        double menor = 11;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Calificacion del estudiante " + i + " (0-10): ");
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Invalida. Debe ser entre 0 y 10. Ingrese de nuevo: ");
                nota = sc.nextDouble();
            }

            suma += nota;

            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;

            if (nota >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / N;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Calificacion mayor: " + mayor);
        System.out.println("Calificacion menor: " + menor);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de reprobados: " + reprobados);

        sc.close();
    }
}