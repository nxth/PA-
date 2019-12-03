import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int teste = 0; 
		int k; 
		int soma = 0;
		int[] a = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o "+(1+i)+"º valor");
			a[i] = ler.nextInt();
			}
		for (i = 0; i < 10; i++) {
			teste = 0;
			for (k = 1; k <= a[i]; k++) {

				if (a[i] % k == 0) {
					teste++;
					}
				}
			if (teste == 2) {
				System.out.println("O "+(i+1)+"º número é primo");
				soma++;
				} else {
				System.out.println("O "+(i+1)+"º número não é primo");
				}
			}
		System.out.println("O total de números primos é "+soma);
		}
	}