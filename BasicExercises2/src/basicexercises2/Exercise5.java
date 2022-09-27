package basicexercises2;
import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		//Creamos el escaner para leer los datos que el usuario introduzca por consola
		Scanner sc = new Scanner (System.in);
		//Creamos las variables que vamos a usar en el programa
		int nota1;
		int nota2;
		int nota3;
		double media;
		
		//imprimimos los mensajes pidiendo al usuario las notas de cada trimestre y guardando cada respuesta en una variable individual
		System.out.print("Introduzca su nota del primer trimestre: ");
		nota1 = sc.nextInt();
		System.out.print("Introduzca su nota del segundo trimestre: ");
		nota2 = sc.nextInt();
		System.out.print("Introduzca su nota del tercer trimestre: ");
		nota3 = sc.nextInt();
		
		//Hacemos las operaciones pertinentes para calcular la media del alumno
		media = nota1 + nota2 + nota3;
		media /= 3;
		
		//Imprimimos la media que aparecerá en el boletín de calificaciones, haciendo un cast a int
		System.out.print("En su boletín de calificaciones aparecerá que usted tiene un " + (int) media);
		//Imprimimos la media que aparecerá en el expediente académico
		System.out.print("\nEn su expediente académico aparecerá que usted tiene un " + media);
		
		sc.close();
	}

}
