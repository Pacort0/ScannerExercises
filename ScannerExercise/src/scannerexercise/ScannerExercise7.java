package scannerexercise;
import java.util.*;

public class ScannerExercise7 {

	public static void main(String[] args) {
		
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner(System.in);
		//Creo el mensaje que se va a mostrar por pantalla una vez se inicie el programa.
		System.out.print("Por favor, introduzca su nombre y su primer apellido: ");
		
		//Creo las variables en las que se van a guardar el nombre y el apellido y las uno al Scanner.
		String nombre = entrada.next();
		String apellido1 = entrada.next();
		
		//Se muestra el siguiente mensaje por pantalla, pidiendo la direccion.
		System.out.print("\nAhora introduzca su dirección: ");
		//Creo las variables en las que se va a guardar su direccion.
		String calle = entrada.next();
		String nombre_calle = entrada.next();
		
		//Se muestra el siguiente mensaje por pantalla, pidiendo el telefono.
		System.out.print("\nPor último, introduzca su número de teléfono: ");
		//Creo la variable en la que se va a guardar el numero de telefono.
 		int numero_tlfn = entrada.nextInt();
		
 		//Imprimo el mensaje final.
		System.out.println("\n-Nombre: " + nombre + apellido1 +  ".\n-Dirección: " + calle + nombre_calle + ".\n-Número de teléfono: " + numero_tlfn + ".");
		
		entrada.close();
	} 

}
