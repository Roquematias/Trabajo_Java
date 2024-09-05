import java.util.Scanner;

public class Punto_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dia;
		boolean diaValido = false;

		do {
			System.out
					.print("Introduce un número del 1 al 7 para el día de la semana (1= lunes, 7= domingo): ");
			dia = scanner.nextInt();

			if (dia >= 1 && dia <= 7) {
				diaValido = true;
			} else {
				System.out.println("Número inválido. Inténtalo de nuevo.");
			}
		} while (!diaValido);

		switch (dia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Es un día laboral.");
			break;
		case 6:
		case 7:
			System.out.println("Es un día no laboral.");
			break;
		}

		scanner.close();
	}
}
