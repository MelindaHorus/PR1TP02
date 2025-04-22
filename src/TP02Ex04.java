
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.  
 * @author melin
 */
public class TP02Ex04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[][] matriz = new double[2][3];
            
            System.out.println("Digite os 6 valores para a matriz 2x3:");
            
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Matriz[" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextDouble();
                }
            }
            
            System.out.println("\nMatriz 2x3:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
