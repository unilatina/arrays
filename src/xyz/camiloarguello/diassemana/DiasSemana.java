package xyz.camiloarguello.diassemana;

public class DiasSemana {

	public static void main(String[] args) {
		
		// Arreglo 1 dimensi�n
		char[] arreglo1Dimension = {'L'};
		System.out.println("El dato almacenado en 1 dimension es: " + arreglo1Dimension[0]);
		
		
		
		// Arreglo 2 dimensiones
		/*
		 * 
		 * La primer llave "{" representa la caja grande
		 * La segunda llave "{" representa una posici�n o un espacio dentro de la caja
		 * 
		 * Supongamos que esta es nuestra caja:
		 * -------
		 * |  |  |
		 * -------
		 * 
		 * En el primer espacio almacenamos 'a' y en el segundo 'b'.
		 * ---------
		 * | a | b |
		 * ---------
		 * 
		 * Tal como funciona una caja de galletas
		 * 
		 * */
		char[][] arreglo2Dimension = { {'a'} , {'b'} };
		System.out.println("El primer dato almacenado en el array 2D es: " + arreglo2Dimension[0][0]);
		System.out.println("El segundo dato almacenado en el array 2D es: " + arreglo2Dimension[1][0]);
		
		
		
		// Arreglo 3 dimensiones
		/**
		 * 
		 * Como son 3 llaves "{", temenos un arreglo de 3 Dimensiones
		 * Tambi�n podemos ver esto al declarar el tipo de dato char[][][] con 3 llaves cuadradas que representan los 3 dimensiones (ancho,alto,largo)
		 * 
		 * Nuestro array se ver�a de la siguiente forma
		 * 
		 *  -------------------------------- Caja Padre --------------------------------- 
 		 *  | ------------Caja Hijo	1------------   ----------- Caja Hijo 2  ---------- | 
		 *  | | ---------  ---------  --------- |   | ---------  ---------  --------- | |
		 *  | | | a | b |  | c | d |  | e |	f | |   | | g | h |  | i | j |  | k | l | | |
		 *  | | ---------  ---------  --------- |   | ---------  ---------  --------- | |
		 *  | -----------------------------------   -----------------------------------	|
		 *  -----------------------------------------------------------------------------
		 * 
		 * Para encontrar una posici�n por ejemplo 'a' dentro del array hacemos lo siguiente
		 * 
		 * 1. Invocamos el nombre del array
		 * 
		 * 		arreglo3Dimension
		 * 
		 * 2. Le agregamos el numero de dimensiones, o llaves cuadradas, en este caso son 3
		 * 
		 * 		arreglo3Dimension[][][]
		 * 
		 * 3. A cada llave cuadrada le damos un valor que no sea mayor al tama�o del array. Por ejemplo el array del fondo de a y b tiene solo 2 espacios
		 * as� que tiene de tama�o 2.
		 * Iniciamos llamando la caja padre.
		 * 
		 * 		arreglo3Dimension[0][][]
		 * 
		 * Fijense del 0 inicial ya que solo hay 1 caja padre.
		 * Le a�adimos la segunda caja Hijo. Como hay 2 escojemos uno de los dos. En este caso el primero. Y como sabemos que para llamar al primero debemos llamar la posici�n 0 
		 * 
		 * 
		 * 		arreglo3Dimension[0][0][]
		 * 
		 * Y finalmente llamamos el elemento de los nietos, para este ejemplo a y b.
		 *		
		 *		arreglo3Dimension[0][0][0]
		 *
		 *Cuando imprimamos este comando, nos va a mostrar el valor de 'a'.
		 * 
		 * 
		 */
		char[][][] arreglo3Dimension = { { {'a','b'}, {'c','d'},{'e','f'} }, { {'g','h'}, {'i','j'}, {'k','l'} } };
		System.out.println("El primer dato almacenado en el array 3D es: " + arreglo3Dimension[0][0][0]);
		System.out.println("El segundo dato almacenado en el array 3D es: " + arreglo3Dimension[0][0][1]);
		System.out.println("El tercer dato almacenado en el array 3D es: " + arreglo3Dimension[0][1][0]);
		System.out.println("El cuarto dato almacenado en el array 3D es: " + arreglo3Dimension[0][1][1]);
		System.out.println("El quinto dato almacenado en el array 3D es: " + arreglo3Dimension[0][2][0]);
		System.out.println("El sexto dato almacenado en el array 3D es: " + arreglo3Dimension[0][2][1]);
	}

}
