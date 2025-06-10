/*7. Cree un programa que tome el precio de un producto e imprima su precio final al consumidor
con un IVA de 19%.*/

import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final double IVA = 19/100.0;
		
		System.out.println("Ingrese el precio del producto: ");
		double precioProducto = entrada.nextDouble();
		
		double precioFinalProducto = (precioProducto + (precioProducto*IVA));
		System.out.println("Precio del producto sin 19% IVA: " + precioProducto);
		System.out.println("Precio del producto con 19% IVA: " + precioFinalProducto);
		
		entrada.close();
	}

}
