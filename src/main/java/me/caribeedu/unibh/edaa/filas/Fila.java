/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.caribeedu.unibh.edaa.filas;

/**
 *
 * @author Edu
 */
public class Fila {
    private char[] itens;
    
    public Fila() {
        itens = new char[0];
    }
    
    public void adicionar(char novoItem) {
        char[] itemsAtualizados = new char[itens.length + 1];
        
        System.arraycopy(itens, 0, itemsAtualizados, 0, itens.length);
        
        itemsAtualizados[itens.length] = novoItem;
        
        itens = itemsAtualizados;
    }
    
    public Character remover() {
        if (itens.length == 0)
            return null;
        
        char itemRemover = itens[0];
        
        char[] itemsAtualizados = new char[itens.length - 1];
        
        System.arraycopy(itens, 1, itemsAtualizados, 0, itemsAtualizados.length);
                
        itens = itemsAtualizados;
        
        return itemRemover;
    }
    
    public int tamanho() {
        return itens.length;
    }
}
