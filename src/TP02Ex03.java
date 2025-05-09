
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de 
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não 
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a 
digitação dos “N” valores, exibir:  
a. O maior valor;  
b. O menor valor;  
c. A soma dos valores;  
d. A média aritmética dos valores;  
e. A porcentagem de valores que são positivos;  
f. 
A porcentagem de valores negativos;  Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do 
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o 
programa em função dessa resposta. 
 * @author melin
 */
public class TP02Ex03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char continuar;
            
            do {
                int n;
                do {
                    System.out.print("Digite a quantidade de valores (positivo e menor que 20): ");
                    n = scanner.nextInt();
                    
                    if (n <= 0 || n >= 20) {
                        System.out.println("Erro: O valor deve ser positivo e menor que 20!");
                    }
                } while (n <= 0 || n >= 20);
                
                double[] valores = new double[n];
                
                for (int i = 0; i < n; i++) {
                    System.out.print("Digite o " + (i+1) + "º valor: ");
                    valores[i] = scanner.nextDouble();
                }
                
                // Cálculos
                double maior = valores[0];
                double menor = valores[0];
                double soma = 0;
                int positivos = 0;
                
                for (double valor : valores) {
                    if (valor > maior) maior = valor;
                    if (valor < menor) menor = valor;
                    soma += valor;
                    if (valor > 0) positivos++;
                }

                double media = soma / n;
                double percPositivos = (positivos * 100.0) / n;
                double percNegativos = 100 - percPositivos;
                
                // Resultados
                System.out.println("\nResultados:");
                System.out.println("Maior valor: " + maior);
                System.out.println("Menor valor: " + menor);
                System.out.println("Soma dos valores: " + soma);
                System.out.println("Média aritmética: " + media);
                System.out.println("Porcentagem de valores positivos: " + percPositivos + "%");
                System.out.println("Porcentagem de valores negativos: " + percNegativos + "%");
                
                // Perguntar se deseja continuar
                do {
                    System.out.print("\nDeseja executar novamente? (S/N): ");
                    continuar = scanner.next().toUpperCase().charAt(0);
                    
                    if (continuar != 'S' && continuar != 'N') {
                        System.out.println("Erro: Digite apenas S ou N!");
                    }
                } while (continuar != 'S' && continuar != 'N');
                
            } while (continuar == 'S');
            
            System.out.println("Programa encerrado.");
        }
    }
}
