## Enunciado 
Solicite un número entre 1 y 12. Si el dato es incorrecto, deberá volver a solicitarlo. Una vez validado, genere su tabla de multiplicar desde 1 hasta 12.
## Análisis

Entrada:

Saldo inicial.
Opción seleccionada del menú.
Valor para depositar o retirar.

Proceso:

Inicializar el saldo en $100.
Inicializar el contador de transacciones en 0.
Mostrar un menú con las opciones:
Consultar saldo.
Depositar.
Retirar.
Ver número de transacciones.
Salir.
Si se selecciona depositar, verificar que el valor sea mayor que 0.
Si se selecciona retirar, verificar que:
El valor sea mayor que 0.
El valor no supere el saldo disponible.
Cada depósito o retiro válido aumenta el contador de transacciones.
Repetir el menú hasta seleccionar salir.

Salida:

Saldo disponible.
Confirmación de depósitos y retiros.
Mensajes de validación.
Número de transacciones realizadas.

## Algoritmo 

    Definir saldo, valor Como Real
    Definir opcion, transacciones Como Entero

    saldo <- 100
    transacciones <- 0

    Repetir

        Escribir "===== CAJERO UNIVERSITARIO ====="
        Escribir "1. Consultar saldo"
        Escribir "2. Depositar"
        Escribir "3. Retirar"
        Escribir "4. Ver número de transacciones"
        Escribir "0. Salir"
        Leer opcion

        Segun opcion Hacer

            1:
                Escribir "Saldo disponible: $", saldo

            2:
                Escribir "Ingrese el valor a depositar:"
                Leer valor

                Si valor > 0 Entonces
                    saldo <- saldo + valor
                    transacciones <- transacciones + 1
                    Escribir "Depósito realizado correctamente"
                SiNo
                    Escribir "El valor debe ser mayor que 0"
                FinSi

            3:
                Escribir "Ingrese el valor a retirar:"
                Leer valor

                Si valor <= 0 Entonces
                    Escribir "El valor debe ser mayor que 0"
                SiNo
                    Si valor > saldo Entonces
                        Escribir "Saldo insuficiente"
                    SiNo
                        saldo <- saldo - valor
                        transacciones <- transacciones + 1
                        Escribir "Retiro realizado correctamente"
                    FinSi
                FinSi

            4:
                Escribir "Número de transacciones: ", transacciones

            0:
                Escribir "Gracias por utilizar el cajero"

            De Otro Modo:
                Escribir "Opción incorrecta"

        FinSegun

    Hasta Que opcion = 0

FinAlgoritmo
