/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
import java.util.Scanner;
public class TP02Ex11 {
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
            
            // Cálculo do determinante (simplificado para matrizes 2x2 e 3x3)
            double determinante = 0;
            
            switch (m) {
                case 2 -> determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
                case 3 -> determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                            - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                            + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
                default -> {
                    System.out.println("\nO cálculo do determinante para matrizes maiores que 3x3 não foi implementado.");
                    scan.close();
                    return;
                }
            }

            System.out.println("\nMatriz informada:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            
            System.out.println("\nDeterminante da matriz: " + determinante);
        }
    }
}

