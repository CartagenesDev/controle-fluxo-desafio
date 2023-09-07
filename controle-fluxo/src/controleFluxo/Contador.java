package controleFluxo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        int parametroUm =0;
        int parametroDois = 0;
        //trata a exceção de digitar um valor diferente de um numero inteiro
        try{
        System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
        }catch(InputMismatchException e){
              System.out.println("Erro de entrada: Certifique-se de digitar números inteiros válidos.");
            terminal.close();
            return; // Encerra o programa aqui para evitar exceções adicionais.
        
        }

        try {

            contar(parametroUm , parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        terminal.close();
       
        
    }    

   
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
    for (int i = 1; i <= contagem; i++) {
        System.out.println("Imprimindo o número " + i);
    }
    }    
}
