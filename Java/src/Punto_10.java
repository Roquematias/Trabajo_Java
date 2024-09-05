import java.util.Scanner;

public class Punto_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.print("Introduce un número mayor o igual a cero: ");
			numero = scanner.nextInt();
		} while (numero < 0);

		System.out.println("El número ingresado es: " + numero);
		scanner.close();
	}
}
