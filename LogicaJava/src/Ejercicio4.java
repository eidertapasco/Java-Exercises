/*4. Cree un programa que tome la base y la altura de un triángulo e imprima su área.*/
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la base del triangulo: ");
		double base = entrada.nextDouble();
		System.out.print("Ingrese la altura del triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.println("El area del triangulo es: " + area);
		
		entrada.close();
	}
}
