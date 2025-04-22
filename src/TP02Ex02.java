
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class TP02Ex02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] valores = new double[10];
            
            for (int i = 0; i < 10; i++) {
                do {
                    System.out.print("Digite o " + (i+1) + "º valor positivo: ");
                    valores[i] = scanner.nextDouble();
                    
                    if (valores[i] <= 0) {
                        System.out.println("Erro: O valor deve ser positivo!");
                    }
                } while (valores[i] <= 0);
            }
            
            // Cálculos
            double maior = valores[0];
            double soma = 0;
            
            for (double valor : valores) {
                if (valor > maior) {
                    maior = valor;
                }
                soma += valor;
            }

            double media = soma / valores.length;
            
            // Resultados
            System.out.println("\nResultados:");
            System.out.println("Maior valor: " + maior);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética: " + media);
        }
    }
}
