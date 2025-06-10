/*5. Cree un programa que muestre los números naturales de 1 a n. Use ciclo while.*/

import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int numero = entrada.nextInt();
		int base = 1;
		
		while(base <= numero) {
			System.out.println(base);
			base += 1;
		}
		entrada.close();

	}

}
