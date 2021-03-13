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
public class Navio {
    
        String matriculaNavio;
        String nome;
        float comprimento;
        
    /**
     * Contrutor da class Navio que recebe como parâmetro
     * a matrícula do navio
     * 
     * @param matricula
     */
    public Navio(String matricula){
            this.matriculaNavio = matricula;
        }
        
    
    /**
     * Get da Matrícula do Navio
     * 
     * @return
     */
    public String getMatriculaNavio(){
            return this.matriculaNavio;
        }
        
    
    /**
     * Set do Nome do Navio
     * 
     * 
     */
    public void setNome(){
            this.nome = nome;
        }
        
    
    /**
     * Get do nome do navio que recebe como parâmetro uma 
     * string Name
     * 
     * @param Name
     * @return
     */
    public String getNome(String Name){
            return this.nome;
        }
        
    
    /**
     * Set do comprimento do navio
     * 
     */
    public void setComprimento(){
            this.comprimento = comprimento;
        }
        
    
    /**
     * Get do comprimento do Navio que recebe como 
     * parâmetro um float comp
     * 
     * @param Comp
     * @return
     */
    public float getComprimento(float Comp){
            return this.comprimento;
        }
            
        


}
        
        
        
    
    

