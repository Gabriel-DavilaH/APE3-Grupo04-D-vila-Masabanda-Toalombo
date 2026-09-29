import java.util.Scanner;

public class MatrizAsistencia {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("=== SISTEMA DE REGISTRO DE ASISTENCIA ===");

            // 1. SOLICITUD Y VALIDACIÓN DE LÍMITES
            System.out.print("Ingrese el número de estudiantes: ");
            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Ingrese un entero positivo: ");
                sc.next();
            }
            int numEstudiantes = sc.nextInt();
            while (numEstudiantes <= 0) {
                System.out.print("El número de estudiantes debe ser mayor a 0: ");
                numEstudiantes = sc.nextInt();
            }

            System.out.print("Ingrese el número de días a registrar: ");
            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Ingrese un entero positivo: ");
                sc.next();
            }
            int numDias = sc.nextInt();
            while (numDias <= 0) {
                System.out.print("El número de días debe ser mayor a 0: ");
                numDias = sc.nextInt();
            }

            // Variables para los totales generales del curso
            int totalAsistenciasCurso = 0;
            int totalAusenciasCurso = 0;

            System.out.println("\n--- REGISTRO DE ASISTENCIA (P = Presente, A = Ausente) ---");

            // 2. CICLO EXTERNO: RECORRE ESTUDIANTES
            for (int i = 1; i <= numEstudiantes; i++) {
                System.out.println("\nEstudiante #" + i + ":");

                int asistenciasEstudiante = 0;
                int ausenciasEstudiante = 0;

                // 3. CICLO INTERNO: RECORRE DÍAS
                for (int j = 1; j <= numDias; j++) {
                    System.out.print("  Día " + j + " [P/A]: ");
                    String estado = sc.next().toUpperCase();

                    // Validación del estado
                    while (!estado.equals("P") && !estado.equals("A")) {
                        System.out.print("  Inválido. Ingrese 'P' para presente o 'A' para ausente: ");
                        estado = sc.next().toUpperCase();
                    }

                    // Contadores individuales
                    if (estado.equals("P")) {
                        asistenciasEstudiante++;
                    } else {
                        ausenciasEstudiante++;
                    }
                }

                // Acumulación a los totales del curso
                totalAsistenciasCurso += asistenciasEstudiante;
                totalAusenciasCurso += ausenciasEstudiante;

                // Reporte individual
                System.out.println("-> Resumen Estudiante #" + i + ": " 
                        + asistenciasEstudiante + " Asistencias | " 
                        + ausenciasEstudiante + " Ausencias");
            }

            // 4. RESUMEN GENERAL DEL CURSO
            int totalRegistros = numEstudiantes * numDias;
            double porcentajeAsistencia = ((double) totalAsistenciasCurso / totalRegistros) * 100;

            System.out.println("\n=================================");
            System.out.println("    TOTALES GENERALES DEL CURSO  ");
            System.out.println("=================================");
            System.out.println("Total de asistencias (P): " + totalAsistenciasCurso);
            System.out.println("Total de ausencias (A):   " + totalAusenciasCurso);
            System.out.printf("Porcentaje de asistencia:  %.2f%%%n", porcentajeAsistencia);
            System.out.println("=================================");
        }
    }
}
