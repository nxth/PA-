import java.util.Scanner;
public class Exercicio6 {
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner (System.in);
		int[] a = new int[20];
		int[] b = new int [a.length];
		int t = 0;
		
		for (int i=0; i<a.length; i++){
			System.out.print("Digite o "+i+"° numero:");
			a[i] = ler.nextInt();
			}
			
        for (int n = 0; n<a.length; n++) {
            if (a[n] % 2 == 0){
            	b[t] = a[n];
            	t++;
            	}
            }
        for (int n = 0; n<a.length; n++) {
                if (a[n] % 2 != 0) {
                	b[t] = a[n];
                	t++;
                	}
                }
        System.out.print("Vetor A =");
        for (int i=0; i<a.length; i++){
        	System.out.print(a[i]+", ");
        	}
            System.out.println();
            
            System.out.print("vetor B =");
            for (int i=0; i<t; i++) {
            	System.out.print(b[i]+", ");
            	}
            }
	}
   
	