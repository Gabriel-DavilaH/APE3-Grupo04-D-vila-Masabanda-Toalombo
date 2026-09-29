import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double nota;
        double suma = 0;
        double promedio;
        double notaMayor = 0;
        double notaMenor = 10;
        int aprobados = 0;
        int reprobados = 0;

        System.out.print("Ingrese el número de estudiantes: ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("El número de estudiantes debe ser mayor que 0.");
            System.out.print("Ingrese nuevamente el número de estudiantes: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {

            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.println("Nota incorrecta. Debe estar entre 0 y 10.");
                System.out.print("Ingrese nuevamente la nota: ");
                nota = sc.nextDouble();
            }

            suma = suma + nota;

            if (nota > notaMayor) {
                notaMayor = nota;
            }

            if (nota < notaMenor) {
                notaMenor = nota;
            }

            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        promedio = suma / n;

        double porcentajeAprobados = (aprobados * 100.0) / n;
        double porcentajeReprobados = (reprobados * 100.0) / n;

        System.out.println("\n===== ESTADÍSTICAS DEL CURSO =====");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");

        sc.close();
    }
}
