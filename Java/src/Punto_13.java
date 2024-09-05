import java.util.Scanner;

public class Punto_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");
		int numero = scanner.nextInt();

		if (numero <= 1) {
			System.out.println("El n�mero no es primo.");
		} else {
			boolean esPrimo = true;
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				System.out.println("El n�mero es primo.");
			} else {
				System.out.println("El n�mero no es primo.");
			}
		}

		scanner.close();
	}
}
