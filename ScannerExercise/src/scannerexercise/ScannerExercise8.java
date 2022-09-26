package scannerexercise;
import java.util.*;

public class ScannerExercise8 {

	public static void main(String[] args) {
		
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner(System.in);
		
		//Creo el mensaje quer se va a mostrar por pantalla una vez se inicie el programa.
		System.out.print("Introduzca su nombre: ");
		//Creo la variable en la que se va a guardar el nombre del usuario.
		String nombre = entrada.next();
		
		//Se muestra por pantalla el mensaje pidiendo la edad del usuario.
		System.out.print("\nAhora introduzca su edad: ");
		//Creo la variable en la que se va a guardar la edad del usuario.
		int edad = entrada.nextInt();
		
		//Se imprime el mensaje final.
		System.out.print("\nHola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		entrada.close();
	}

}
