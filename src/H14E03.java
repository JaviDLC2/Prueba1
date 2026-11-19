import java.util.Scanner;
public class H14E03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero1;
		int numero2;
		int anterior = 1;
		System.out.println("Introduzca 2 números enteros: ");
		numero1 = in.nextInt();
		numero2 = in.nextInt();
		if (numero1 < 0 || numero2 < 0) {
			System.out.println("Mensaje error");
		} else {
			for(int i = 1;i<=(Math.min(numero1, numero2)); i++) {
				if((numero1%i == 0) && (numero2%i == 0)) {
					anterior = Math.max(anterior, i);
				}
			}
			System.out.println(anterior);
		}
	}
}
