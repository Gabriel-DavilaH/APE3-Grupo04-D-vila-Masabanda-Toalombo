## Enunciado
Ejercicio 9. Matriz lógica de asistencia

Solicite el número de estudiantes y el número de días. Para cada estudiante registre su asistencia mediante P (presente) o A (ausente). 
Al finalizar muestre las asistencias y ausencias de cada estudiante y los totales del curso.

## Análisis 
**Entrada**

Número de estudiantes (numEstudiantes): Entero positivo mayor a cero.

Número de días a registrar (numDias): Entero positivo mayor a cero.

Estado de asistencia diario por estudiante (estado): Carácter o cadena ("P" para Presente, "A" para Ausente).

**Proceso**

Solicitar y leer el número de estudiantes validando que sea mayor a cero.

Solicitar y leer el número de días validando que sea mayor a cero.

Inicializar el contador global de asistencias del curso en cero (totalAsistenciasCurso = 0).

Inicializar el contador global de ausencias del curso en cero (totalAusenciasCurso = 0).

Iniciar el ciclo externo para iterar desde el estudiante 1 hasta el número total de estudiantes.

En cada estudiante, inicializar los contadores individuales de asistencias y ausencias en cero (asistenciasEstudiante = 0, ausenciasEstudiante = 0).

Iniciar el ciclo interno para iterar desde el día 1 hasta el número total de días.

Solicitar y leer el estado de asistencia ("P" o "A") para el estudiante y día actual.

Validar que la entrada sea estrictamente "P" o "A".

Evaluar si el estado es "P" para incrementar asistenciasEstudiante en 1; de lo contrario, incrementar ausenciasEstudiante en 1.

Acumular las asistencias y ausencias del estudiante actual a los contadores globales del curso (totalAsistenciasCurso y totalAusenciasCurso).

Mostrar el resumen individual de asistencias y ausencias del estudiante procesado.

**Salida**

Total de asistencias individuales: Número de días que el estudiante estuvo presente.

Total de ausencias individuales: Número de días que el estudiante estuvo ausente.

Total general de asistencias del curso: Suma acumulada de marcas "P" de todos los estudiantes.

Total general de ausencias del curso: Suma acumulada de marcas "A" de todos los estudiantes.

## Algoritmo
Algoritmo MatrizAsistencia

    Definir numEstudiantes, numDias, i, j Como Entero
    Definir asistenciasEstudiante, ausenciasEstudiante Como Entero
    Definir totalAsistenciasCurso, totalAusenciasCurso Como Entero
    Definir estado Como Cadena

    totalAsistenciasCurso <- 0
    totalAusenciasCurso <- 0

    Escribir "=== SISTEMA DE REGISTRO DE ASISTENCIA ==="

    Escribir "Ingrese número de estudiantes:"
    Leer numEstudiantes
    Mientras numEstudiantes <= 0 Hacer
        Escribir "El número debe ser mayor a 0. Ingrese nuevamente:"
        Leer numEstudiantes
    FinMientras

    Escribir "Ingrese número de días:"
    Leer numDias
    Mientras numDias <= 0 Hacer
        Escribir "El número debe ser mayor a 0. Ingrese nuevamente:"
        Leer numDias
    FinMientras

    Para i <- 1 Hasta numEstudiantes Con Paso 1 Hacer
        Escribir "--- Estudiante #", i, " ---"
        asistenciasEstudiante <- 0
        ausenciasEstudiante <- 0

        Para j <- 1 Hasta numDias Con Paso 1 Hacer
            Escribir "Día ", j, " [P/A]:"
            Leer estado
            estado <- Mayusculas(estado)

            Mientras estado <> "P" Y estado <> "A" Hacer
                Escribir "Inválido. Ingrese 'P' para presente o 'A' para ausente:"
                Leer estado
                estado <- Mayusculas(estado)
            FinMientras

            Si estado = "P" Entonces
                asistenciasEstudiante <- asistenciasEstudiante + 1
            Sino
                ausenciasEstudiante <- ausenciasEstudiante + 1
            FinSi
        FinPara

        totalAsistenciasCurso <- totalAsistenciasCurso + asistenciasEstudiante
        totalAusenciasCurso <- totalAusenciasCurso + ausenciasEstudiante

        Escribir "Resumen Estudiante #", i, ": ", asistenciasEstudiante, " Asistencias | ", ausenciasEstudiante, " Ausencias"
    FinPara

    Escribir "================================="
    Escribir "TOTALES GENERALES DEL CURSO"
    Escribir "Total Asistencias (P): ", totalAsistenciasCurso
    Escribir "Total Ausencias (A): ", totalAusenciasCurso
    Escribir "================================="

FinAlgoritmo
