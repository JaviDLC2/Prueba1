import java.util.Scanner;
public class H14E04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un número entero: ");
		numero = in.nextInt();
		for ( int i = 0, j = numero; i<=numero && j>=0; i++,j--) {
			System.out.println(i + "\t" + j);
		}
	}

}
