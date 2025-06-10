/*12. Cree un programa que realice la conversión de grados Celsius a Fahrenheit*/

import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese los grados Celsius: ");
		double celsius = entrada.nextDouble();
		//Formula (n °C × 9/5) + 32 = 41 °F

		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("Grados Celsius: " + celsius + "°C");
		System.out.println("Grados Celsius convertidos a Fahrenheit: " + fahrenheit + "°F" );
		
		entrada.close();
	}

}
