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
public class PortaContentores extends Navio{
    
    private int numeroMaxContentores;
    
    /**
     *Construtor da class PortaContentores que recebe como parâmetro a 
     * matrícula do navio, o nome o comprimento e o Número máximo de Porta Contentores
     * 
     * @param matricula
     */
    public PortaContentores(String matricula, String nome, float comprimento, int
    NoMaxContentores){
        super(matricula);
        this.numeroMaxContentores = numeroMaxContentores;
    }
    
    
    /**
     * Set do Número máximo de Porta Contentores
     * 
     */
    public void setNumeroMaxContentores(){
        this.numeroMaxContentores = numeroMaxContentores;
    }
    
    /**
     * Get do Número máximo de Porta Contentores
     * 
     * @return
     */
    public int getNumeroMaxContentores(){
        return this.numeroMaxContentores;
    }
    
}
