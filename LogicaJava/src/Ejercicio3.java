/*3. En un almacén de electrodomésticos se venden éstos a crédito y de contado. Si el cliente
compra a crédito, el valor del electrodoméstico aumenta en un 5% por cada mes que dure el
crédito. Cree un programa para un almacén donde el administrador ingrese el precio de un
electrodoméstico y el plazo en meses para pagarlo a crédito y muestre el valor fijo de las cuotas
mensuales que deberá pagar por el electrodoméstico.*/


import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		double intereses = 0.05; // Operation 5/100.0 o 100f
		
		System.out.print("Ingrese el precio del electrodomestico: ");
		double precioElectrodomestico = entrada.nextDouble();
		System.out.print("Ingrese los meses a financiar: ");
		int cuotas = entrada.nextInt();
		
		double valorMensual = (precioElectrodomestico/cuotas);
		double interesesTotales = (precioElectrodomestico*intereses); //5000
		double cuotaMensual = (valorMensual+interesesTotales);
		
		System.out.println("Valor electrodomestico: " + precioElectrodomestico);
		System.out.println("Numero de cuotas del credito: " + cuotas);
		System.out.println("Valor mensual: " + valorMensual);
		System.out.println("Valor mensual + intereses del 5%: " + cuotaMensual);
		
		entrada.close();
	}
}
