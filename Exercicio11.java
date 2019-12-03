public class Exercicio11 {
    public static void main(String[] args){ 
    	int [] a = new int [11];
    	
    	for (int i=0; i<a.length; i++){
    		a[i] = (int) Math.pow(2, i);
    		}
    	System.out.print("vetor A = ");
    	for (int i=0;i<a.length;i++){
    		System.out.println(a[i] + " ");
    		}
    	System.out.println();
    	}
    }