/*11. Cree un programa que simule el lanzamiento de dos dados y muestre la suma de los resultados*/

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int dadoUno = (int) (Math.random() * 6) + 1;
		int dadoDos = (int) (Math.random() * 6) + 1;
		int sumaDados = (dadoUno + dadoDos);
		
		System.out.println("Dado numero uno: " + dadoUno);
		System.out.println("Dado numero uno: " + dadoDos);
		System.out.println("Suma de ambos dados: " + sumaDados);
	}

}
