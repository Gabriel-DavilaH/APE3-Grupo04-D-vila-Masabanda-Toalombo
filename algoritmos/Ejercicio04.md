## Análisis

Entrada:

Un número entero entre 1 y 12.

Proceso:

Solicitar al usuario un número.
Validar mediante un ciclo while que el número esté entre 1 y 12.
Si el número es incorrecto, volver a solicitarlo.
Una vez validado, utilizar un ciclo for.
El ciclo for debe recorrer los números desde 1 hasta 12.
Multiplicar el número ingresado por cada valor del ciclo.
Mostrar cada resultado de la tabla.

Salida:

La tabla de multiplicar del número ingresado desde 1 hasta 12.

Estructuras utilizadas:

while → validación del número.
if → mostrar mensaje cuando el dato es incorrecto.
for → generar la tabla de multiplicar.
## Algoritmo 
````
Algoritmo TablaMultiplicar

    Definir numero, i Como Entero

    numero <- 0

    Mientras numero < 1 O numero > 12 Hacer

        Escribir "Ingrese un número entre 1 y 12:"
        Leer numero

        Si numero < 1 O numero > 12 Entonces
            Escribir "Dato incorrecto. Intente nuevamente."
        FinSi

    FinMientras

    Escribir "Tabla del ", numero

    Para i <- 1 Hasta 12 Hacer
        Escribir numero, " x ", i, " = ", numero * i
    FinPara

FinAlgoritmo
````
