package basicexercises2;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		//Creamos el escaner para leer lo que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		
		//Creamos una variable estática para almacenar el precio por kilo de cada fruta
		final double precioManzana = 2.35;
		final double precioPera = 1.95;
		//Creamos una variable para calcular y almacenar los ingresos totales.
		double ingresosTotales;
		
		//Mostramos por pantalla dos mensajes, pidiendo con cada uno la cantidad de kilos de fruta vendidos ese semestre, respectivamente.
		System.out.print("Introduzca la cantidad de kilos de manzanas vendidos este semestre: ");
		//Guardamos el valor que introduzca el usuario en una variable que usaremos también para calcular los ingresos.
		int ingresosManzanas = sc.nextInt();
		System.out.print("\nIntroduzca la cantidad de kilos de peras vendidos este semestre: ");
		int ingresosPeras = sc.nextInt();
		
		//Hacemos los cálculos pertinentes, usando operadores de "opera y asigna".
		ingresosManzanas *= precioManzana;
		ingresosPeras *= precioPera;
		ingresosTotales = ingresosManzanas+ingresosPeras;
		
		//Imprimimos los mensajes de fin del programa, dando los resultados al usuario.
		System.out.print("\nLos ingresos totales gracias a la venta de manzanas es de " + ingresosManzanas + " euros.");
		System.out.print("\nLos ingresos totales gracias a la venta de peras es de " + ingresosPeras + " euros.");
		System.out.print("\nLos ingresos totales gracias a la venta de ambas frutas es de " + ingresosTotales + " euros.");
		
		sc.close();
	}

}
