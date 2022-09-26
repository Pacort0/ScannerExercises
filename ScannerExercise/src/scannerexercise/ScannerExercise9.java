package scannerexercise;
import java.util.*;

public class ScannerExercise9 {

	public static void main(String[] args) {
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.US);
		//Creo las variables que se van a usar para guardar tanto el calculo final como la informacion por teclado.
		double conversion;
		double dineros;
		
		//Creo el mensaje que se va a mostrar por consola para pedir la cifra inicial.
		System.out.print("Introduzca una cantidad a convertir: ");
		dineros = entrada.nextDouble();
		
		//Calculamos la cantidad de euros equivalentes a las pesetas introducidas.
		conversion = dineros*0.006;
		//Imprimimos el mensaje final.
		System.out.print("\n" + dineros + " pesetas son " + conversion + " euros.");	
		
		entrada.close();
	}
}
