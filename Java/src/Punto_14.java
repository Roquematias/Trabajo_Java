import java.util.Scanner;

public class Punto_14 {
	public static void main(String[] args) {
		int numeroAleatorio = new Double(Math.random() * 100).intValue();
		Scanner scanner = new Scanner(System.in);
		int intento;
		int cantidadIntentos = 0;

		System.out
				.println("He generado un número aleatorio entre 0 y 100. Intenta adivinarlo.");

		do {
			System.out.print("Ingrese un número entre 0 y 100: ");
			intento = scanner.nextInt();
			cantidadIntentos++;

			if (intento < numeroAleatorio) {
				System.out.println("Es muy bajo.");
			} else if (intento > numeroAleatorio) {
				System.out.println("Es muy alto.");
			} else {
				System.out.println("¡Correcto! Número encontrado en "
						+ cantidadIntentos + " intentos.");
				break;
			}
		} while (true);

		scanner.close();
	}
}
