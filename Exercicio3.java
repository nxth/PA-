import java.util.Scanner;
public class Exercicio3 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		
		for ( int i = 0; i < 5; i++) {
			System.out.println("Digite o "+(1+i)+"° numero:");
			a[i] = ler.nextInt();
			}
		
		for (int i =4; i>=0; i--) {
			b[i] = a[i];
			System.out.println(b[i]);
			}
		}
	}