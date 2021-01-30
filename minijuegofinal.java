package minijuegos;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class minijuegofinal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		limpiar(40);
		Scanner reader = new Scanner(System.in);
		char opcion;

		// Printar menú principal
		menuprincipal();
		// Repetir en caso de que el numero escrito sea menor de 1 o mayor de 5
		do {
			System.out.println("Escribe el apartado en el que quieras acceder");
			opcion = reader.next().charAt(0);
		} while (opcion > '5' || opcion < '1');
		// Escoger entre las diferentes opciones
		switch (opcion) {
		case '1':
			eleccjugar();
			break;
		case '2':
			eleccinformacion(reader);
			break;
		case '3':
			eleccautor(reader);
			break;
		case '4':
			eleccversion(reader);
			break;
		case '5':
			estasseguro();
			break;

		}
		reader.close();

	}

	public static void menuprincipal() {
		// Menu principal
		System.out.println("+-------------------------------------+");
		System.out.println("| Escoge uno de los siguientes modos: |");
		System.out.println("+-------------------------------------+");
		System.out.println("|          [1]    Jugar               |");
		System.out.println("|          [2]  Información           |");
		System.out.println("|          [3]   Autores              |");
		System.out.println("|          [4]   Versión              |");
		System.out.println("|          [5]    Salir               |");
		System.out.println("+-------------------------------------+");
	}

	public static void eleccjugar() throws InterruptedException {
		// Funcion jugar
		Scanner reader = new Scanner(System.in);
		limpiar(40);
		menujugar();
		char eleccion;

		do {
			eleccion = reader.next().charAt(0);
		} while (eleccion != '6' && eleccion != '1' && eleccion != '2' && eleccion != '3' && eleccion != '4');
		switch (eleccion) {
		case '1':
			juego1(reader);
			break;
		case '2':
			juegodados(reader);
			break;
		case '3':
			jugarnumero(reader);
			break;
		case '4':
			encuentraelnumero(reader);
			break;
		case '5':
		case '6':
			main(null);
			break;

		}

		reader.close();
	}

	public static void menujugar() {
		// Pantalla jugar
		System.out.println("+------------------------+");
		System.out.println("|        MiniJuegos      |");
		System.out.println("+------------------------+");
		System.out.println("|                        |");
		System.out.println("|  [1] Ahorcado          |");
		System.out.println("|  [2] Los Dados         |");
		System.out.println("|  [3] Adivina el num.   |");
		System.out.println("|  [4] Encuentra el num. |");
		System.out.println("|                        |");
		System.out.println("+--------+               |");
		System.out.println("|6. Atrás|               |");
		System.out.println("+--------+---------------+");
	}

	public static void eleccinformacion(Scanner reader) throws InterruptedException {
		// Pantalla Información general
		limpiar(40);
		int atras = 0;
		System.out.println("+-------------------------------+");
		System.out.println("|           Información         |");
		System.out.println("+-------------------------------+");
		System.out.println("| Esta aplicación de minijuegos |");
		System.out.println("| està basada en la creacion y  |");
		System.out.println("| la impresion por consola de   |");
		System.out.println("| diferentes tipos de juegos de |");
		System.out.println("| mesa o juegos tradicionales.  |");
		System.out.println("| Estos juegos son: el ahorcado,|");
		System.out.println("| el juego de los dados...      |");
		System.out.println("|                               |");
		System.out.println("+---------+                     |");
		System.out.println("|6. Atrás |                     |");
		System.out.println("+---------+---------------------+");
		do {
			atras = reader.nextInt();
		} while (atras != 6);
		main(null);
		reader.close();

	}

	public static void eleccautor(Scanner reader) throws InterruptedException {
		// Pantalla autor
		int atras = 0;
		limpiar(40);
		System.out.println("+----------------+");
		System.out.println("|     Autores    |");
		System.out.println("+----------------+");
		System.out.println("| Este equipo de |");
		System.out.println("| trabajo está   |");
		System.out.println("| compuesto por: |");
		System.out.println("|                |");
		System.out.println("|  -Biel Nadal   |");
		System.out.println("|  -Xavier Tomàs |");
		System.out.println("|  -Lucas Ndong  |");
		System.out.println("|  -Andrés       |");
		System.out.println("|                |");
		System.out.println("+--------+       |");
		System.out.println("|6. Atrás|       |");
		System.out.println("+--------+-------+");
		do {
			atras = reader.nextInt();
		} while (atras != 6);
		main(null);
		reader.close();

	}

	public static void eleccversion(Scanner reader) throws InterruptedException {
		// Pantalla versión
		int eleccion = 0;
		limpiar(40);
		System.out.println("+---------------+");
		System.out.println("|    Versión    |");
		System.out.println("+---------------+");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("| La versión de |");
		System.out.println("| la aplicación |");
		System.out.println("|   es la 1.0   |");
		System.out.println("|               |");
		System.out.println("+--------+      |");
		System.out.println("|6. Atrás|      |");
		System.out.println("+--------+------+");
		do {
			eleccion = reader.nextInt();
		} while (eleccion != 6);
		main(null);

		reader.close();

	}

	public static void estasseguro() throws InterruptedException {
		// Pantalla estás seguro eleccion salir
		limpiar(40);
		Scanner reader = new Scanner(System.in);
		char seguro;
		System.out.println("+----------------+");
		System.out.println("| ¿Estás seguro? |");
		System.out.println("+----------------+");
		System.out.println("|+-----+  +-----+|");
		System.out.println("||1.Si |  |2.No ||");
		System.out.println("|+-----+  +-----+|");
		System.out.println("+----------------+");
		do {
			seguro = reader.next().charAt(0);
		} while (seguro > '2' || seguro < '1');
		switch (seguro) {
		case '1':
			eleccsalir();
			break;
		case '2':
			main(null);
			break;
		}
		reader.close();

	}

	public static void eleccsalir() {
		// Pantalla salir
		System.out.println("Cerrando programa .............");
		System.out.println("...............");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("................");
		System.out.println("...............................");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("...............................");
		limpiar(40);

	}

	public static void juego1(Scanner reader) throws InterruptedException {
		char eleccion;
		limpiar(40);
		juego1visual();
		do {
			eleccion = reader.next().charAt(0);
		} while (eleccion != '6' && eleccion != '1' && eleccion != '2' && eleccion != '3');
		switch (eleccion) {
		case '1':
			pvpjuego1(null);
			break;
		case '2':
			jugavsia(null);
			break;
		case '3':
			informacionjuego1();
			break;
		case '4':
			System.out.println("Número no válido");
			break;
		case '5':
			System.out.println("Número no válido");
			break;
		case '6':
			main(null);
			break;
		}
	}

	public static void informacionjuego1() throws InterruptedException {
		Scanner reader = new Scanner(System.in);
		char eleccion;
		limpiar(40);
		informacionjuego1visual();
		do {
			eleccion = reader.next().charAt(0);
		} while (eleccion != '6');
		juego1(reader);
	}

	public static void informacionjuego1visual() {
		System.out.println("+----------------------------+--------------------------------+");
		System.out.println("|   Información del juego    |        Reglas del juego        |");
		System.out.println("+----------------------------+--------------------------------+");
		System.out.println("| El ahorcado es un juego de |· No se pueden escoger palabras |");
		System.out.println("|    adivinanzas, es decir   |  con mas de 10 letras ni menos |");
		System.out.println("| un jugador piensa en una   |  de tres                       |");
		System.out.println("| palabra y el otro trata de |· No se puede sugerir la palabra|");
		System.out.println("|adivinarla sugeriendo letras|  tienes que ir sugeriendo letra|");
		System.out.println("| En esta versión del juego  |  por letra.                    |");
		System.out.println("| del ahorcado, existen dos  |· Es obligatorio utilizar como  |");
		System.out.println("| modos de juego, Jugador    |  mucho 10 carácteres a la hora |");
		System.out.println("| contra Jugador, y Jugador  |  de escribir la palabra y como |");
		System.out.println("| contra la máquina.         |  mínimo 3.                     |");
		System.out.println("|                            |                                |");
		System.out.println("+--------+                   |                                |");
		System.out.println("|6. Atrás|                   |                                |");
		System.out.println("+--------+-------------------+--------------------------------+");
	}

	public static void juego1visual() {
		System.out.println("+----------------------------+");
		System.out.println("|          El Ahorcado       |");
		System.out.println("+----------------------------+");
		System.out.println("|                            |");
		System.out.println("| [1] Jugador contra Jugador |");
		System.out.println("| [2]  Jugador contra IA     |");
		System.out.println("| [3] Información y Reglas   |");
		System.out.println("|                            |");
		System.out.println("+--------+                   |");
		System.out.println("|6. Atrás|                   |");
		System.out.println("+--------+-------------------+");

	}

	public static void limpiar(int lineas) {
		// Funcion para hacer una limpieza de consola, es decir, añadir linias vacias a
		// la consola
		for (int i = 0; i < lineas; i++) {
			System.out.println("");
		}
	}

	public static void pvpjuego1(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		char respuesta = ' ';
		do {

			empiezaahorcado(reader);
			System.out.println("+-----------------------------------+");
			respuesta = preguntaahorcado(" ¿Quiéres volver a jugar? ", reader);

		} while (respuesta != 'n');
		if (respuesta == 'n') {
			juego1(reader);
		}
	}

	public static char preguntaahorcado(String men, Scanner reader) {
		char respuesta;
		System.out.println(men + " (s/n)");
		respuesta = reader.next().toLowerCase().charAt(0);
		while (respuesta != 's' && respuesta != 'n') {
			System.out.println("Error! solo se admite S o N");
			respuesta = reader.next().toLowerCase().charAt(0);
		}
		return respuesta;
	}

	public static void empiezaahorcado(Scanner reader) throws InterruptedException {
		// Se pasan los datos de eleccionjugador1 y eleccionjugador2, en esta funcion
		// también se saca el numero random de la maquina y se
		// escoge quien empieza a escribir la palabra dependiendo de el resultado que
		// salga
		Random apuesta = new Random();
		int apuesta1 = 0;
		int apuesta2 = 0;
		int eleccmaquina = 0;
		do {

			// Pasar las respuestas de los jugadores de las diferentes
			// funciones(eleccionjug1 y eleccionjug2) en sus respectivas variables y printar
			// por pantalla los numeros que contienen cada una
			apuesta1 = eleccionjug1(reader);
			apuesta2 = eleccionjug2(reader);
			System.out.println("+-----------------------------+");
			System.out.println("| El Jugador 1 ha escogido: " + apuesta1 + " |");
			System.out.println("+-----------------------------+");
			System.out.println("| El Jugador 2 ha escogido: " + apuesta2 + " |");
			System.out.println("+-----------------------------+");
			eleccmaquina = apuesta.nextInt(6) + 1;
			System.out.println("|   El número ganador és: " + eleccmaquina + "   |");
			System.out.println("+-----------------------------+");
			Thread.sleep(4000);
			// Filtro para que si la apuesta del jugador 1 es igual a la del jugador2 y
			// igual a la sacada por la maquina se repite el proceso
		} while (apuesta1 == eleccmaquina && eleccmaquina == apuesta2
				|| apuesta1 != eleccmaquina && apuesta2 != eleccmaquina);
		// Si el jugador 1 gana...
		if (apuesta1 == eleccmaquina) {
			empieza1(reader);
		}
		// Si el jugador 2 gana
		if (apuesta2 == eleccmaquina) {
			empieza2(reader);
		}
	}

	public static int eleccionjug1(Scanner reader) {
		// eleccion jugador1
		int apuesta1 = 0;
		limpiar(40);
		do {
			System.out.println(
					"+-----------------------------------------------------------------------------------------------------------------------+");
			System.out.println(
					"| Jugador 1, escoge un numero aleatorio del 1 al 6, si sacas el mismo número que la màquina empiezas escogiendo palabra.|");
			System.out.println(
					"+-----------------------------------------------------------------------------------------------------------------------+");
			apuesta1 = reader.nextInt();
		} while (apuesta1 > 6 || apuesta1 < 1);
		limpiar(40);
		return apuesta1;
	}

	public static int eleccionjug2(Scanner reader) {
		// Eleccion jugador2
		int apuesta2 = 0;
		do {
			System.out.println(
					"+-----------------------------------------------------------------------------------------------------------------------+");
			System.out.println(
					"| Jugador 2, escoge un numero aleatorio del 1 al 6, si sacas el mismo número que la màquina empiezas escogiendo palabra.|");
			System.out.println(
					"+-----------------------------------------------------------------------------------------------------------------------+");
			apuesta2 = reader.nextInt();
		} while (apuesta2 > 6 || apuesta2 < 1);
		limpiar(40);
		return apuesta2;
	}

	public static void empieza1(Scanner reader) {
		// Función de cuando el jugador 1 empieza escribiendo palabra
		limpiar(40);
		// Inicializar variables, String, char y cadenas de char
		String palabraescogida;
		int fallos = 0;
		int aciertos = 0;
		int intentostotales = 15;
		aciertos = 0;
		fallos = 0;
		// Funcion para escribir la palabra
		palabraescogida = escogerpalabra1(reader);
		// Pasar la palabra escrita anteriormente a esta funcion la qual su trabajo es
		// recorrer todos los carácteres con espacios entre cada uno
		char[] separar = separarchar(palabraescogida);
		// cadena de char para saber la longitud de la palabra escrita
		char[] respuestas = new char[palabraescogida.length()];
		// recorrer la cadena de caráteres y reemplazarla por los guines bajos
		for (int i = 0; i < respuestas.length; i++) {
			respuestas[i] = '_';
		}
		System.out.println("+------------------------------------------------------------------+-----------------+");
		System.out.println(
				"| Jugador 2: Escribe un carácter que creas que contiene la palabra |  Intentos " + fallos + "/15  |");
		System.out.println("+------------------------------------------------------------------+-----------------+");
		// while para que mientras el numero de fallos sea menor que el numero de
		// intentos y que el numero de aciertos no sea igual a la longitud de la
		// cadena se repita lo que este while contiene
		while (fallos < intentostotales && aciertos != respuestas.length) {
			// llamar a la funcion que muestra la palabra reemplazada por los guiones
			visionoculta(respuestas);
			// llamar a la función ue devuelve la letra escrita por el otro usuario
			int respuesta = introducirletra(reader);

			// Recorrer los carácteres de la palabra para comprovar si esta contiene la
			// letra escrita
			for (int i = 0; i < separar.length; i++) {
				if (separar[i] == respuesta) {
					respuestas[i] = separar[i];
					separar[i] = ' ';
					aciertos++;
				}

			}
			fallos++;
			// Mostrar numero de intentos hechos hasta el momento
			System.out.println("+---------------+");
			System.out.println("| Intentos " + fallos + "/15 |");
			System.out.println("+---------------+");

		}
		// Determinar mediante estos ifs si el jugador ha ganado o ha perdido y mostrar
		// la palabra que correspondia
		if (aciertos == respuestas.length) {
			imprimeOculta("La palabra era: ", respuestas);
			// Llamar a la función ganaste
			ganaste();
		} else {
			imprimeOculta("La palabra era: ", respuestas);
			// Llamar a la función perdiste
			perdiste();
		}
	}

	public static void empieza2(Scanner reader) {

		String palabraescogida;
		int aciertos = 0;
		int fallos = 0;
		int intentostotales = 15;
		aciertos = 0;
		fallos = 0;

		palabraescogida = escogerpalabra2(reader);
		char[] separar = separarchar(palabraescogida);
		char[] respuestas = new char[palabraescogida.length()];
		for (int i = 0; i < respuestas.length; i++) {
			respuestas[i] = '_';
		}
		System.out.println("+------------------------------------------------------------------+-----------------+");
		System.out.println(
				"| Jugador 2: Escribe un carácter que creas que contiene la palabra |  Intentos " + fallos + "/15  |");
		System.out.println("+------------------------------------------------------------------+-----------------+");
		while (fallos < intentostotales && aciertos != respuestas.length) {
			visionoculta(respuestas);
			int respuesta = introducirletra(reader);

			for (int i = 0; i < separar.length; i++) {
				if (separar[i] == respuesta) {
					respuestas[i] = separar[i];
					separar[i] = ' ';
					aciertos++;
				}

			}
			fallos++;
			System.out.println("+---------------+");
			System.out.println("| Intentos " + fallos + "/15 |");
			System.out.println("+---------------+");

		}
		if (aciertos == respuestas.length) {
			imprimeOculta("La palabra era: ", respuestas);
			ganaste();
		} else {
			imprimeOculta("La palabra era: ", respuestas);
			perdiste();
		}

	}

	public static String escogerpalabra1(Scanner reader) {
		String palabra;
		limpiar(40);
		do {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|                             Jugador 1                              |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|  Escribe una palabra de como mucho 10 cáracteres y como mínimo 2   |");
			System.out.println("+--------------------------------------------------------------------+");
			palabra = reader.next().toLowerCase();
		} while (palabra.length() > 10 || palabra.length() < 3);
		limpiar(40);
		return palabra;

	}

	public static String escogerpalabra2(Scanner reader) {
		String palabra;
		limpiar(40);
		do {

			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|                             Jugador 2                              |");
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|  Escribe una palabra de como mucho 10 cáracteres y como mínimo 2   |");
			System.out.println("+--------------------------------------------------------------------+");
			palabra = reader.next().toLowerCase();
		} while (palabra.length() > 10 || palabra.length() < 3);
		limpiar(40);
		return palabra;

	}

	public static void visionoculta(char[] tusRespuestas) {
		// Funcion para añadir los espacios

		for (int i = 0; i < tusRespuestas.length; i++) {
			System.out.print(tusRespuestas[i] + " ");
		}
	}

	private static void imprimeOculta(String string, char[] tusRespuestas) {

		for (int i = 0; i < tusRespuestas.length; i++) {
			System.out.print(tusRespuestas[i] + " ");
		}
	}

	public static char[] separarchar(String palabra) {
		char[] letras;
		letras = new char[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			letras[i] = palabra.charAt(i);
		}
		return letras;
	}

	public static char introducirletra(Scanner reader) {
		char letra;
		System.out.println();
		System.out.println("+------------------------+");
		System.out.println("|  Introduce una letra   |");
		System.out.println("+------------------------+");
		letra = reader.next().toLowerCase().charAt(0);

		return letra;
	}

	public static void ganaste() {
		// Funcion para printar ganaste
		System.out.println("\r\n" + "    _  __    __ _     _  _  _ \r\n" + "|_||_|(_    /__|_||\\||_|| \\/ \\\r\n"
				+ "| || |__)   \\_|| || || ||_/\\_/\r\n" + "");
	}

	public static void perdiste() {
		// Funcion para printar perdiste
		System.out.println("\r\n" + "    _  __  _  __ _  _ ___ _  _ \r\n" + "|_||_|(_  |_)|_ |_)| \\ | | \\/ \\\r\n"
				+ "| || |__) |  |__| \\|_/_|_|_/\\_/\r\n" + "");
	}

	public static void jugavsia(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Inicializar Scanner
		Scanner reader = new Scanner(System.in);
		char respuesta = ' ';
		do {
			empiezaahorcadoia(reader);
			System.out.println("+-----------------------------------+");
			respuesta = preguntaahorcado(" ¿Quiéres volver a jugar? ", reader);

		} while (respuesta != 'n');
		// Si la respuesta del jugador es no, llamar a la funcion "juego1"
		if (respuesta == 'n') {
			juego1(reader);

		}

	}

	public static void empiezaahorcadoia(Scanner reader) throws InterruptedException {
		limpiar(40);
		// Inicializar random, y variables
		Random apuesta = new Random();
		Random ia = new Random();
		int elecc = 0;
		int apuestaia = 0;
		int eleccmaquina = 0;
		do {
			limpiar(40);

			do {
				System.out.println(
						"+------------------------------------------------------------------------------------------------------------+");
				System.out.println(
						"| Escoge un numero aleatorio del 1 al 6, si sacas el mismo número que la màquina empiezas escogiendo palabra.|");
				System.out.println(
						"+------------------------------------------------------------------------------------------------------------+");
				elecc = reader.nextInt();
			} while (elecc > 6 || elecc < 1);
			apuestaia = ia.nextInt(6) + 1;
			eleccmaquina = apuesta.nextInt(6) + 1;
			System.out.println("+-----------------------------+");
			System.out.println("| Has escogido el número: " + elecc + "   |");
			System.out.println("+-----------------------------+");
			System.out.println("| La IA ha sacado el número: " + apuestaia + "|");
			System.out.println("+-----------------------------+");
			eleccmaquina = apuesta.nextInt(6) + 1;
			System.out.println("|   El número ganador és: " + eleccmaquina + "   |");
			System.out.println("+-----------------------------+");
			Thread.sleep(2500);
		} while (elecc == eleccmaquina && eleccmaquina == apuestaia
				|| elecc != eleccmaquina && apuestaia != eleccmaquina);
		if (elecc == eleccmaquina) {
			empiezajug(reader);
		}
		if (apuestaia == eleccmaquina) {
			empiezaia(reader);
		}
	}

	public static void empiezaia(Scanner reader) {
		// Inicializar random, vairalbes, y cadenas de char
		Random palabraaleatoria = new Random();
		String[] palabras = arrayia();
		int aciertos = 0;
		int fallos = 0;
		int intentostotales = 15;
		int alea = palabraaleatoria.nextInt(5);
		char[] separar = separar(palabras[alea]);
		char[] respuestas = new char[separar.length];

		for (int i = 0; i < respuestas.length; i++) {
			respuestas[i] = '_';
		}
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|     Escribe un carácter que creas que contiene la palabra      |");
		System.out.println("+----------------------------------------------------------------+");
		while (fallos < intentostotales && aciertos != respuestas.length) {
			imprimeOculta(respuestas);
			// Preguntamos mierdas por teclado
			int respuesta = introducirletra(reader);
			for (int i = 0; i < separar.length; i++) {
				if (separar[i] == respuesta) {
					respuestas[i] = separar[i];
					separar[i] = ' ';
					aciertos++;
				}
			}
			fallos++;
			System.out.println("+---------------+");
			System.out.println("| Intentos " + fallos + "/15 |");
			System.out.println("+---------------+");
		}
		if (aciertos == respuestas.length) {
			imprimeOculta("La palabra era: ", respuestas);
			ganaste();
		} else {
			imprimeOculta("La palabra era: ", respuestas);
			perdiste();
		}
	}

	private static char[] separar(String sep) {
		char[] letras;
		letras = new char[sep.length()];
		for (int i = 0; i < sep.length(); i++) {
			letras[i] = sep.charAt(i);
		}
		return letras;
	}

	private static void imprimeOculta(char[] tusRespuestas) {

		for (int i = 0; i < tusRespuestas.length; i++) {
			System.out.print(tusRespuestas[i] + " ");
		}
	}

	public static String[] arrayia() {
		String arraypalabra[] = new String[5];
		arraypalabra[0] = "escaramuza";
		arraypalabra[1] = "animal";
		arraypalabra[2] = "vibracion";
		arraypalabra[3] = "emergencia";
		arraypalabra[4] = "variable";

		return arraypalabra;
	}

	public static void empiezajug(Scanner reader) throws InterruptedException {
		limpiar(40);
		String palabraescogida;
		int fallos = 0;
		int aciertos = 0;
		int intentostotales = 15;
		aciertos = 0;
		fallos = 0;

		palabraescogida = escogerpalabra(reader);
		char[] separar = separarchar(palabraescogida);
		char[] respuestas = new char[palabraescogida.length()];
		for (int i = 0; i < respuestas.length; i++) {
			respuestas[i] = '_';
		}
		System.out.println("+-----------------------------------------+");
		System.out.println("|  La máquina va a escoger carácteres...  |");
		System.out.println("+-----------------------------------------+");
		while (fallos < intentostotales && aciertos != respuestas.length) {
			visionoculta(respuestas);
			int respuesta = introducirletrarandom(reader);
			// Parar el programa por 1 segundo y medio
			Thread.sleep(1500);

			for (int i = 0; i < separar.length; i++) {
				if (separar[i] == respuesta) {
					respuestas[i] = separar[i];
					separar[i] = ' ';
					aciertos++;
				}

			}
			fallos++;
			System.out.println("+---------------+");
			System.out.println("| Intentos " + fallos + "/15 |");
			System.out.println("+---------------+");

		}
		if (aciertos == respuestas.length) {
			imprimeOculta("La palabra era: ", respuestas);
			perdiste();
		} else {
			imprimeOculta("La palabra era: ", respuestas);
			ganaste();
		}
	}

	public static char introducirletrarandom(Scanner reader) {
		// Funcion en la cual con un random se saca un numero del 1 al 26, y este se
		// convierte a tipo char, es decir, a letra
		// y se devuelve el resultado de tipo char
		Random letrasrandom = new Random();
		char numrandomletra;
		int numrandom = 0;
		System.out.println();
		numrandom = letrasrandom.nextInt(26) + 1;
		numrandomletra = (char) (numrandom + 'a');

		return numrandomletra;
	}

	public static String escogerpalabra(Scanner reader) {
		String palabra;
		limpiar(40);
		// Filtro para que la palabra no supere los 10 caracteres y que no tenga menos
		// de 3
		do {
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|  Escribe una palabra de como mucho 10 cáracteres y como mínimo 2   |");
			System.out.println("+--------------------------------------------------------------------+");
			palabra = reader.next().toLowerCase();
		} while (palabra.length() > 10 || palabra.length() < 3);
		limpiar(40);
		return palabra;

	}

	//JUEGO CREADO POR XAVIER
	public static void juegodados(Scanner reader2) throws InterruptedException {
		// TODO Auto-generated method stub
		// printarPorPantalla();
		Scanner reader = new Scanner(System.in);
		char respuesta = ' ';
		menuvisualdados();
		do {
			nenuDados();
		} while (respuesta != 'n');
		if (respuesta != 'n') {
			menuvisualdados();
			nenuDados();
		}
	}

	public static char preguntadados(String men, Scanner reader) {
		// funcion para si quieres volver a jugar
		char respuesta;
		System.out.println(men + " (s/n)");
		respuesta = reader.next().toLowerCase().charAt(0);
		while (respuesta != 's' && respuesta != 'n') {
			System.out.println("¡Error! Solo se admite S o N");
			respuesta = reader.next().toLowerCase().charAt(0);
		}

		return respuesta;
	}

	public static void informacionDados() {
		// informacion y reglas para jugar a los dados
		limpiar(40);
		System.out.println("+--------------------------------------+--------------------------------------+");
		System.out.println("|           Informacion Juego          |           Reglas del juego           |");
		System.out.println("+--------------------------------------+--------------------------------------+");
		System.out.println("|  El juego de dados trata de que el   |·  El jugador tiene de escojer        |");
		System.out.println("| usuario escoge un numero del 2 al 12 |    un numero del 2 al 12             |");
		System.out.println("| Posteriormente se lanzaran los dados,|                                      |");
		System.out.println("|   despues de lanzar los dados se     |·   El juego se terminara cuando 1    |");
		System.out.println("|   comprueba si el numero escogido    | de los 2 jugadores llegue a 5 puntos |");
		System.out.println("|   por el usuarioconcide con el de    |                                      |");
		System.out.println("| los dados, si condicen los numeros   |                                      |");
		System.out.println("|        punto para el usuario.        |                                      |");
		System.out.println("|Ganaras cuanto el contador llegue a 5 |                                      |");
		System.out.println("|                                      |                                      |");
		System.out.println("+--------------+                       |                                      |");
		System.out.println("|   [6] Atrás  |                       |                                      |");
		System.out.println("+--------------+-----------------------+--------------------------------------+");

	}

	public static void atrasInfoDados() throws InterruptedException {
		// escojer atras para ir al menu de juego
		Scanner reader = new Scanner(System.in);
		int escojer = 0;
		do {
			escojer = reader.nextInt();
			if (escojer == 6) {
				juegodados(null);
			}
		} while (escojer != 6);

	}

	public static void menuvisualdados() {
		limpiar(40);
		// menu visual para podre escojer el modo de juego
		System.out.println("+---------------------------+");
		System.out.println("|          Los Dados        |");
		System.out.println("+---------------------------+");
		System.out.println("|                           |");
		System.out.println("|  [1] jugador vs Consola   |");
		System.out.println("|  [2] jugador vs jugador   |");
		System.out.println("| [3] Informacion y reglas  |");
		System.out.println("|                           |");
		System.out.println("+-----------+---------------+");
		System.out.println("| [6] Atrás |               |");
		System.out.println("+-----------+---------------+");

	}

	public static void nenuDados() throws InterruptedException {
		// escojer el modo de juego de los dados
		Scanner reader = new Scanner(System.in);
		int escojer = 0;
		do {
			escojer = reader.nextInt();
			if (escojer == 1) {
				rondasConsola();

			}
			if (escojer == 2) {
				rondasJUGADORES();
			}

			if (escojer == 3) {
				informacionDados();
				atrasInfoDados();
			}
			if (escojer == 6) {
				main(null);
			}
			// para asegurar el que se escojar el numbre corecto
		} while (escojer != 1 && escojer != 2 && escojer != 3 && escojer != 6);
	}

	// jugador vs consola
	public static void rondasConsola() throws InterruptedException {
		// correr el juego
		bienvenida();
		sumaDados();
		comprobarjugadores();
		nenuDados();

	}

	public static void bienvenida() {
		// printa la bienvenida la juego
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("|                   Bienvenido al Juego de los DADOS                        |");
		System.out.println("|                           Jugador vs Consola                              |");
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println(" " + "                                  ________\r\n"
				+ "                                  /\\       \\\r\n"
				+ "                                 /  \\   6   \\\r\n"
				+ "                                { 4  }-------}\r\n"
				+ "                     	         \\  /   5   /\r\n"
				+ "                      	          \\/_______/");
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("\n");
	}

	public static int jugador1() {
		Scanner reader = new Scanner(System.in);
		int jugador1 = 0;
		int result = 0;
		do {
			System.out.println("+------------------------------------------+");
			System.out.print("| Introduce un numero del 2 al 12 porfavor:\n");
			System.out.println("+------------------------------------------+");
			// cojer el numero intoducido por el jugador
			jugador1 = reader.nextInt();
			// condiciones para que el jugador saque un numero dentro de los paramentros
			if (jugador1 < 2 || jugador1 > 12) {
				System.out.println("+---------------------------------------------------------------------------+");
				System.out.println("|     -->Profavor Introduce otro numero que este entre el 2 y el 12<--      |");
				System.out.println("+---------------------------------------------------------------------------+");
			}
		} while (jugador1 < 2 || jugador1 > 12);
		result = jugador1;
		return result;
	}

	public static int jugador2() {
		Scanner reader = new Scanner(System.in);
		int jugador2 = 0;
		int result = 0;
		Random jugador = new Random();
		// random para que la consola saque un numero del 2 al 12
		jugador2 = jugador.nextInt(12) + 2;
		// printa el resultado
		System.out.println("+---------------------------------------+");
		System.out.println("|El numero escojido por la Consola es: " + jugador2 + "|");
		System.out.println("+---------------------------------------+");
		result = jugador2;
		return result;
	}

	public static int dados1() {
		Random Dados1 = new Random();
		int numDado1 = 0;
		// random para escojer un numero del 1 al 6
		numDado1 = Dados1.nextInt(6) + 1;

		return numDado1;
	}

	public static int dados2() {
		Random Dados2 = new Random();
		int numDado2 = 0;
		// random para escojer un numero del 1 al 6
		numDado2 = Dados2.nextInt(6) + 1;
		return numDado2;
	}

	public static int sumaDados() {
		int dado1 = 0;
		int dado2 = 0;
		int suma = 0;
		// return de los dos dados
		dado1 = dados1();
		dado2 = dados2();
		// suma de los dos dados
		suma = dado1 + dado2;
		return suma;
	}

	public static void comprobarjugadores() throws InterruptedException {
		int jugador1 = 0;
		int contador1 = 0;
		int contador2 = 0;
		int jugador2 = 0;
		int suma = 0;
		do {
			// returns para poder utilizar las condiciones posteriores
			jugador1 = jugador1();
			jugador2 = jugador2();
			suma = sumaDados();

			System.out.println("+----------------------------------+");
			System.out.println("|        Tirando los dados         |");
			System.out.println("+----------------------------------+");
			recorridodados();
			// printa la suma de los dados
			System.out.println("+----------------------------------+");
			System.out.println("|                                  |");
			System.out.println("| la suma de los dos dados es--> " + suma + " |");
			System.out.println("|                                  |");
			System.out.println("+----------------------------------+");
			Scanner reader = new Scanner(System.in);
			// condiciones para que se sumen los puntos al contador
			if (jugador1 == suma) {
				contador1++;
			}
			if (jugador2 == suma) {
				contador2++;
			}
			// marcador para llevar el recuento de puntos de cadoa jugador
			System.out.println("+-------------+");
			System.out.println("|  Marcador   |");
			System.out.println("+-------------+");
			System.out.println("| Jugador = " + contador1 + " |");
			System.out.println("| Consola = " + contador2 + " |");
			System.out.println("+-------------+");
			// condiciones para que el juego repita hasta que algun contador legue a 5
			// puntos
		} while (contador1 != 5 || contador2 != 5);
		// los if sirven para que cuando el marcador legue a 5 salga uno de los 3
		// mensajes.
		if (contador1 == 5) {
			System.out.println("+-----------------------------------------+");
			System.out.println("|                                         |");
			System.out.println("|          ¡Bien echo, GANASTE!           |");
			System.out.println("|                                         |");
			System.out.println("+-----------------------------------------+");
		}
		if (contador2 == 5) {
			System.out.println("+-----------------------------------------+");
			System.out.println("|                                         |");
			System.out.println("|        Lo sentimos pero perdiste        |");
			System.out.println("|                                         |");
			System.out.println("+-----------------------------------------+");
		} else {
			System.out.println("+-----------------------------------------+");
			System.out.println("|                                         |");
			System.out.println("|      ENPATASTE,sigue intentando-lo      |");
			System.out.println("|                                         |");
			System.out.println("+-----------------------------------------+");
		}

	}

	// la funcion que tenemos a continuacion es para que se vea una secuencia donde
	// se van saliendo los dados
	public static void recorridodados() throws InterruptedException {
		sacandoDados();
		Thread.sleep(1000);
		sacandoDados1();
		Thread.sleep(1000);
		sacandoDados2();
		Thread.sleep(1000);
		sacandoDados3();
		Thread.sleep(1000);
	}

	// sacando el dado 1
	public static void sacandoDados() {
		System.out.println(" " + "   ________\r\n" + "   /\\       \\\r\n" + "  /  \\   1   \\\r\n"
				+ " { 3  }-------}\r\n" + "  \\  /   2   /\r\n" + "   \\/_______/");
	}

	// sacando el dado 2
	public static void sacandoDados1() {
		System.out.println(" " + "        ________\r\n" + "        /\\       \\\r\n" + "       /  \\   4   \\\r\n"
				+ "      { 6  }-------}\r\n" + "       \\  /   5   /\r\n" + "        \\/_______/");
	}

	// sacando el dado 3
	public static void sacandoDados2() {
		System.out.println(" " + "               ________\r\n" + "               /\\       \\\r\n"
				+ "              /  \\   1   \\\r\n" + "             { 3  }-------}\r\n"
				+ "              \\  /   2   /\r\n" + "               \\/_______/");
	}

	// sacando el dado 4
	public static void sacandoDados3() {
		System.out.println(" " + "                     ________\r\n" + "                     /\\       \\\r\n"
				+ "                    /  \\   4   \\\r\n" + "                   { 6  }-------}\r\n"
				+ "                    \\  /   5   /\r\n" + "                     \\/_______/");
	}

	// JUEGO jugador vs jugador

	public static void rondasJUGADORES() throws InterruptedException {
		// correr el juego
		bienvenidaJUGA();
		sumaDadosJUGA();
		comprobarjugadoresJUGA();
		nenuDados();

	}

	public static void bienvenidaJUGA() {
		// printa la bienvenida la juego
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("|                   Bienvenido al Juego de los DADOS                        |");
		System.out.println("|                           Jugador vs Jugador                              |");
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println(" " + "                                   ________\r\n"
				+ "                                   /\\       \\\r\n"
				+ "                                  /  \\   6   \\\r\n"
				+ "                                 { 4  }-------}\r\n"
				+ "                     	          \\  /   5   /\r\n"
				+ "                      	           \\/_______/");
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("\n");
	}

	public static int jugador1JUGA() {
		Scanner reader = new Scanner(System.in);
		int jugador1 = 0;
		int result = 0;
		do {
			// cojer el numero intoducido por el jugador 1
			System.out.println("+-----------------------------------------+");
			System.out.println("|                 Jugador 1               |");
			System.out.println("+-----------------------------------------+");
			System.out.println("|Introduce un numero del 2 al 12 porfavor |");
			System.out.println("+-----------------------------------------+");
			jugador1 = reader.nextInt();
			// condiciones para que el jugador saque un numero dentro de los paramentros
			if (jugador1 < 2 || jugador1 > 12) {
				System.out.println("+---------------------------------------------------------------------------+");
				System.out.println("|     -->Profavor Introduce otro numero que este entre el 2 y el 12<--      |");
				System.out.println("+---------------------------------------------------------------------------+");
			}
		} while (jugador1 < 2 || jugador1 > 12);
		result = jugador1;
		return result;
	}

	public static int jugador2JUGA() {
		Scanner reader = new Scanner(System.in);
		int jugador2 = 0;
		int result = 0;
		do {
			// cojer el numero intoducido por el jugador 2
			System.out.println("+-----------------------------------------+");
			System.out.println("|                 Jugador 2               |");
			System.out.println("+-----------------------------------------+");
			System.out.println("|Introduce un numero del 2 al 12 porfavor |");
			System.out.println("+-----------------------------------------+");
			jugador2 = reader.nextInt();
			// condiciones para que el jugador saque un numero dentro de los paramentros
			if (jugador2 < 2 || jugador2 > 12) {
				System.out.println("+---------------------------------------------------------------------------+");
				System.out.println("|     -->Profavor Introduce otro numero que este entre el 2 y el 12<--      |");
				System.out.println("+---------------------------------------------------------------------------+");
			}
		} while (jugador2 < 2 || jugador2 > 12);
		result = jugador2;
		return result;
	}

	public static int dados1JUGA() {
		Random Dados1 = new Random();
		int numDado1 = 0;
		// random para escojer un numero del 1 al 6
		numDado1 = Dados1.nextInt(6) + 1;

		return numDado1;
	}

	public static int dados2JUGA() {
		Random Dados2 = new Random();
		int numDado2 = 0;
		// random para escojer un numero del 1 al 6
		numDado2 = Dados2.nextInt(6) + 1;
		return numDado2;
	}

	public static int sumaDadosJUGA() {
		int dado1 = 0;
		int dado2 = 0;
		int suma = 0;
		// return de los dos dados
		dado1 = dados1JUGA();
		dado2 = dados2JUGA();
		// suma de los dos dados
		suma = dado1 + dado2;
		return suma;
	}

	public static void comprobarjugadoresJUGA() throws InterruptedException {
		int jugador1 = 0;
		int contador1 = 0;
		int contador2 = 0;
		int jugador2 = 0;
		int suma = 0;
		do {
			// returns para poder utilizar las condiciones posteriores
			jugador1 = jugador1JUGA();
			jugador2 = jugador2JUGA();
			suma = sumaDadosJUGA();
			System.out.println("+----------------------------------+");
			System.out.println("|        Tirando los dados         |");
			System.out.println("+----------------------------------+");
			recorridodados();
			System.out.println("+----------------------------------+");
			System.out.println("|                                  |");
			System.out.println("| la suma de los dos dados es--> " + suma + " |");
			System.out.println("|                                  |");
			System.out.println("+----------------------------------+");
			Scanner reader = new Scanner(System.in);
			// condiciones para que se sumen los puntos al contador
			if (jugador1 == suma) {
				contador1++;
			}
			if (jugador2 == suma) {
				contador2++;
			}
			// marcador para llevar el recuento de puntos de cadoa jugador
			System.out.println("+-------------+");
			System.out.println("|  Marcador   |");
			System.out.println("+-------------+");
			System.out.println("|Jugador 1= " + contador1 + " |");
			System.out.println("|jugador 2= " + contador2 + " |");
			System.out.println("+-------------+");
			// condiciones para que el juego repita hasta que algun contador legue a 5
			// puntos
		} while (contador1 != 5 || contador2 != 5);
		// los if sirven para que cuando el marcador legue a 5 salga uno de los 3
		// mensajes.
		if (contador1 == 5) {
			System.out.println("+-----------------------------------------+");
			System.out.println("|                                         |");
			System.out.println("|          ¡Bien echo, GANASTE!           |");
			System.out.println("|                                         |");
			System.out.println("+-----------------------------------------+");
		}
		if (contador2 == 5) {
			System.out.println("+-----------------------------------------+");
			System.out.println("|                                         |");
			System.out.println("|        Lo sentimos pero perdiste        |");
			System.out.println("|                                         |");
			System.out.println("+-----------------------------------------+");
		} else {
			System.out.println("+-----------------------------------------+");
			System.out.println("|                                         |");
			System.out.println("|      ENPATASTE,sigue intentando-lo      |");
			System.out.println("|                                         |");
			System.out.println("+-----------------------------------------+");
		}
	}

	//JUEGO CREADO POR LUCAS
	public static void jugarnumero(Scanner reader) throws InterruptedException {
		char respuesta = ' ';
		do {
			adivinaelnumero(null);
			System.out.println("+-----------------------------------+");
			respuesta = preguntaahorcado(" ¿Quiéres volver a jugar? ", reader);

		} while (respuesta != 'n');
		if (respuesta == 'n') {
			eleccjugar();
		}

	}

	static Scanner entrada2 = new Scanner(System.in);

	public static void adivinaelnumero(String[] args) {
		limpiar(40);
		// TODO Auto-generated method stub

		// este juego consiste en adivinar un numero
		// el numero tiene que ser un valor numeico
		// el usuario intdoducira el numero tantas veces que quiera hasta enncontrar el
		// valor numerico
		// los intentos no tienen limite

		System.out.println("--------------------------------------");
		System.out.println("comienza el juego  adivinar un numero |");
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("");

		// Obtenemos el valor aleatorio entre el 1 y el 100
		int numero = (int) (Math.random() * 100);
		System.out.println("-------------------------------------");
		System.out.println("Indica un numero entre el 0 y el 100 |");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------------");

		int entrada = -1;
		int contador = 0;
		int jugador = 0;
		int IA = 0;

		// bucle hasta que el usuario adivine el numero
		do {

			if (IA == 0 && entrada == 1) {
				System.out.println("pierde el usuario ");
				System.out.println("GANA la IA");
				IA++;
			}

			// Obtenemos un nuevo valor
			entrada = obtenerValor();
			if (entrada > numero) {
				System.out.println(
						"-------------------------------------------------------------------------------------------------------");
				System.out.println(
						"El numero introducido es mayor debes introduce otro numero hasta que aciertes mucha suerte hasta luego |");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------");
				System.out.println();

			} else if (entrada < numero) {
				System.out.println(
						"------------------------------------------------------------------------------------");
				System.out.println(
						"El numero introducido  es menor introduce otro numero para acertar que te vaya bien|");
				System.out.println(
						"------------------------------------------------------------------------------------");
				System.out.println();
			}
			contador++;
		} while (entrada != numero);

		System.out.println("Has averiguado el numero en " + contador + " intentos.");
	}

	public static int obtenerValor() {
		int valor = 0;

		// Iniciamos un bucle infinito
		while (true) {
			try {
				System.out.print(
						"Indica otro numero  para obtener el resultado o siga probando hasta acertar buena suerte : ");
				System.out.println();
				valor = entrada2.nextInt();

				// revisamos que el valor introducido este comprendido entre el 0 y el 100
				if (valor < 0 || valor > 100) {
					System.out.println("El numero tiene que estar entre el 0 y el 100");
				} else {
					// salimos del bucle
					break;
				}
			} catch (InputMismatchException e) {
				// Controlamos siempre que el valor que se introduzca sea un valor un valor
				// numerico

				System.out.println("----------------------------------");
				System.out.println("El valor tiene que ser numerico...|");
				System.out.println("----------------------------------");
				entrada2.nextLine();
			}
		}
		return valor;
	}

	//JUEGO CREADO POR ANDRÉS
	public static void encuentraelnumero(Scanner reader) throws InterruptedException {
		char respuesta = ' ';
		do {
			juegoencuentraelnumero(null);
			System.out.println("+-----------------------------------+");
			respuesta = preguntaahorcado(" ¿Quiéres volver a jugar? ", reader);

		} while (respuesta != 'n');
		if (respuesta == 'n') {
			eleccjugar();
		}

	}

	public static void juegoencuentraelnumero(Scanner reader) throws InterruptedException {
		// TODO Auto-generated method stub
		limpiar(40);

		Scanner s = new Scanner(System.in);

		// Variables para num aleatorio
		int num1 = 0;

		// Respuesta del jugador
		int num2 = 0;

		// Variable para elegir la dificultad
		int difi = 0;

		// Variable para el bucle final
		int fin = 0;

		// Variable para el numero aleatorio interno del nivel
		int ale = 0;

		// Variable aleatoria
		Random aleatorio = new Random();

		System.out.println("Este minijuego es para mejorar tus reflejos y tu velocidad.");
		System.out.println("Consiste en adivinar el número que se muestra lo mas rapido posible;");
		System.out.println("aparecera un número en una posicion y rapidamente desaparecera,");
		System.out.println("tu objetivo es encontrar el número que ha aparecido.");
		System.out.println("Solo se mostrara durante un segundo!!.");

		System.out.println("\nHay 3 niveles de dificultad, elige uno: ");
		System.out.println("FACIL -> 1");
		System.out.println("MEDIO -> 2");
		System.out.println("DIFICIL -> 3");
		System.out.print("Nivel: ");
		difi = s.nextInt();

		// Correcion de errores
		if (difi < 1 || difi > 3) {
			while (difi < 1 || difi > 3) {
				System.err.println("Error, seleccione dificultad para continuar.");
				System.out.println("FACIL -> 1");
				System.out.println("MEDIO -> 2");
				System.out.println("DIFICIL -> 3");
				System.out.print("Nivel: ");
				difi = s.nextInt();
			}
		}

		// NIVEL 1
		if (difi == 1) {
			System.out.println("\nHas elegido dificultad FACIL...\n");
			Thread.sleep(400);
			System.out.println("En dos segundos se mostrara el nivel...");
			Thread.sleep(1300);
			System.out.println("Cargando...");
			Thread.sleep(700);

			// Espacios para separar la respuesta
			System.out.println(
					"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			// Se crea un numero aleatorio
			num1 = aleatorio.nextInt(10);

			ale = aleatorio.nextInt(3);

			// Primera variante
			if (ale == 0) {

				System.out.println("");
				// Zona donde aparece el numero
				System.out.println("- - - - - - - - - - - - - - - - - - - - " + num1
						+ " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(1000);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				// EL resulado se muestra con la funcion resultado
				System.out.println(" ");
				resultado(num2, num1);
			}

			// Segunda variante
			if (ale == 1) {

				System.out.println("");
				// Zona donde aparece el numero
				System.out.println("- - - - " + num1
						+ " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(1000);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				// EL resulado se muestra con la funcion resultado
				System.out.println(" ");
				resultado(num2, num1);
			}

			// Tercera variante
			if (ale == 3) {

				System.out.println("");
				// Zona donde aparece el numero
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
								+ num1 + " - - -");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(1000);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				// EL resulado se muestra con la funcion resultado
				System.out.println(" ");
				resultado(num2, num1);
			}
		}

		// NIVEL 2
		if (difi == 2) {
			System.out.println("\nHas elegido dificultad NORMAL...\n");
			Thread.sleep(400);
			System.out.println("En dos segundos se mostrara el nivel...");
			Thread.sleep(1300);
			System.out.println("Cargando...");
			Thread.sleep(700);

			// Espacios para separar la respuesta
			System.out.println(
					"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			// Se crea un numero aleatorio
			num1 = aleatorio.nextInt(10);

			ale = aleatorio.nextInt(3);

			// Primera variante
			if (ale == 0) {

				System.out.println("");
				// Zona donde aparece el numero
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
								+ num1 + " - - - - - - - -");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(700);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				System.out.println(" ");
				resultado(num2, num1);
			}

			if (ale == 1) {

				System.out.println("");
				// Zona donde aparece el numero
				System.out.println("- - - - " + num1
						+ " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(700);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				System.out.println(" ");
				resultado(num2, num1);
			}

			if (ale == 2) {

				System.out.println("");
				// Zona donde aparece el numero

				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - " + num1
						+ " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(700);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				System.out.println(" ");
				resultado(num2, num1);
			}
		}

		// NIVEL 3
		if (difi == 3) {
			System.out.println("\nHas elegido dificultad DIFICIL...\n");
			Thread.sleep(400);
			System.out.println("En dos segundos se mostrara el nivel...");
			Thread.sleep(1300);
			System.out.println("Cargando...");
			Thread.sleep(700);

			// Espacios para separar la respuesta
			System.out.println(
					"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			// Se crea un numero aleatorio
			num1 = aleatorio.nextInt(20);

			ale = aleatorio.nextInt(3);

			// Primera variante
			if (ale == 0) {

				System.out.println("");
				// Zona donde aparece el numero
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println("- - - " + num1
						+ " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(450);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				System.out.println(" ");
				resultado(num2, num1);
			}

			// Primera variante
			if (ale == 1) {

				System.out.println("");
				// Zona donde aparece el numero
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "
								+ num1 + " - - - - -");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(450);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				System.out.println(" ");
				resultado(num2, num1);
			}

			// Primera variante
			if (ale == 2) {

				System.out.println("");
				// Zona donde aparece el numero
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - " + num1
								+ " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.err.println(
						"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

				// Solo aparecera el numero un tiempo en concreto
				Thread.sleep(450);

				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("Lo has visto??? Indica que número era: ");
				num2 = s.nextInt();

				System.out.println(" ");
				resultado(num2, num1);
			}

		}

	}

	// FUNCION RESULTADO
	public static int resultado(int a, int b) {

		// resultado correcto
		if (a == b) {
			System.out.println("Has acertado el número. Tienes buenos reflejos!");
		}

		// resultado incorrecto
		if (a != b) {
			System.err.println("No has acertado, tienes que ser más rapido!");
		}

		return a;
	}

}
