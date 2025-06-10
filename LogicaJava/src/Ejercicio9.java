/*9. Cree un programa que lea una cantidad e imprima un porcentaje a calcular requerido sobre esa cantidad.*/

import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese una cantidad: ");
		int cantidad = entrada.nextInt();
		System.out.print("Ingrese el porcentaje a calcular para la cantidad: ");
		double porcentaje = entrada.nextDouble();
		
		porcentaje = (porcentaje/100.0);
		
		double porcentajeCantidad = (porcentaje*cantidad);
		
		System.out.println("La cantidad: " + cantidad);
		System.out.println("El porcentaje a calcular: " + porcentaje +"%");
		System.out.println("El porcentaje de la cantidad es: " + porcentajeCantidad);
		
		entrada.close();
	}

}
