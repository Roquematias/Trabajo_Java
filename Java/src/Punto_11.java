import java.util.Scanner;

public class Punto_11 {
	public static void main(String[] args) {
		String contraseñaCorrecta = "2708";
		Scanner scanner = new Scanner(System.in);
		boolean accesoConcedido = false;
		int intentos = 3;

		while (intentos > 0) {
			System.out.print("Introduce la contraseña: ");
			String contraseñaIngresada = scanner.nextLine();

			if (contraseñaIngresada.equals(contraseñaCorrecta)) {
				accesoConcedido = true;
				break;
			} else {
				intentos--;
				if (intentos > 0) {
					System.out.println("Contraseña incorrecta. Te quedan "
							+ intentos + " intentos.");
				}
			}
		}

		if (accesoConcedido) {
			System.out.println("Acceso Correcto");
		} else {
			System.out.println("Acceso Denegado");
		}

		scanner.close();
	}
}
