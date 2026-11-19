import java.util.Scanner;
public class H14E07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0;
		int suma = 1;
		int maximo = 1;
		int minimo = 1;
		int contador = 0;
		System.out.println("Introduzca un número entero");
		suma = in.nextInt();
		while (suma != 0) {
		if(contador == 0) {
			minimo = suma;
			maximo = suma;
		} else {
			minimo = Math.min(minimo, suma);
			maximo = Math.max(maximo, suma);
		}
		numero += suma;
		contador++;
		System.out.println("Introduzca un número entero");
		suma = in.nextInt();
		}
		double media = (double) numero/contador;
		System.out.println("La media es " + media );
		System.out.println("El más grande es " + maximo);
		System.out.println("El mas pequeño es " + minimo);
	}

}
