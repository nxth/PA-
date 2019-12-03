import java.util.Scanner;
public class Exercicio18 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in);
		 int[] a= new int[10];
		 int[] b = new int[a.length];
		 int[] c = new int[a.length];
		 
	     for (int i=0; i<a.length; i++){
	    	 System.out.println("Entre com um número para a "+i+"° posição de A:");
	    	 a[i] = ler.nextInt();
	    	 }
	     for (int i=0; i<b.length; i++){
	    	 System.out.println("Entre com um número para a "+i+"° posição de B:");
	    	 b[i] = ler.nextInt();
	    	 
	    	 if (a[i] == b[i] ) {
		 		 c[i] = 0;
		 	 }
		 	 else if (a[i] > b[i] ) {
		 		 c[i] = 1;
		 	 }
		 	 else {
		 		 c[i] = -1;
		 		 }
	    	 }
	
		     System.out.print("Vetor A = ");
			 for (int i=0; i<a.length; i++) {
				 System.out.print(a[i] + " ");
			 }
			 System.out.println();
			 System.out.print("Vetor B = ");
			 
			 for (int i=0; i<b.length; i++) {
				 System.out.print(b[i] + " ");
			 }
			 System.out.println();
			 System.out.print("Vetor C = ");
			 
			 for (int i=0; i<c.length; i++) {
				 System.out.print(c[i] + " ");
				 }
			 System.out.println();
			 }
	}