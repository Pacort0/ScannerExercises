package basicexercises2;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		//Creamos el escaner para leer los datos que el usuario introduzca por consola
		Scanner sc = new Scanner(System.in);
		//Creamos las variables booleanas que vamos a usar en el programa
		Boolean lluvia;
		Boolean tareas;
		Boolean biblioteca;
		Boolean salir;
		
		//Imprimimos las preguntas que se nos pide hacer al usuario por pantalla y guardamos casa respuesta en una variable individual
		System.out.print("¿Está lloviendo? (responda true o false): ");
		lluvia = sc.nextBoolean();
		System.out.print("\n¿Has acabado tus tareas? (responda true o false): ");
		tareas = sc.nextBoolean();
		System.out.print("\n¿Vas a la biblioteca? (responda true o false): ");
		biblioteca = sc.nextBoolean();
		
		//Determinamos si el usuario puede o no salir a la calle mediante un operador ternario.
		salir = biblioteca || !lluvia && tareas ? true : false;
		//imprimimos el mensaje final
		System.out.print("\n¿Puedes salir?\n" + salir);
		
		sc.close();
		
		
	}

}
