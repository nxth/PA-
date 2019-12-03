import java.util.Scanner;
public class Exercicio16 {
	private static Scanner ler;
	public static void main(String[] args) {
        ler = new Scanner(System.in);
        int[] a = new int[10];
        int num;
        
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite um valor para a "+i+"° posição:");
            a[i] = ler.nextInt();
            }
        
        System.out.println("Digite uma valor pra procurar:");
        num = ler.nextInt();
        
        for(int i=0; i<a.length; i++){
        	if(a[i] == num){
                System.out.println("O valor esta dentro da "+i+"° posição");
                }
        	}
        }
	}
	
           