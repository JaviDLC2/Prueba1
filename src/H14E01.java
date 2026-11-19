import java.util.Scanner;
public class H14E01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int caracter;
		System.out.println("Introducte un carácter: ");
		caracter = in.nextLine().charAt(0);
		for( int i = 32; i<=caracter;i++) {
		System.out.print((char)i + " ");
		}
	}
}
