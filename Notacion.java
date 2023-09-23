//Importaciones necesarias
import java.util.Stack;

//Clase
public class Notacion {

  /**
   * Comprueba si un caracter es un operador.
   *
   * @param caracter El caracter que se va a verificar.
   * @return true si el caracter es un operador valido (+, -, *, /), false en caso contrario.
   */
	public boolean esOperador(char caracter) {
        return (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/');
  }//cierra esOperador

 /**
  * Obtiene la precedencia de un operador.
  *
  * @param operador El operador del cual se desea obtener la precedencia.
  * @return Un valor entero que representa la precedencia del operador:
  *         - 1 para operadores de baja precedencia (+, -).
  *         - 2 para operadores de alta precedencia (*, /).
  *         - -1 si el operador no es valido.
  */
  public int precedencia(char operador) {
    switch (operador) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
    }
    return -1; // Si no es un operador valido
  }//cierra precedencia

  /**
   * Invierte una cadena de caracteres (String) dada.
   *
   * @param infija La cadena de caracteres que se desea invertir.
   * @return Un objeto StringBuilder que contiene la cadena de entrada invertida.
   */
  public StringBuilder invertir(String infija) {
	  return new StringBuilder(infija).reverse();
	}// cierra invertir
	
  /**
   * Convierte una expresion infija a una expresion prefija utilizando el algoritmo de Shunting Yard.
   * PDF en la carpeta de recursos con nombre: Algoritmo shunting yard.pdf <br>
   *
   * @param infija La expresion infija que se desea convertir a prefija.
   * @return Una cadena de caracteres que representa la expresion en notacion prefija.
   */
	public String convertirPrefijo(String infija) {
		
		StringBuilder infijaInvertida = invertir(infija);        
    Stack<Character> operadores = new Stack();
    StringBuilder prefija = new StringBuilder();
                
    for (int i = 0; i < infijaInvertida.length(); i++) {
      char c = infijaInvertida.charAt(i);

      if (Character.isLetterOrDigit(c)) {
        prefija.append(c);
      } else if (c == ')') {
        operadores.push(c);
      } else if (c == '(') {
			
        while (!operadores.isEmpty() && operadores.peek() != ')') {
          prefija.append( operadores.pop() );
        }//cierra while
        operadores.pop(); // Elimina el '(' de la pila
      } else if (esOperador(c)) {
			  int preCaracter = precedencia(c);
        while (!operadores.isEmpty() && preCaracter < precedencia(operadores.peek())) {
          prefija.append( operadores.pop() );
        }//cierra while
          operadores.push(c);
        }cierra else

    }//cierra for

    // Desapila los operadores restantes PASO 7
    while (!operadores.isEmpty()) {
      prefija.append(operadores.pop());
    } //ciera while

    // Invierte el resultado para obtener la expresion prefija
    return prefija.reverse().toString();
  }//cierra convertirPrefijo

  /**
   * Convierte una expresion infija a una expresion posfija utilizando el algoritmo de Shunting Yard inverso.
   * PDF en la carpeta de recursos con nombre: Algoritmo shunting yard.pdf <br>
   * @param infija La expresion infija que se desea convertir a posfija.
   * @return Una cadena de caracteres que representa la expresion en notacion posfija.
   */
  public String convertirPosfijo(String infija) {
      // Implementa el algoritmo de Shunting Yard inverso aqui
      // devuelve la expresion en notacion posfija como una cadena de caracteres.
      return ""; // La cadena de retorno debe contener la expresion posfija resultante.
  }
			
  
}//cierra clase
