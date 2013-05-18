
package testes_bestas;
import java.util.Scanner;

/**
 *
 * @author cleitoncsg
 */
public class Limpa_Console {

 
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
    
        System.out.println("Aperte qualquer telcla para limpar a tela\n");
        String retardaTempo = receba.nextLine();
        
         for(int i = 0 ; i < 1000 ; i++) {
            System.out.println();
        }
    }
         
}
