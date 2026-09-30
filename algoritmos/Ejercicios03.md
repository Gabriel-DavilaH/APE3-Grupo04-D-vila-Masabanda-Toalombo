### Enunciado

**Ejercicio 3. Calculadora con menú repetitivo**

Construir un programa que muestre un menú de calculadora con las siguientes opciones:

1. Sumar.
2. Restar.
3. Multiplicar.
4. Dividir.
5. Salir.

El menú debe repetirse hasta que el usuario seleccione la opción **Salir**.

El programa debe validar que:

* La opción ingresada exista en el menú.
* No se permita realizar una división entre cero.

Al seleccionar una operación, el programa debe solicitar dos números y mostrar el resultado correspondiente.

Estructuras esperadas: `do-while`, `switch`, menú, repetición, selección y validación.

### Análisis

**Entrada:**

1. Opción del menú.
2. Primer número.
3. Segundo número.

**Proceso:**

1. Mostrar el menú de opciones.
2. Leer la opción seleccionada.
3. Validar que la opción esté entre 1 y 5.
4. Si la opción es 5, finalizar el programa.
5. Solicitar el primer número.
6. Solicitar el segundo número.
7. Realizar la operación seleccionada.
8. Validar que el segundo número no sea cero en la división.
9. Mostrar el resultado de la operación.
10. Repetir el menú hasta seleccionar la opción 5.

**Salida:**

1. Resultado de la suma.
2. Resultado de la resta.
3. Resultado de la multiplicación.
4. Resultado de la división.
5. Mensaje de opción inválida cuando corresponda.
6. Mensaje de finalización del programa.


### Algoritmo

```
Inicio

    Repetir

        Mostrar "1) Sumar"
        Mostrar "2) Restar"
        Mostrar "3) Multiplicar"
        Mostrar "4) Dividir"
        Mostrar "5) Salir"

        Leer opcion

        Si opcion < 1 O opcion > 5 Entonces
            Mostrar "Opción inválida"
        SiNo

            Si opcion = 5 Entonces
                Mostrar "Saliendo del programa..."
            SiNo

                Leer n1
                Leer n2

                Segun opcion Hacer

                    Caso 1:
                        resultado ← n1 + n2
                        Mostrar resultado

                    Caso 2:
                        resultado ← n1 - n2
                        Mostrar resultado

                    Caso 3:
                        resultado ← n1 * n2
                        Mostrar resultado

                    Caso 4:
                        Mientras n2 = 0 Hacer
                            Mostrar "No se puede dividir entre cero"
                            Leer n2
                        FinMientras

                        resultado ← n1 / n2
                        Mostrar resultado

                FinSegun

            FinSi

        FinSi

    Hasta Que opcion = 5

Fin
```

