/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domest;

/**
 *
 * @author JoaoSantos
 */
public class Lampada extends Equipamento implements Atuador {

   private boolean estado; 
    public Lampada(String compartimentoAssociado) {
        super(compartimentoAssociado);
        estado=false;
    }
    /**
     * Altera o estado das lampadas
     */

    public boolean alterarEstado(int id){
       estado=!estado;
       return estado;
    }
    
    @Override
    public String toString() {
        return "ID: " + getID() + " Lampada" + estado;
    }

   @Override
    public boolean isEstado() {
        return estado;
    }
    
    
    @Override
    public void alterar() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}