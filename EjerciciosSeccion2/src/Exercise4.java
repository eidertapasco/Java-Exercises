/*4. Cree un programa que calcule el promedio de tres notas para n estudiantes. Use ciclo for. Use funciones.
*/

import java.util.Scanner;
import java.util.Locale; /*línea para usar el locale de EE.UU., que acepta el punto como decimal*/

public class Exercise4 {
	
	public static double calculoPromedio(double n1, double n2, double n3) {
		return(n1 + n2 + n3)/3;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); // Acepta punto como decimal
		
		System.out.print("Ingrese el numero de estudiantes: ");
		int cantEstudiantes = Integer.parseInt(entrada.nextLine());
		
		for(int i = 1; i <= cantEstudiantes; i++) {
			System.out.println("Estudiante " + i);
			
			System.out.print("Nota 1: ");
			double nota1 = entrada.nextDouble();	
			System.out.print("Nota 2: ");
			double nota2 = entrada.nextDouble();
			System.out.print("Nota 3: ");
			double nota3 = entrada.nextDouble();
			
			double promedio = calculoPromedio(nota1, nota2, nota3);
			System.out.println("PROMEDIO: " + promedio);
			
		}
		entrada.close();
		
	}

}
