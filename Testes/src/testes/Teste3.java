package testes;

public class Teste3 {

	public static void main(String[] args) {
		

		for (int a = 1; a < 20; a = a + 2) {
			System.out.print(a + " ");
		}
			System.out.println();
		 for(int b = 2;b <= 128;b= 2*b) {
			 System.out.print(b + " "); }
		 

		 System.out.println();
		 for(int c = 0;c < 20;c++) 
		 { System.out.print(c*c + " "); }
		 

		 System.out.println();
		 for(int d = 2;d < 20;d= d+2) { 
			 System.out.print(Math.pow(d,2) + " ");
		 }
		 
		 System.out.println();
		 int x = 1; 
		 int y = 1;
		 
		 for(int i = 0;i < 20;i++) {
			 
			 System.out.print( x + " ");
			 int aux = x+y;
			 x = y; 
			 y = aux; 
			 }
	}
}
