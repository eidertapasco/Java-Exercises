/*2. Cree un programa que lea dos números y muestre su producto, su módulo, su cociente, su
suma y su resta.
*/

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//valores de entrada
		System.out.print("Ingrese el primer numero: ");
		int numeroUno = entrada.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int numeroDos = entrada.nextInt();
		
		//operaciones
		int producto = (numeroUno * numeroDos);
		int modulo = (numeroUno % numeroDos);
		int cociente = (numeroUno / numeroDos);
		int suma = (numeroUno + numeroDos);
		int resta = (numeroUno - numeroDos);
		
		//salida de todos los datos
		System.out.println("Numero uno: " + numeroUno + " Numero dos: " + numeroDos + " Producto: " + producto);
		System.out.println("Numero uno: " + numeroUno + " Numero dos: " + numeroDos + " Modulo: " + modulo);
		System.out.println("Numero uno: " + numeroUno + " Numero dos: " + numeroDos + " Cociente: " + cociente);
		System.out.println("Numero uno: " + numeroUno + " Numero dos: " + numeroDos + " Suma: " + suma);
		System.out.println("Numero uno: " + numeroUno + " Numero dos: " + numeroDos + " Resta: " + resta);
		
		entrada.close();
	}

}
