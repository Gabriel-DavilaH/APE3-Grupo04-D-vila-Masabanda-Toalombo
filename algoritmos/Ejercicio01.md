## Enunciado
Ejercicio 1. Promedio de calificaciones
Desarrollar un programa que solicite la cantidad N de estudiantes y registre las calificaciones de cada uno.
El programa debe validar que:

La cantidad de estudiantes sea mayor que 0.
Las calificaciones estén entre 0 y 10.

El programa debe calcular:

El promedio general.
La calificación mayor.
La calificación menor.
El número de estudiantes aprobados.
El número de estudiantes reprobados.

Se considera aprobado al estudiante que obtenga una calificación mayor o igual a 6.

Estructuras esperadas: for, while, contador, acumulador, validación, mayor y menor.


## Análisis

**Entrada:**

1. Cantidad de estudiantes `N`.
2. Calificaciones de los estudiantes.

**Proceso:**

1. Solicitar la cantidad de estudiantes.
2. Validar que `N` sea mayor que 0.
3. Solicitar la calificación de cada estudiante.
4. Validar que cada calificación esté entre 0 y 10.
5. Acumular las calificaciones.
6. Determinar la calificación mayor.
7. Determinar la calificación menor.
8. Contar los estudiantes aprobados con calificación mayor o igual a 6.
9. Contar los estudiantes reprobados con calificación menor a 6.
10. Calcular el promedio general.

**Salida:**

1. Promedio general.
2. Calificación mayor.
3. Calificación menor.
4. Número de aprobados.
5. Número de reprobados.

## Algoritmo

```
Inicio

    Leer N

    Mientras N <= 0 Hacer
        Mostrar "N debe ser mayor que 0"
        Leer N
    FinMientras

    suma ← 0
    mayor ← -1
    menor ← 11
    aprobados ← 0
    reprobados ← 0

    Para i ← 1 Hasta N Hacer

        Leer nota

        Mientras nota < 0 O nota > 10 Hacer
            Mostrar "Calificación inválida"
            Leer nota
        FinMientras

        suma ← suma + nota

        Si nota > mayor Entonces
            mayor ← nota
        FinSi

        Si nota < menor Entonces
            menor ← nota
        FinSi

        Si nota >= 6 Entonces
            aprobados ← aprobados + 1
        SiNo
            reprobados ← reprobados + 1
        FinSi

    FinPara

    promedio ← suma / N

    Mostrar "Promedio general: ", promedio
    Mostrar "Calificación mayor: ", mayor
    Mostrar "Calificación menor: ", menor
    Mostrar "Número de aprobados: ", aprobados
    Mostrar "Número de reprobados: ", reprobados

Fin
```

