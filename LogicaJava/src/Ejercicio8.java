/*8. Cree un programa que tome el valor de un producto e imprima su precio final si éste tiene
siempre un descuento del 10%.
*/

import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final double DESCUENTO = (10/100.0);
		
		System.out.print("Ingrese el precio del producto: ");
		double precioProducto = entrada.nextDouble();
		
		double precioFinal = (precioProducto-(precioProducto*DESCUENTO));
		
		System.out.println("Precio sin descuento: " + precioProducto);
		System.out.println("Precion con 10% de descuento: " + precioFinal);
		
		entrada.close();
	}

}
