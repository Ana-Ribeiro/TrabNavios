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
public class Porto {
    
    private int NoMaxNavios;
    private int CapacidadeTotalNavios;
    private Navio[] navios;
    
    /**
     * Este é o construtor da class Porto que 
     * recebe como parâmetro o número máximo de navios 
     * que podem estar no porto
     * 
     * @param NoMaxNavios
     */
    public Porto(int NoMaxNavios){
        this.NoMaxNavios = NoMaxNavios;
        navios  = new Navio[NoMaxNavios];
        CapacidadeTotalNavios=0;
    }    
    
    /**
     * O Array Navio guarda o número de navios 
     * presentes no porto de 0 até ao NoMaxNavios
     * 
     * 
     * @return
     */
    
    public Navio[] getNavios(){
        return navios;
    }
    
    
    /**
     *<p>Este método serve para adicionar navios ao porto 
     *<p>Procura no array se já existe algum navio com a mesma matrícula 
     * e se a capacidade máxima de navios já foi atingida. 
     * Se a capacidade máxima já tiver sido atingida, ele avisa que foi atingida, se não
     * verifica se a matrícula já existe no array ou não.
     * Se existir ele indica que já existe. Se não, ele adiciona o navio ao array.
 
     * @param navio
     */
    public void addNavio(Navio navio){
        if (CapacidadeTotalNavios == NoMaxNavios){
            System.out.println("Foi atingido o número máximo de navios:" + NoMaxNavios);
            return;
        }
        
        boolean procura = false;
        for(int i=0; i<CapacidadeTotalNavios; i++ ){
           if (navios[i].matriculaNavio.equals(navio.matriculaNavio)){
                procura = true;
                System.out.println("A matrícula já existe!" + navio.getMatriculaNavio());
            }   
        }
        
        if (procura == false){
            navios[CapacidadeTotalNavios] = navio;
            CapacidadeTotalNavios++;
           
        }
        
    }
    
    /**
     *Este método serve para calcular a capacidade total de carga 
     *de todos os navios atracados no porto
     * 
     * @return
     */
    public float capacidadeTotal(){
        float toneladas = 0; 
        
        for (int i=0; i<CapacidadeTotalNavios; i++){
            if (navios[i] instanceof Petroleiro){
                Petroleiro petroleiro = (Petroleiro) navios[i];
                toneladas = toneladas + petroleiro.getCarga();
            }else if (navios[i] instanceof PortaContentores){
                PortaContentores portaContentores = (PortaContentores) navios[i];
                toneladas = toneladas + portaContentores.getNumeroMaxContentores()*10;
            }
        }
        
        return toneladas;
    }
}
    
    
    

