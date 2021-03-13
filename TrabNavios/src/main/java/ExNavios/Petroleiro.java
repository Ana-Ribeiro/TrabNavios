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
public class Petroleiro extends Navio {
    
    private float carga;
    
    /**
     * Construtor da class Petroleiro que recebe como parâmetro 
     * a matrícula do navio, o nome, o comprimento e a carga
     * 
     * @param matricula
     */
    public Petroleiro(String matricula,String nome, float comprimento, float carga){
        super(matricula);
        this.carga = carga;
    }
    
    
    /**
     * Set da carga do navio
     * 
     * @param carga
     */
    public void setCarga(float carga){
        this.carga =  carga;
    }
    
    /**
     * Get da carga do navio
     * 
     * @return
     */
    public float getCarga(){
        return this.carga;
    }
    
    
    
}
