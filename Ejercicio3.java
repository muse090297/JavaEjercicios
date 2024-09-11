
public class Ejercicio3 {
	public static void main(String[] args) {
		int cont = 1;
		char simbolo='*';
		
		for (int x=1; x<=6; x++) {
			for (int y=1; y<=cont; y++) {
				System.out.print(simbolo + " ");
			}
			System.out.println(" ");
			cont++;
		}

	}
}
