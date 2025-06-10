/*13. Cree un programa que calcule el factorial de 5*/

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		double num = entrada.nextDouble();
		int numero = (int) num;
		
		int cont = 0;
		double factorial = 0;
		while(cont <= numero) {
			factorial += (numero*(numero-1));
			cont += 1;
		}
		System.out.println("Numero: " + (int) num);
		System.out.println("Numero factorial de " + num + " es: " + (int) factorial);
		
		entrada.close();
	}

}
