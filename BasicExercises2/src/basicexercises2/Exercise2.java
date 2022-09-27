package basicexercises2;
import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		//Creamos el escaner para leer los datos que el usuario introduzca por consola
		Scanner sc = new Scanner (System.in);
		//Creamos la variable booleana con la que vamos a definir si el usuario es mayor de edad o no
		Boolean literal;
		
		//Imprimimos el mensaje inicial por consola, pidiendo la edad del usuario
		System.out.print("Por favor, introduzca su edad: ");
		//Guardamos la edad del usuario en una variable
		int edad = sc.nextInt();
		
	    //usamos un operador ternario para definir si el usuario es mayor de edad o no, y guardamos el resultado en la variable booleana
		literal = edad > 18 ? true : false;
		//imprimimos el mensaje final
		System.out.print( "¿Es usted mayor de edad?" + "\n" + literal);
		
		sc.close();
	}

}
