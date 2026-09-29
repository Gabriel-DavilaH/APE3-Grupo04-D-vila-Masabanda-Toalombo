<div align="center">

  <img src="https://capsule-render.vercel.app/api?type=wave&color=0:0D1B3D,50:4B1FA6,100:00C9FF&height=220&section=header&text=APE-3&fontSize=52&fontColor=FFFFFF&animation=fadeIn&fontAlignY=38" alt="Encabezado animado del repositorio Estructuras de control"/>

  <br>

  <img src="https://readme-typing-svg.demolab.com/?font=Fira+Code&weight=600&size=22&duration=3500&pause=900&color=00C9FF&center=true&vCenter=true&width=800&height=90&lines=Si+lo+puedes+imaginar%2C+lo+puedes+programar.;Primero+lo+imaginamos.+Luego+lo+programamos.;Y+si+falla%2C+lo+depuramos+juntos.;Que+la+fuerza+del+debug+nos+acompa%C3%B1e." alt="Frases animadas con efecto de escritura"/>

  <br>

</div>

## 👥 Integrantes

* Toalombo Punina Jeremy Patricio
* Dávila Hernández Gabriel Marcelo
* Masabanda Chasiluisa Jeremy Isaac

## 🎯 Objetivo

Comprender y aplicar los conceptos teóricos y prácticos de las estructuras de control repetitivas (While, Do While y For) mediante la resolución de algoritmos, con el fin de automatizar procesos iterativos, optimizar la lógica de programación y diferenciar cuándo es más eficiente utilizar cada tipo de bucle según la naturaleza del problema.

## 📝 Descripción de los Ejercicios

1. Promedio de calificaciones
Desarrolle un programa que solicite la cantidad N de estudiantes y luego registre sus calificaciones, válidas entre 0 y 10. El sistema debe mostrar el promedio general, la calificación mayor, la menor, el número de aprobados y el número de reprobados.
Estructura sugerida: for. Conceptos: Contador, acumulador, validación, mayor y menor.
2. Control de edades con centinela
Ingrese edades válidas de personas. El ingreso terminará cuando se escriba -1. El programa deberá determinar cuántos son menores de edad, adultos y mayores de 65 años, además del promedio de edades ingresadas.
Estructura sugerida: while. Conceptos: Centinela, contadores, acumulador y validación.
3. Calculadora con menú repetitivo
Construya un menú con las opciones: 1) Sumar, 2) Restar, 3) Multiplicar, 4) Dividir y 5) Salir. El menú debe repetirse hasta seleccionar Salir. Controle la división para evitar dividir entre cero.
Estructura sugerida: do-while + switch. Conceptos: Menú, repetición, selección y validación.
4. Tabla de multiplicar validada
Solicite un número entre 1 y 12. Si el dato es incorrecto, deberá volver a solicitarlo. Una vez validado, genere su tabla de multiplicar desde 1 hasta 12.
Estructura sugerida: while + for. Conceptos: Validación previa y ciclo controlado.
5. Cajero universitario
Implemente un sistema con saldo inicial y las opciones: consultar saldo, depositar, retirar, ver número de transacciones y salir. No permita valores negativos ni retiros superiores al saldo disponible.
Estructura sugerida: do-while. Conceptos: Menú, acumuladores, contador y validaciones.
6. Estadísticas de un curso
Registre las calificaciones de N estudiantes. Calcule promedio general, nota mayor, nota menor, cantidad y porcentaje de aprobados y reprobados. Valide que todas las notas estén entre 0 y 10.
Estructura sugerida: for. Conceptos: Acumuladores, contadores, porcentajes y validación.
7. Venta de entradas CineCampus
Registre de manera repetitiva ventas de entradas. Para cada venta solicite tipo de entrada, cantidad y precio. Calcule subtotal por venta y total acumulado. Después de cada registro pregunte si desea realizar otra venta.
Estructura sugerida: do-while. Conceptos: Acumulador, contador, selección y repetición.
8. Estacionamiento universitario
Registre varios vehículos indicando tipo, número de horas y tarifa correspondiente. Calcule el valor individual y la recaudación total. El proceso finalizará al ingresar una opción centinela definida por el equipo.
Estructura sugerida: while. Conceptos: Centinela, acumuladores, validaciones y selección.
9. Matriz lógica de asistencia
Solicite el número de estudiantes y el número de días. Para cada estudiante registre su asistencia mediante P (presente) o A (ausente). Al finalizar muestre las asistencias y ausencias de cada estudiante y los totales del curso.
Estructura sugerida: for anidado. Conceptos: Ciclos anidados, contadores y validación.
10. Sistema integrado de ventas
Desarrolle un sistema con menú: 1) Registrar venta, 2) Mostrar estadísticas y 3) Salir. Cada venta debe solicitar producto, cantidad y precio. Las estadísticas mostrarán número de ventas, unidades vendidas, total recaudado, venta mayor y promedio por venta.
Estructura sugerida: do-while + for/while. Conceptos: Integración de menús, ciclos, acumuladores, contadores y validaciones.


## 🏗️ Estructuras Utilizadas

* **Bucle `while`:**
  * Validación de datos de entrada (número de estudiantes > 0 y notas en rango 0-10).

* **Bucle `for`:**
  * Recorrido del arreglo para procesar las `n` calificaciones, acumular la suma y calcular estadísticas.

* **Condicionales `if-else`:**
  * Clasificación de aprobados/reprobados y actualización de nota máxima y mínima.
*   **Arreglos:**
    *   `double[] notas` para almacenar las calificaciones de todos los estudiantes.


