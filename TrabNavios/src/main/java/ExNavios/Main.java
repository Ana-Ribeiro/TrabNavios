package ExNavios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anari
 * @since 03/2020
 */
public class Main {
    
    /**
     * <p>Este é o método principal que cria um porto que pode receber
     * 10 navios no máximo; um navio petroleiro e um navio porta contentores
     * <p> Posteriormente adiciona esses navios ao porto e imprime para o ecrã 
     * a capacidade total de carga dos navios que se encontram atracados no porto.
     * 
     * @param args
     */
    public static void main (String[]args){
        Porto porto1 = new Porto(10);
        Petroleiro petro1 = new Petroleiro("65-AC-XE", "Petroleiro1", 250, 100);
        PortaContentores cont1 = new PortaContentores("A5-43-VH", "PtContentor1", 400, 300);
        porto1.addNavio(petro1);
        porto1.addNavio(cont1);
        
        System.out.println("A capacidade total de carga dos navios presentes no porto é de" + porto1.capacidadeTotal());
    
    
    }
}
