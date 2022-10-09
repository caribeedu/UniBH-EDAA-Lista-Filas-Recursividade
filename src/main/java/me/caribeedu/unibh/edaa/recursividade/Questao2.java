package me.caribeedu.unibh.edaa.recursividade;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Questao2 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int n = -1;
        
        while(n <= 0) {
            System.out.println("Insira um número inteiro e positivo N:");
            n = input.nextInt();
        }
        
        System.out.println("Números naturais de 0 até N:");
        imprimirNumerosAteN(0, n);
    }
    
    private static void imprimirNumerosAteN(int numeroAtual, int N) {
        System.out.println(numeroAtual);
        
        if (numeroAtual < N) {
            numeroAtual++;
            imprimirNumerosAteN(numeroAtual, N);
        }
    }
}
