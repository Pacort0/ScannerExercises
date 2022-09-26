package scannerexercise;
import java.util.*;

public class ScannerExercise10 {

	public static void main(String[] args) {
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner(System.in);
		//Creamos la constante del IVA para el programa.
		final double IVA = 21.00;
		//Creamos la constante donde se va a guardar el calculo final.
		double calculaIVA;
		
		//Creamos el mensaje que se va a mostrar por pantalla una vez iniciado el programa.
		System.out.print("Introduzca el precio de un producto sin IVA: ");
		//Iniciamos la variable en la que se va a guardar la información introducida por pantalla y la unimos al Scanner
		double precio = entrada.nextDouble();
		
		//Calculamos el precio con IVA.
		calculaIVA = precio * (IVA / 100) + precio;
		
		//Imprimimos el mensaje final.
		System.out.print("El precio con el IVA aplicado es: " + calculaIVA);
		entrada.close();
	}

}
