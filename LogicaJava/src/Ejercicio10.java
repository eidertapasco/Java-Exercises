/*10. Cree un programa que tome un número real e imprima su valor absoluto.*/

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int numeroReal = entrada.nextInt();
		int numeroAbsoluto = 0;
		
		if(numeroReal >= 0) {
			System.out.println("Numero real: " + numeroReal);
			System.out.println("Numero absoluto: " + (numeroReal*1)); //Es redundante pero se hace con fines educativos
		}else if(numeroReal < 0) {
			numeroAbsoluto = (numeroReal*(-1));
			System.out.println("Numero real: " + numeroReal);
			System.out.println("Numero absoluto: " + numeroAbsoluto);
		}else {
			System.out.println("El valor ingresado es erroneo.");
		}
		
		entrada.close();
	}

}
