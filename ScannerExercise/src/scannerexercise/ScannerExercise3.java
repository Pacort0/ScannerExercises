package scannerexercise;
import java.util.*;

public class ScannerExercise3 {

	public static void main(String[] args) {
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner sex = new Scanner(System.in);
		
		//Inicio la variable en la que se va a guardar la edad final del usuario.
		int edad = 0;
		
		//Creo el mensaje inicial que se va a mostrar por pantalla una vez iniciado el programa.
		System.out.print("Por favor, introduzca su año de nacimiento: ");
		
		//Inicio la variable en la que se va a guardar el mensaje que se introduzca por teclado y la uno al Scanner.
		int anioN = sex.nextInt();
		
		//Introduzco un pequeño gag cómico
		if (anioN < 2000) {
			System.out.print("Un carné de la tercera edad para esta persona.\n");
		}
		
		//Una vez se introduzca el año de nacimiento, se pedirá el año en el que se encuentre el usuario.
		System.out.print("\nAhora introduzca el año actual, por favor: ");
		
		//Inicio la variable en la que se va a guardar el mensaje que se introduzca por teclado y la uno al Scanner.
		int anioA = sex.nextInt();
		sex.close();
		
		//Calculamos la edad del usuario
		edad = anioA - anioN;
		
		//Creamos un bucle condicional en caso de que el usuario haya introducido datos erróneos (edad negativa).
		if (edad < 0) {
			System.out.println("Error. Usted no puede tener " + edad + ", las leyes de la física lo impiden. Reinicie el programa e inténtelo de nuevo.");
		}
		
		//Si los datos introducidos son crrectos, se imprime el mensaje por pantalla.
		else {
		System.out.print("Actualmente usted debería tener " + edad + " años");
		}
	}

}
