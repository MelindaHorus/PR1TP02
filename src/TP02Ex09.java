
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class TP02Ex09 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int m, n;
            do {
                System.out.print("Digite o número de linhas (M) da matriz (máximo 10): ");
                m = scan.nextInt();
                System.out.print("Digite o número de colunas (N) da matriz (máximo 10): ");
                n = scan.nextInt();
            } while (m <= 0 || m > 10 || n <= 0 || n > 10);
            double[][] matriz = new double[m][n];
            double[][] transposta = new double[n][m];
            System.out.println("\nDigite os elementos da matriz " + m + "x" + n + ":");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Matriz[" + i + "][" + j + "]: ");
                    matriz[i][j] = scan.nextDouble();
                }
            }   // Calculando a transposta
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    transposta[j][i] = matriz[i][j];
                }
            }   System.out.println("\nMatriz original:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }   System.out.println("\nMatriz transposta:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(transposta[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
