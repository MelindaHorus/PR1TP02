
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */

public class TP02Ex01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();
            
            double valor2;
            do {
                System.out.print("Digite o segundo valor (deve ser maior que o primeiro): ");
                valor2 = scanner.nextDouble();
                
                if (valor2 <= valor1) {
                    System.out.println("Erro: O segundo valor deve ser maior que o primeiro!");
                }
            } while (valor2 <= valor1);
            
            System.out.println("Valores válidos: " + valor1 + " e " + valor2);
        }
    }
}

