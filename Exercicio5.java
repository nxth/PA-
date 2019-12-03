import java.util.Scanner;
public class Exercicio5 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in);
		int [] a = new int[10];
		int [] b = new int[10];
		int [] c = new int[10];
		int  maior = 0;
		int menor = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor");
			a[i] = ler.nextInt();
			b[i] = a[i];
			c[i] = a[i];
			}
		for (int i=0; i<b.length; i++) {
			System.out.print(+b[i] + " ");
			}
		System.out.println(" ");
		for (int j =c.length-1; j>=0; j--) {
			System.out.print(+c[j] + " ");
			}
		}
	}