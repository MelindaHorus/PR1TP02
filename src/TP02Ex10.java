
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, 
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, 
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x 
colunas).  

 * @author melin
 */
public class TP02Ex10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int m;
            do {
                System.out.print("Digite a ordem da matriz quadrada (máximo 10): ");
                m = scan.nextInt();
            } while (m <= 0 || m > 10);
            
            double[][] matriz = new double[m][m];
            
            System.out.println("\nDigite os elementos da matriz " + m + "x" + m + ":");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Matriz[" + i + "][" + j + "]: ");
                    matriz[i][j] = scan.nextDouble();
                }
            }
            
            // Cálculo da matriz inversa (simplificado - apenas para matrizes 2x2)
            if (m == 2) {
                double det = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
                
                if (det == 0) {
                    System.out.println("\nA matriz não possui inversa (determinante zero).");
                } else {
                    double[][] inversa = new double[2][2];
                    inversa[0][0] = matriz[1][1] / det;
                    inversa[0][1] = -matriz[0][1] / det;
                    inversa[1][0] = -matriz[1][0] / det;
                    inversa[1][1] = matriz[0][0] / det;
                    
                    System.out.println("\nMatriz original:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    
                    System.out.println("\nMatriz inversa:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(inversa[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("\nO cálculo da matriz inversa para ordens maiores que 2 não foi implementado.");
            }
        }
    }
}
