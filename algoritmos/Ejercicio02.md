### Enunciado

**Ejercicio 2. Control de edades con centinela**

Desarrollar un programa que permita ingresar las edades de varias personas. El ingreso de edades finalizará cuando el usuario escriba **-1**.

El programa debe validar que:

* Las edades sean valores entre **0 y 120**.
* El valor **-1** se utilice únicamente para finalizar el ingreso.
* No se acepten edades negativas diferentes de -1.

El programa debe determinar:

* El número de menores de edad (**menores de 18 años**).
* El número de adultos (**de 18 a 65 años**).
* El número de personas mayores de 65 años.
* El total de personas ingresadas.
* El promedio de las edades ingresadas.

Si no se ingresa ninguna edad, el programa debe indicar que no se registraron personas.

Estructuras esperadas: `while`, centinela, contadores, acumulador y validación.

### Análisis

**Entrada:**

1. Edades de las personas.
2. Valor `-1` para finalizar el ingreso.

**Proceso:**

1. Solicitar una edad.
2. Verificar si la edad es `-1` para finalizar el programa.
3. Validar que la edad esté entre 0 y 120.
4. Acumular las edades ingresadas.
5. Contar el total de personas.
6. Contar las personas menores de 18 años.
7. Contar las personas de 18 a 65 años.
8. Contar las personas mayores de 65 años.
9. Calcular el promedio de las edades.
10. Verificar si se ingresó al menos una edad antes de calcular el promedio.

**Salida:**

1. Total de personas.
2. Número de menores de edad.
3. Número de adultos.
4. Número de mayores de 65 años.
5. Promedio de edades.
6. Mensaje indicando que no se ingresó ninguna edad, si corresponde.

### Algoritmo

```
Inicio

    menores ← 0
    adultos ← 0
    mayores65 ← 0
    totalPersonas ← 0
    sumaEdades ← 0

    Repetir

        Leer edad

        Si edad = -1 Entonces
            Salir
        FinSi

        Mientras edad < 0 O edad > 120 Hacer
            Mostrar "Edad inválida. Ingrese una edad entre 0 y 120"
            Leer edad

            Si edad = -1 Entonces
                Salir
            FinSi
        FinMientras

        sumaEdades ← sumaEdades + edad
        totalPersonas ← totalPersonas + 1

        Si edad < 18 Entonces
            menores ← menores + 1
        SiNo
            Si edad <= 65 Entonces
                adultos ← adultos + 1
            SiNo
                mayores65 ← mayores65 + 1
            FinSi
        FinSi

    Hasta Que edad = -1

    Si totalPersonas > 0 Entonces
        promedio ← sumaEdades / totalPersonas

        Mostrar "Total de personas: ", totalPersonas
        Mostrar "Menores de edad: ", menores
        Mostrar "Adultos: ", adultos
        Mostrar "Mayores de 65 años: ", mayores65
        Mostrar "Promedio de edades: ", promedio
    SiNo
        Mostrar "No se ingresó ninguna edad"
    FinSi

Fin
```

