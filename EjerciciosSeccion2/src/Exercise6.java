/*6. Cree un programa que calcula la suma de los primeros n números naturales.*/

import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int numero = entrada.nextInt();
		int base = 1;
		int suma = 0;
		
		while(base <= numero) {
			suma += base;
			base += 1;
		}
		
		System.out.println("Resultado suma: " + suma);
		entrada.close();
	}

}
