# ¡Bienvenido al Convertidor de Notación Infija a Prefija y Posfija! :rocket:

¡Hola, estudiante! En esta emocionante actividad, tendrás el desafío de construir un convertidor de notación infija a prefija y posfija utilizando el algoritmo de conversión de Shunting Yard inverso. Antes de comenzar, ten en cuenta lo siguiente:

- En la clase `Notacion`, ya están implementados los siguientes métodos que pueden serte útiles:
  - `esOperador(char caracter)`: Comprueba si un carácter dado es un operador matemático válido.
  - `precedencia(char operador)`: Obtiene la precedencia de un operador matemático dado.
  - `invertir(String infija)`: Invierte una cadena de caracteres (String) dada.
  - `convertirPrefijo(String infija)`: Implementa el algoritmo de conversión de infija a prefija que implementaron en clases.
  - `convertirPosfijo(String infija)`: Este método es donde implementarás tu algoritmo de conversión de infija a posfija y será usado en tu clase principal.

## :mortar_board: Instrucciones

1. **Entrada:** Tu programa debe permitir al usuario ingresar una expresión en notación infija.

2. **Salida:** Tu programa debe imprimir la expresión equivalente en notación prefija y posfija de la siguiente manera:
   - :arrow_right: Infija --> [expresión infija]
   - :arrow_left: Prefija --> [resultado de la conversión prefija]
   - :arrow_right: Posfija --> [resultado de la conversión posfija]

:arrow_right_hook: **Importante:** Los corchetes `[ ]` y lo que está dentro de los corchetes no deben ser parte de la salida; simplemente ilustran lo que debe ir en su lugar.

   **Ejemplo:**

   Entrada caso 1: 
   $(a+b)*(c-d)+(e/f)$

   Salida: 
   - :arrow_right: Infija --> $(a+b)*(c-d)+(e/f)$
   - :arrow_left: Prefija --> $+*+ab-cd/ef$
   - :arrow_right: Posfija --> $ab+cd-*ef/+$

   Entrada caso 2: 
   $x+(y-z)*(w/v)$

   Salida: 
   - :arrow_right: Infija --> $x+(y-z)*(w/v)$
   - :arrow_left: Prefija --> $+x*-yz/wv$
   - :arrow_right: Posfija --> $xyz-wv/*+$

   Entrada caso 3: 
   $a*b-c/d$

   Salida: 
   - :arrow_right: Infija --> $a*b-c/d$
   - :arrow_left: Prefija --> $-*ab/cd$
   - :arrow_right: Posfija --> $ab*cd/-$
  

3. :computer: Asegúrate de codificar el programa en Java utilizando el editor Geany.

4. :page_facing_up: Asegúrate de tener tu código bien comentado.

5. :exclamation: ¡Evita usar acentos, ñ u otros caracteres raros en tu código y comentarios para garantizar una compilación exitosa!

6. :keyboard: No olvides indentar tu código. Si no sabes cómo hacerlo, investiga el proceso correcto de indentación en Java.

¡Desafía tus habilidades y diviértete completando esta tarea! :rocket:
