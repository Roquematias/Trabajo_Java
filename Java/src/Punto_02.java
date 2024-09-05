import java.util.Scanner;
import javax.swing.JOptionPane;
public class Punto_02 {
	 public static void main(String[] args) {
	        // Usar Scanner para leer desde la consola
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce tu nombre (desde la consola): ");
	        String nombreConsola = scanner.nextLine();
	        System.out.println("Bienvenido " + nombreConsola);

	        // Usar JOptionPane para leer desde un cuadro de diálogo
	        String nombreDialogo = JOptionPane.showInputDialog("Introduce tu nombre (desde el cuadro de diálogo):");
	        JOptionPane.showMessageDialog(null, "Bienvenido " + nombreDialogo);
	    }
}
