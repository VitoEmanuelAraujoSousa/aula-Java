
import java.util.Scanner;
public class SabendoSeEPrimo {
    public static void main (String args[]){ 
    Scanner vit = new Scanner (System.in);
    int n, tcl=0, resto, contar=0; 
    System.out.println("Digite um Número desejado : "); 
    n = vit.nextInt(); 

    while ( n >= tcl){
        tcl++;
        resto = n % tcl; 
    if ( resto == 0){
        contar++;
}
}
    if ( contar <= 2)
    {

    System.out.println("O Número "+n+" é primo");
    }else{
        System.out.println("Numéro "+n+" não é primo");
            } 
} 
}



    
        
  
    
 

