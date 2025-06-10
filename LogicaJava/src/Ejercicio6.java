/*6. Cree un programa que tome el lado de un cubo e imprima su volumen.*/

import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el lado del cubo: ");
		double ladoCubo = entrada.nextDouble();
		int volumen = (int) Math.pow(ladoCubo, 3);
		
		System.out.println("El volumen del cubo es: " + volumen);
		
		entrada.close();

	}

}
