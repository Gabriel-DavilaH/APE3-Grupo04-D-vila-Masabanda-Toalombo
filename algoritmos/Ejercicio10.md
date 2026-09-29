## Enunciado
Ejercicio 10. Sistema integrado de ventas

Desarrolle un sistema con menú: 1) Registrar venta, 2) Mostrar estadísticas y 3) Salir. Cada venta debe solicitar producto, cantidad y precio. 
Las estadísticas mostrarán número de ventas, unidades vendidas, total recaudado, venta mayor y promedio por venta.

## Análisis 
**Entrada**

Opción del menú (opcionMenu): Entero entre 1 y 3.

Nombre del producto (producto): Cadena de texto no vacía.

Cantidad vendida (cantidad): Entero positivo mayor a cero.

Precio unitario (precio): Valor numérico positivo mayor a cero.

**Proceso**

nicializar el contador del número de ventas en cero (numeroVentas = 0).

Inicializar el acumulador de unidades vendidas en cero (totalUnidadesVendidas = 0).

Inicializar el acumulador de total recaudado en cero (totalRecaudado = 0.0).

Inicializar el registro de venta mayor en cero (ventaMayor = 0.0).

Iniciar el ciclo de repetición do-while para mostrar el menú principal.

Mostrar las opciones disponibles: 1) Registrar venta, 2) Mostrar estadísticas, 3) Salir.

Solicitar y leer la opción seleccionada validando que sea un número válido.

Si selecciona la Opción 1 (Registrar venta):

Solicitar y leer el nombre del producto validando que no esté vacío.

Solicitar y leer la cantidad vendida validando que sea un entero mayor a cero.

Solicitar y leer el precio unitario validando que sea un valor mayor a cero.

Calcular el subtotal de la venta (subtotalVenta = cantidad * precio).

Incrementar el contador de ventas en 1 (numeroVentas = numeroVentas + 1).

Acumular las unidades vendidas (totalUnidadesVendidas = totalUnidadesVendidas + cantidad).

Acumular el subtotal al recaudado general (totalRecaudado = totalRecaudado + subtotalVenta).

Evaluar si es la primera venta o si subtotalVenta es mayor a ventaMayor; de ser así, actualizar ventaMayor con subtotalVenta.

Mostrar en pantalla el resumen de la transacción realizada.

Si selecciona la Opción 2 (Mostrar estadísticas):

Verificar si numeroVentas es igual a cero.

Si no hay ventas, mostrar mensaje indicando que no existen registros.

Si existen ventas, calcular el promedio por venta (promedioPorVenta = totalRecaudado / numeroVentas).

Mostrar el número de ventas, total de unidades vendidas, total recaudado, venta de mayor monto y el promedio por venta.

Repetir el ciclo mientras la opción elegida sea diferente de 3 (Salir).

**Salida**

Comprobante de transacción: Nombre del producto, cantidad, precio unitario y subtotal calculado de la venta actual.

Número total de ventas realizadas: Valor almacenado en el contador numeroVentas.

Unidades totales vendidas: Suma acumulada en totalUnidadesVendidas.

Total general recaudado: Suma acumulada en totalRecaudado.

Venta de mayor monto: El importe máximo guardado en ventaMayor.

Promedio por venta realizada: Resultado de la división del total recaudado entre el número de ventas.

## Algoritmo
Algoritmo SistemaVentasIntegrado

    Definir opcionMenu, numeroVentas, totalUnidadesVendidas, cantidad Como Entero
    Definir totalRecaudado, ventaMayor, precio, subtotalVenta, promedioPorVenta Como Real
    Definir producto Como Cadena

    numeroVentas <- 0
    totalUnidadesVendidas <- 0
    totalRecaudado <- 0.0
    ventaMayor <- 0.0

    Hacer
        Escribir "================================="
        Escribir "   SISTEMA INTEGRADO DE VENTAS   "
        Escribir "================================="
        Escribir "1. Registrar venta"
        Escribir "2. Mostrar estadísticas"
        Escribir "3. Salir"
        Escribir "Seleccione una opción:"
        Leer opcionMenu

        Segun opcionMenu Hacer
            1:
                Escribir "--- REGISTRO DE NUEVA VENTA ---"
                Escribir "Ingrese nombre del producto:"
                Leer producto
                Mientras Longitud(producto) = 0 Hacer
                    Escribir "El nombre no puede estar vacío. Ingrese nuevamente:"
                    Leer producto
                FinMientras

                Escribir "Ingrese la cantidad vendida:"
                Leer cantidad
                Mientras cantidad <= 0 Hacer
                    Escribir "La cantidad debe ser mayor a 0. Ingrese nuevamente:"
                    Leer cantidad
                FinMientras

                Escribir "Ingrese el precio unitario:"
                Leer precio
                Mientras precio <= 0 Hacer
                    Escribir "El precio debe ser mayor a 0. Ingrese nuevamente:"
                    Leer precio
                FinMientras

                subtotalVenta <- cantidad * precio
                numeroVentas <- numeroVentas + 1
                totalUnidadesVendidas <- totalUnidadesVendidas + cantidad
                totalRecaudado <- totalRecaudado + subtotalVenta

                Si numeroVentas = 1 O subtotalVenta > ventaMayor Entonces
                    ventaMayor <- subtotalVenta
                FinSi

                Escribir "Producto: ", producto
                Escribir "Cantidad: ", cantidad
                Escribir "Subtotal de la venta: $", subtotalVenta

            2:
                Escribir "================================="
                Escribir "     ESTADÍSTICAS GENERALES      "
                Escribir "================================="
                Si numeroVentas = 0 Entonces
                    Escribir "No se han registrado ventas aún."
                Sino
                    promedioPorVenta <- totalRecaudado / numeroVentas
                    Escribir "Número de ventas: ", numeroVentas
                    Escribir "Unidades vendidas: ", totalUnidadesVendidas
                    Escribir "Total recaudado: $", totalRecaudado
                    Escribir "Venta mayor: $", ventaMayor
                    Escribir "Promedio por venta: $", promedioPorVenta
                FinSi

            3:
                Escribir "Saliendo del sistema..."

            De Otro Modo:
                Escribir "Opción inválida. Intente de nuevo."
        FinSegun

    Hasta Que opcionMenu = 3

FinAlgoritmo
