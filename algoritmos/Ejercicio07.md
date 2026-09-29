## Enunciado
Ejercicio 7. Venta de entradas CineCampus
Registre de manera repetitiva ventas de entradas. Para cada venta solicite tipo de entrada, cantidad y precio. 
Calcule subtotal por venta y total acumulado. Después de cada registro pregunte si desea realizar otra venta.

## Análisis
**Entrada**

Tipo de entrada (tipoEntrada): Texto que describe la categoría del boleto (Ej: General, 3D, VIP).

Cantidad (cantidad): Número entero mayor a cero ($>0$) que representa la cantidad de boletos a comprar.

Precio unitario (precio): Número decimal mayor a cero ($>0.0$) que indica el costo individual por entrada.

Desea continuar (respuesta): Carácter o texto ('S'/'N') ingresado al final de cada iteración para determinar si se procesa un nuevo registro.

(Sí) o finalizar el ciclo si la respuesta es 'N' (No).

**Proceso**

Inicializar el contador de ventas en cero (contadorVentas = 0).

Inicializar el acumulador del monto recaudado en cero (totalAcumulado = 0.0).

Iniciar la estructura de repetición do-while.

Incrementar el contador de ventas en 1 en cada iteración (contadorVentas = contadorVentas + 1).

Solicitar y leer el tipo de entrada, la cantidad de boletos y el precio unitario.

Validar que la cantidad ingresada sea un número entero positivo mayor a cero.

Validar que el precio unitario ingresado sea un valor numérico positivo mayor a cero.

Calcular el subtotal de la transacción multiplicando la cantidad por el precio unitario (subtotal = cantidad * precio).

Acumular el subtotal al total general del sistema (totalAcumulado = totalAcumulado + subtotal).

Preguntar al usuario si desea registrar otra venta.

Evaluar la condición de parada para repetir el proceso si la respuesta es S o finalizar el ciclo si es N.

**Salida**

Subtotal de la venta actual: El monto calculado para la transacción en curso.

Total acumulado parcial: La suma del dinero recaudado hasta ese momento.

Número total de ventas: El valor acumulado en el contador de transacciones.

Monto total general: La suma final recaudada de todas las ventas registradas.

## Algoritmo

Algoritmo VentaEntradasCineCampus

    Definir tipoEntrada Como Cadena
    Definir cantidad, contadorVentas Como Entero
    Definir precio, subtotal, totalAcumulado Como Real
    Definir respuesta Como Caracter

    totalAcumulado <- 0.0
    contadorVentas <- 0

    Escribir "=== SISTEMA DE VENTA DE ENTRADAS CINECAMPUS ==="

    Hacer
        contadorVentas <- contadorVentas + 1
        Escribir "--- Venta #", contadorVentas, " ---"

        Escribir "Ingrese el tipo de entrada:"
        Leer tipoEntrada

        Escribir "Ingrese la cantidad de entradas:"
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

        subtotal <- cantidad * precio
        totalAcumulado <- totalAcumulado + subtotal

        Escribir "Subtotal de esta venta: $", subtotal
        Escribir "Total acumulado actual: $", totalAcumulado

        Escribir "¿Desea registrar otra venta? (S/N):"
        Leer respuesta

    Hasta Que Mayusculas(respuesta) <> "S"

    Escribir "================================="
    Escribir "RESUMEN FINAL DE VENTAS"
    Escribir "Total de ventas registradas: ", contadorVentas
    Escribir "Monto total acumulado: $", totalAcumulado
    Escribir "================================="

FinAlgoritmo
