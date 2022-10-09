package me.caribeedu.unibh.edaa.filas;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Questao1 {
    public static void main(String[] args) {
        Fila fila1 = new Fila(); // Caracteres em maiusculo
        Fila fila2 = new Fila(); // Caracteres em minusculo
        
        final Scanner input = new Scanner(System.in);
        
        System.out.println("Insira uma cadeia de caracteres:");
        
        String stringInserida = input.next();
        
        for (char caracter : stringInserida.toCharArray()) {
            if (!Character.isLetter(caracter))
                continue;
            
            if (Character.isUpperCase(caracter))
                fila1.adicionar(caracter);
            else if (Character.isLowerCase(caracter))
                fila2.adicionar(caracter);
        }
        
        System.out.println("Fila 1 - Caracteres em maiúsculo");
        decomporFila(fila1);
        
        System.out.println("Fila 2 - Caracteres em minúsculo");
        decomporFila(fila2);
    }
    
    private static void decomporFila(Fila filaCaracteres) {
        while(filaCaracteres.tamanho() > 0) {
            Character caractereRemovido = filaCaracteres.remover();
            System.out.println(caractereRemovido);
        }
    }
}
