# Operadores

Los operadores, como su nombre lo indica, permiten llevar a cabo operaciones sobre los datos. Se pueden dividir en función de la cantidad de datos con los que opera. Sobre uno (operador unario), sobre dos (operador binario) o sobre tres (operador ternario). Son fundamentales para cualquier lenguaje de programación y, aunque suelen ser parecidos, tienen ciertas diferencias que se deben de considerar.

## Tipos de operadores en JAVA

Existen diversas clasificaciones para los operadores. Nosotros usaremos, en JAVA, la siguiente:

- Operadores aritméticos
- Operadores unarios
- Operador de asignación
- Operadores relacionales
- Operadores lógicos
- Operador ternario
- Operadores bit a bit
- Operadores shift
- Operador de instancia
- Precedencia y Asociatividad de Operadores

Clasificación de Alex Walton (Todos los Operadores en Java con Ejemplos).

## Operadores Aritméticos

Se utilizan para realizar operaciones aritmeticas simples en tipos de datos primitivos. Y suelen ser las más similiares entre los lenguajes de programación.

- Suma: +
- Resta: -
- Multiplicación: *
- División: /
- Módulo: % (Obtiene el residuo de la división)

## Operadores Unarios

Se utilizan para operar solamente un dato. Son usados para incrementar, disminuir o negar un valor.

- Cambiar el signo de un numero: -
- Incrementar un valor en uno: ++
- Reducir un valor en uno: --
- Negar un valor, invierte un valor booleano: !

## Operador de Asignación

Este operador se usa para asignar un valor a cualquier variable.
Tiene una asociación de derecha a izquierda, es decir, el valor dado en el lado derecho del operador se asigna a la variable de la izquierda y, por lo tanto, el valor del lado derecho debe declararse antes de usarlo o debe ser una constante.

### Declaración Compuesta

El operador de asignación tiene la propiedad de combinar con otros operaadores para construir versiones cortas de algunas expresiones con operadores.

- Sumar el dato izquierdo con el derecho, y asignarlo en el izquierdo: +=
- Restar el dato izquierdo con el derecho, y asignarlo en el izquierdo: -=
- Multiplicar el dato izquierdo con el derecho, y asignarlo en el izquierdo: *=
- Dividir el dato izquierdo con el derecho, y asignarlo en el izquierdo: /=
- Aumentar la potencia del dato izquierdo al derecho, y asignarlo en el izquierdo: ^=
- Calcular el modulo del dato izquierdo con el derecho, y asignarlo en el izquierdo: %=

## Operadores relacionales

Estos operadores siempre devulven un valor booleano, true o false (verdadero o falso), haciendo una comparación de expresiones. Se usan en estructuras de comparación.

- Devuelve verdadero si el dato izquierdo es igual al derecho: == (Igual a)
- Devuelve verdadero si el dato izquierdo no es igual al derecho: != (Diferente a)
- Devuelve verdadero si el dato izquierdo menor que el derecho: < (Menor que)
- Devuelve verdadero si el dato izquierdo menor o igual que el derecho: <= (Menor o igual que)
- Devuelve verdadero si el dato izquierdo es mayor que el derecho: > (Mayor que)
- Devuelve verdadero si el dato izquierdo es mayor o igual que el derecho: >= (Mayor o igual que)

## Operadores lógicos

Sirven para realizar las operaciones lógicas "AND" y "OR".

- AND, devuelve verdadero cuando ambas condiciones son verdaderas. Se usan los simbolos &&
- OR, devuelve verdadero si al menos una de las dos condiciones. Se usan los simbolos ||

## Operador ternario

Sirve para abreviar la estructura if-else. Es llamado ternario debido a los tres operadores que contiene.

- condición ? if true : if false
