
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a 
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada 
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.  
 * @author melin
 */
public class TP02Ex07 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double[][] matriz = new double[3][4];
            
            System.out.println("Digite os 12 valores para a matriz 3x4:");
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Matriz[" + i + "][" + j + "]: ");
                    matriz[i][j] = scan.nextDouble();
                }
            }
            
            System.out.print("\nDigite a constante multiplicativa: ");
            double constante = scan.nextDouble();
            
            // Multiplicando cada elemento pela constante
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] *= constante;
                }
            }
            
            System.out.println("\nMatriz resultante:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
