import java.util.Scanner;
public class Exercicio1 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int i=0;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o valor "+(i+1)+"° valor");
			a[i] = ler.nextInt();
			
			b[i] = (int) Math.sqrt(a[i]);
			}
		
		for (i = 0; i < 10; i++) {
			System.out.println("O " + (i+1) + "º valor de b é "+ b[i]);
		}

	}

}