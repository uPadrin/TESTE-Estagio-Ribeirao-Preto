package testes;

public class Teste3 {

	public static void main(String[] args) {

		System.out.println("A)");
		for (int a = 1; a < 20; a = a + 2) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("B)");
		for (int b = 2; b <= 128; b = 2 * b) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("C)");
		for (int c = 0; c < 20; c++) {
			System.out.print(c * c + " ");
		}
		System.out.println();
		System.out.println("D)");
		for (int d = 2; d < 20; d = d + 2) {
			System.out.print(Math.pow(d, 2) + " ");
		}
		System.out.println();
		System.out.println("E)");
		int x = 1;
		int y = 1;

		for (int i = 0; i < 20; i++) {

			System.out.print(x + " ");
			int aux = x + y;
			x = y;
			y = aux;
		}
	}
}
