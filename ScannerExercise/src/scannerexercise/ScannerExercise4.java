package scannerexercise;
import java.util.*;

public class ScannerExercise4 {

	public static void main(String[] args) {
		
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner(System.in);
		//Creamos la variable que nos va a permitir calcular la media de las notas.
		double media;
		
		//Creamos el mensaje que se imprimirá una vez se inicie el programa, pidiendo la primera nota.
		System.out.print("Introduzca la primera nota: ");
		//En caso de que la nota sea inexistente, creo un bucle do while anidado dentro de un bucle if
		double nota1 = entrada.nextDouble();
		if (nota1 < 0 || nota1 > 10) {
			
			//El bucle se repetirá hasta que se introduzca una nota correcta por teclado.
			do {
			System.out.print("\nIntroduzca una nota correcta (0-10): ");
			nota1 = entrada.nextDouble();
			}
			while(nota1<0 || nota1>10);
		}
		//Repetimos el proceso para la segunda nota.
		System.out.print("\nIntroduzca la segunda nota: ");
		double nota2 = entrada.nextDouble();
		if (nota2 < 0 || nota2 > 10) {
			do {
			System.out.print("\nIntroduzca una nota correcta (0-10): ");
			nota2 = entrada.nextDouble();
			}
			while(nota2<0 || nota2>10);
		}
		
		//Calculamos la media.
		media = (nota1 + nota2)/2;
		
		//Imprimimos el resultado final.
		System.out.print("\nLa media es: " + media);
		
		entrada.close();
	}
}
