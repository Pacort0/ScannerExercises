package scannerexercise;
import java.util.*;
public class ScannerExercise2 {

	public static void main(String[] args) {

		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner escaneame_esta = new Scanner(System.in);
		
		//Imprimo el mensaje inicial por pantalla.
		System.out.print("Por favor, introduzca su edad: \n");
		
		//Creo la variable en la que se va a guardar la edad que se introduzca por teclado, y la relaciono con el Scanner.
		int edad = escaneame_esta.nextInt();
		
		//Creo un bucle "if" en caso de que se introduzca una edad errónea.
		if (edad > 105 || edad < 0) {
			
			//Creo un bucle "do while" para mantener el mensaje de introducir edad en pantalla hasta que se introduzca una edad correcta.
			do {
				//Creo un mensaje alternativo para que se imprima por pantalla, y relaciono la variable "edad" de nuevo al Scanner.
			System.out.print("Venga tampoco hace falta mentir, que no somos tontos, introduzca de nuevo una edad correcta: \n");
			edad = escaneame_esta.nextInt();
				}
			
			//El bucle se repite mientras se sigan introduciendo edades incorrectas.
			while(edad < 0 || edad > 105);
			}
		
		//Si la edad es correcta, se le suma un año y se imprime el mensaje final por pantalla.
		System.out.print("El año que viene tendrá usted " + (edad + 1) + " años");
		escaneame_esta.close();
		}
	}
