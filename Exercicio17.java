import java.util.Scanner;
public class Exercicio17{
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in); 
		int [] a = new int[10];
		boolean palindromo = true;
		 
		 for (int i=0; i<a.length; i++){
			 System.out.println("Entre com um número para a "+i+"° posição:");
			 a[i] = ler.nextInt();
			 }
		 
		 for (int i=0; i<a.length/2; i++) {
			 if (a[i] != a[a.length - 1 - i]) {
				 palindromo = false;
				 break;
				 }
			 }
		 System.out.print("Vetor A = ");
		 for (int i=0; i<a.length; i++) {
			 System.out.print(a[i] + " ");
			 }
		 System.out.println();
		 if(palindromo) {
			 System.out.println("É Palindromo");
			 }
		 else {
			 System.out.println("Não é palindromo");
			 }
		 }
	}	



