
import java.util.Random;
import java.util.Scanner;


public class Ex1_buscaSenquencial {
    public static int busca(int vetor [], int tcl, int valor){
        int i = 0;
        while((i < tcl) && (vetor[i] != valor)){
            i++;
        }
    if ((tcl == 0) && (i > tcl)) i = -1;
    return 1;
    }
    public static void main(String[] args) {
        Random numero = new Random();
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        int x = busca(vetor,tcl,7);
        System.out.println(' ' + busca);
    }

}