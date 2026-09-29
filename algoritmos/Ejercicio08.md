## Enunciado
Ejercicio 8. Estacionamiento universitario

Registre varios vehículos indicando tipo, número de horas y tarifa correspondiente. Calcule el valor individual y la recaudación total. 
El proceso finalizará al ingresar una opción centinela definida por el equipo.

## Análisis
**Entrada**

Tipo de vehículo (tipoVehiculo): Texto que indica la categoría (ej: Auto, Moto, Bus).

Número de horas (horas): Entero positivo que representa el tiempo de permanencia.

Tarifa por hora (tarifa): Valor numérico decimal positivo que corresponde al costo de la hora según el tipo de vehículo.

Valor centinela: Se define la palabra "FIN" en el tipo de vehículo (o la respuesta "NO") para detener el registro repetitivo de datos.

**Proceso**

Inicializar el contador de vehículos atendidos en cero (contadorVehiculos = 0).

Inicializar el acumulador del monto recaudado en cero (totalRecaudado = 0.0).

Definir la opción centinela de finalización (CENTINELA = "FIN").

Solicitar y leer el tipo de vehículo ingresado.

Iniciar el bucle de repetición mientras el tipo de vehículo sea diferente de la palabra centinela "FIN".

Solicitar y leer el número de horas de permanencia.

Validar que el número de horas sea un valor entero positivo mayor a cero.

Solicitar y leer la tarifa asignada por hora.

Validar que la tarifa por hora sea un valor numérico positivo mayor a cero.

Calcular el pago individual del vehículo multiplicando las horas por la tarifa por hora (valorIndividual = horas * tarifa).

Acumular el pago individual al valor total general (totalRecaudado = totalRecaudado + valorIndividual).

Incrementar el contador de vehículos atendidos en 1 (contadorVehiculos = contadorVehiculos + 1).

Solicitar de nuevo el tipo de vehículo para evaluar la condición centinela en la siguiente iteración.

**Salida**

Valor individual a pagar: El monto calculado según el tiempo de permanencia y tarifa del vehículo procesado.

Total de vehículos registrados: El número total de unidades atendidas almacenado en el contador.

Recaudación total general: El monto acumulado acumulado por el estacionamiento durante la jornada.

## Algoritmo 
Algoritmo EstacionamientoUniversitario

    Definir tipoVehiculo Como Cadena
    Definir horas, contadorVehiculos Como Entero
    Definir tarifa, valorIndividual, totalRecaudado Como Real

    totalRecaudado <- 0.0
    contadorVehiculos <- 0

    Escribir "=== SISTEMA DE ESTACIONAMIENTO UNIVERSITARIO ==="
    Escribir "Ingrese 'FIN' en tipo de vehículo para terminar el registro."

    Escribir "Ingrese tipo de vehículo (Auto, Moto, Bus, etc.):"
    Leer tipoVehiculo

    // Estructura repetitiva controlada por valor centinela "FIN"
    Mientras Mayusculas(tipoVehiculo) <> "FIN" Hacer

        Escribir "Ingrese número de horas:"
        Leer horas
        Mientras horas <= 0 Hacer
            Escribir "Las horas deben ser mayor a 0. Ingrese nuevamente:"
            Leer horas
        FinMientras

        Escribir "Ingrese tarifa por hora ($):"
        Leer tarifa
        Mientras tarifa <= 0 Hacer
            Escribir "La tarifa debe ser mayor a 0. Ingrese nuevamente:"
            Leer tarifa
        FinMientras

        // Cálculos
        valorIndividual <- horas * tarifa
        totalRecaudado <- totalRecaudado + valorIndividual
        contadorVehiculos <- contadorVehiculos + 1

        // Salida individual
        Escribir "Valor a pagar por este vehículo: $", valorIndividual
        Escribir "---------------------------------------------"

        // Nueva lectura para evaluar la condición centinela
        Escribir "Ingrese tipo de vehículo (o 'FIN' para salir):"
        Leer tipoVehiculo

    FinMientras

    // Salida final
    Escribir "============================================="
    Escribir "RESUMEN DE RECAUDACIÓN DEL ESTACIONAMIENTO"
    Escribir "Total de vehículos registrados: ", contadorVehiculos
    Escribir "Recaudación total: $", totalRecaudado
    Escribir "============================================="

FinAlgoritmo
