import java.util.Scanner;
public class Exercicio9 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner (System.in);
		int[] a = new int[10];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o "+i+"° numero:");
			a[i] = ler.nextInt();
			}
		for (int i=0; i<a.length; i++) {
			System.out.println("Analise do numero :"+a[i]);
			for (int j=2; j<a[i]; j++) {
				if(j % 2 == 0) {
					System.out.println(j+" é par");
					}
				}
			System.out.println();
			}
		}
	}

