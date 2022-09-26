package scannerexercise;
import java.util.*;

public class ScannerExercise5 {

	public static void main(String[] args) {
		
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner(System.in);
		//Cambio el uso de puntos y comas para los decimales por consola.
		entrada.useLocale(Locale.US);
		
		//Inicio la variable que nos permitirá calcular el área de la circunferencia
		double area;
		//Inicio la variable que nos permitirá calcular la longitud de la circunferencia.
		double longitud;
		
		//Creo el mensaje que se mostrará por pantalla al iniciar el programa.
		System.out.print("Introduzca el radio de la circunferencia (metros): ");
		
		//Inicio la variable en la que se almacenará la cantidad que se introduzca por teclado.
		double radio = entrada.nextDouble();
		
		//Creo un bucle do while anidado en un bucle if en el caso de que se introduzca una longitud de radio equivocada.
		if (radio < 0) {
			do {
				System.out.print("Por favor, introduzca una medida de radio válida: ");
				radio = entrada.nextDouble();
			}
			while(radio < 0);
		}
		 //Calculamos el area y la longitud mediante el uso de Math.PI.
		area = Math.PI * Math.pow(radio, 2);
		longitud = Math.PI * (radio*2);
		
		//Imprimimos el mensaje final.
		System.out.print("\nEl area de la circunferencia es: " + area + " metros cuadrados.\nY la longitud de la circunferencia es: " + longitud + " metros.");
		
		entrada.close();
	}
}
