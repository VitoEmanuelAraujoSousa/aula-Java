
import java.util.Scanner;


public class Busca2 {
   public static void main(String[] args) {
	    Scanner busca = new Scanner(System.in);
	    System.out.println("Digite a quantidade numeros");
	    int n1 = 0, n2 = 1;
	    for (int qt = busca.nextInt(); qt > 0; qt --) {
	    	System.out.print(n1 + " ");
	   		int n3 = n1 + n2;
	        n1 = n2;
	        n2 = n3;
	    }
	    System.out.println("Fim");
	}
}
	
   


