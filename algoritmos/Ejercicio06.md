## Enunciado 
Registre las calificaciones de N estudiantes. Calcule promedio general, nota mayor, nota menor, cantidad y porcentaje de aprobados y reprobados. Valide que todas las notas estén entre 0 y 10.

## Análisis

Entrada:

Número de estudiantes N.
Calificación de cada estudiante.

Proceso:

Solicitar el número de estudiantes.
Validar que N sea mayor que 0.
Inicializar:
suma = 0
notaMayor = 0
notaMenor = 10
aprobados = 0
reprobados = 0
Utilizar un ciclo for para ingresar las notas.
Validar que cada nota esté entre 0 y 10.
Acumular todas las notas.
Comparar cada nota para obtener la mayor y la menor.
Si la nota es mayor o igual a 7, contar como aprobado.
Si es menor que 7, contar como reprobado.
Calcular el promedio.
Calcular el porcentaje de aprobados y reprobados.

Salida:

Promedio general.
Nota mayor.
Nota menor.
Cantidad de aprobados.
Porcentaje de aprobados.
Cantidad de reprobados.
Porcentaje de reprobados.

## Algoritmo 

    Definir n, aprobados, reprobados Como Entero
    Definir nota, suma, promedio Como Real
    Definir notaMayor, notaMenor Como Real
    Definir porcentajeAprobados, porcentajeReprobados Como Real

    suma <- 0
    notaMayor <- 0
    notaMenor <- 10
    aprobados <- 0
    reprobados <- 0

    Escribir "Ingrese el número de estudiantes:"
    Leer n

    Mientras n <= 0 Hacer
        Escribir "El número debe ser mayor que 0"
        Escribir "Ingrese nuevamente el número de estudiantes:"
        Leer n
    FinMientras

    Para i <- 1 Hasta n Hacer

        Escribir "Ingrese la nota del estudiante ", i, ":"
        Leer nota

        Mientras nota < 0 O nota > 10 Hacer
            Escribir "Nota incorrecta. Debe estar entre 0 y 10"
            Escribir "Ingrese nuevamente la nota:"
            Leer nota
        FinMientras

        suma <- suma + nota

        Si nota > notaMayor Entonces
            notaMayor <- nota
        FinSi

        Si nota < notaMenor Entonces
            notaMenor <- nota
        FinSi

        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi

    FinPara

    promedio <- suma / n

    porcentajeAprobados <- (aprobados * 100) / n
    porcentajeReprobados <- (reprobados * 100) / n

    Escribir "===== ESTADÍSTICAS DEL CURSO ====="
    Escribir "Promedio general: ", promedio
    Escribir "Nota mayor: ", notaMayor
    Escribir "Nota menor: ", notaMenor
    Escribir "Aprobados: ", aprobados
    Escribir "Porcentaje de aprobados: ", porcentajeAprobados, "%"
    Escribir "Reprobados: ", reprobados
    Escribir "Porcentaje de reprobados: ", porcentajeReprobados, "%"

FinAlgoritmo
