public class H14E08 {
	public static void main(String[] args) {
		int x  =(int) (Math.random() * 250 + 1);
		int contador = 1;
		for(int i = 1; i<=10;i++) {
			for(int j = 1; j<=25;j++) {
				if(contador == x) {
					System.out.print("X ");
				}
			else {
				System.out.print("· ");
			}
				contador++;
			}
			System.out.println();
		}
	}
}
