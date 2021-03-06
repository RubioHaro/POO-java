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

## Operadores bit a bit

Los operadores a nivel de bits se utilizan para realizar la manipulación de bits individuales de un número. Se pueden usar con cualquiera de los tipos enteros. Se utilizan al realizar operaciones de actualización y consulta de árbol indexado binario. Resultaran fáciles de entender si ya se conocen los operadores lógicos, puesto que es su aplicación en bits.

- Operador AND, si ambos bits de entrada son 1, el resultado es 1. De lo contrario será 0: &
- Operador OR, si algún bit de entrada es 1, el resultado es 1. De lo contrario será 0: |
- Operador XOR, si uno de los bits es 0 y el otro es 1, el resultado es 1. Si ambos bits son iguales entonces será 0: ^
- Operador NOT, este operador unario invierte los bits: ~

## Operadores shift

Los operadores shift de Java se usan para desplazar los bits de un número hacia la izquierda o hacia la derecha, multiplicando o dividiendo el número por dos, respectivamente. Se pueden usar cuando tenemos que multiplicar o dividir un número por dos.

- Operador de desplazamiento a la izquierda : desplaza los bits del número hacia la izquierda y llena con “0” los bits desplazados. Efecto similar a la multiplicación del número con una potencia de dos. <<
- Operador de desplazamiento a la derecha firmado: desplaza los bits del número a la derecha y llena con “0” los bits desplazados. El bit más a la izquierda depende del signo del número inicial. Efecto similar a partir de dividir el número con alguna potencia de dos. >>
- Operador de cambio a la derecha sin signo: desplaza los bits del número a la derecha y llena con “0” los bits desplazados. El bit más a la izquierda se establece en 0. >>>

## Operador de Instancia

El operador de instancia se usa para verificar el tipo. Se puede usar para probar si un objeto es una instancia de una clase, una subclase o una interfaz.

- objecto instanceof class/subclass/interface
