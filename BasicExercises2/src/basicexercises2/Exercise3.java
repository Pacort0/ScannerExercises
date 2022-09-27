package basicexercises2;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		//Creamos el escaner para leer los datos que el usuario introduzca por consola
		Scanner sc = new Scanner(System.in);
		//Creamos la variable booleana con la que vamos a determinar si el número introducido es par o impar
		Boolean bool;
		
		//imprimimos el mensaje inicial por pantalla, pidiendo el numero al usuario
		System.out.print("Introduzca un número: ");
		//Creamos una variable donde guardar el numero introducido y lo guardamos
		double numero = sc.nextDouble();
		
		//determinamos si el numero es par o impar usando un operador ternario
		bool = (int)numero%2 == 0 ? true : false;
		//imprimimos el mensaje final
		System.out.print("¿Es su número par?\n" + bool);
		
		sc.close();
	}

}
