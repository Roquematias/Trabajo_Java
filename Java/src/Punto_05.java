import java.util.Scanner;

public class Punto_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El n�mero es divisible entre 2.");
		} else {
			System.out.println("El n�mero no es divisible entre 2.");
		}

		scanner.close();
	}
}
