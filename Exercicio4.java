import java.util.Scanner;
public class Exercicio4 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in);
		int[] a = new int[10];
		int maior = 0; 
		int menor = 0;
		

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"° numero:");
			a[i] = ler.nextInt();
			
			if (i == 0) {
				maior = a[i];
				menor = a[i];
				}
			else if (a[i] > maior) {
				maior = a[i];
				}
			
			else if (a[i] < menor) {
				menor = a[i];
				}
			}
		System.out.println("o maior numero é "+ maior+" e o menor numero é "+menor);
		}
	}