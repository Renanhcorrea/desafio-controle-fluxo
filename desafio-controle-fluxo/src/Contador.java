
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);

        System.out.println("Digite dois numeros: ");
        
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();
    
        try {
            // Method that contains the counting logic 
            // Metodo contendo a logica de contagem 
            contar (parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");

        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Checking if the first parameter is greater than or equal the second
        // Verificando se o primeiro parâmetro é maior ou igual ao segundo.
        int contagem = parametroDois - parametroUm;
        if (contagem <= 0){
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < contagem; i++) {
            System.out.println(i);                
        }
    }


}
