package me.caribeedu.unibh.edaa.recursividade;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Questao1 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número N:");
        
        int n = input.nextInt();
        
        int soma = calcularSomatorioAteN(0, 1, n);
        
        System.out.println("Soma dos números até N:");
        System.out.println(soma);
    }
    
    private static int calcularSomatorioAteN(int somaAtual, int numeroAtual, int n) {
        somaAtual = somaAtual + numeroAtual;
        numeroAtual++;
        
        if (numeroAtual > n)
            return somaAtual;
        else
            return calcularSomatorioAteN(somaAtual, numeroAtual, n);
    }
}
