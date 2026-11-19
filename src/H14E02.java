import java.util.Scanner;
public class H14E02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int giro = 0;
		int suma = 1;
		while (suma != 0) {
		System.out.println("Introduzca el tamaño del giro: ");
		suma = in.nextInt();
		giro += suma;
		}
	System.out.println("Resultado: " + (giro/360) + " vueltas y " + (giro%360) + " grados" );
	}
}
