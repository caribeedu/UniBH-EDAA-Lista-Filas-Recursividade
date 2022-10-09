package me.caribeedu.unibh.edaa.recursividade;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Questao3 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        int k = -1;
        int n = -1;
        
        while(k <= 0 || n <= 0) {
            System.out.println("Insira um número inteiro e positivo K:");
            k = input.nextInt();
            
            System.out.println("Insira um número inteiro e positivo N:");
            n = input.nextInt();
        }
        
        int resultado = potencializar(k, n, 1, k);
        System.out.println("K elevado à N é " + resultado);
    }
    
    private static int potencializar(int K, int N, int multiplicacoes, int valorAtual) {
        valorAtual = valorAtual * K;
        multiplicacoes++;
        
        if (multiplicacoes == N)
            return valorAtual;
        else
            return potencializar(K, N, multiplicacoes, valorAtual);
    }
}
