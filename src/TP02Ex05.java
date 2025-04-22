
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class TP02Ex05 {
     public static void main(String[] args) {
         try (Scanner scan = new Scanner(System.in)) {
             String[][] nomes = new String[2][3];
             
             System.out.println("Digite os 6 nomes para a matriz 2x3:");
             
             for (int i = 0; i < 2; i++) {
                 for (int j = 0; j < 3; j++) {
                     System.out.print("Matriz[" + i + "][" + j + "]: ");
                     nomes[i][j] = scan.nextLine();
                 }
             }
             
             System.out.println("\nMatriz de Nomes 2x3:");
             for (int i = 0; i < 2; i++) {
                 for (int j = 0; j < 3; j++) {
                     System.out.print(nomes[i][j] + "\t");
                 }
                 System.out.println();
             }}
    }
}
