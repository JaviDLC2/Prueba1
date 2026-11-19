import java.util.Scanner;
public class H14E06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int contrasena = 123456;
		int intento;
		System.out.println("Introduzca una contraseña: ");
		intento = in.nextInt();
		if(intento == contrasena) {
			System.out.println("Bienvenido usuario!!!!!!!");
		}
		else {
			System.out.println("Uppps esa no era, te quedan 2 intentos");
			for(int i= 1;i<=2;i++) {
				System.out.println("Introduzca una contraseña: ");
				intento = in.nextInt();
				if(intento == contrasena) {
					System.out.println("Bienvenido usuario!!!!!!!");
					break;
				} else {
					System.out.println("Uppsssss esa no era te quedan " + (2-i)  + " intentos");
				}
				if(i==2) {
				System.out.println("No has entrado en el sistema");
				}
			}
		}
	}
}
