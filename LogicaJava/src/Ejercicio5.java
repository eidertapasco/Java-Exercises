/*5. Cree un programa que tome el radio de un círculo e imprima su área y perímetro.
 * area = π * r ** 2
 * perimetro = 2 * π * r
 * */

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final double PI = 3.14;
		System.out.print("Ingrese el radio del circulo: ");
		double radio = entrada.nextDouble();
		
		double area = (PI * Math.pow(radio, 2));
		double perimetro = (2 * PI * radio);
		
		System.out.println("El area del triangulo: " + area);
		System.out.println("El perimetro del triangulo: " + perimetro);
		
		entrada.close();
	}

}
