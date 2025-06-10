/*1. Cree un programa que lea la edad de un usuario y muestre cuántos años tendrá el usuario
dentro de tantos años como éste indique. Por ejemplo, si el usuario tiene 20 años y quiere saber
cuántos años tendrá dentro de 15 años, el programa deberá mostrar que tendrá 35 años.
*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su edad actual: ");
		short edad = entrada.nextShort();
		
		if(edad >= 1) {
			System.out.print("Cuantos años en el futuro quiere añadir: ");
			int añosFuturos = entrada.nextInt();
			
			if(añosFuturos >= 1) {
				int edadFutura = (edad + añosFuturos);
				System.out.println("Su edad actual es " + edad + " y dentro de " + añosFuturos + 
						" años usted tendrá " + edadFutura + " años");
			}else {
				System.out.println("Años invalidos. Los años futuros deben ser mayores o iguales a 1");
			}
		}else {
			System.out.println("Edad invalida, la edad no puede ser menor a 1");
		}
		
		entrada.close();

	}

}
