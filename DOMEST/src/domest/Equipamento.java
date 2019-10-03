/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domest;


/**
 *
 * @author tiago
 */
public class Equipamento {
    private static int ID= 0;
    private final int id;
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }
    private String compartimentoAssociado; //Compartimento comp;
    //private final int  ID;
    
    
    public Equipamento(String compartimentoAssociado){
       ID++;
       id=ID;
       this.compartimentoAssociado=compartimentoAssociado;
    }
    
    /**
     * Mostra se o equipamento está ligado ou não
     */
    
    
    /**
     * 
     * @return Retorn o ID do equipamento
     */
    public int getID(){
        return id;
    }

    @Override
    public String toString() {
        return "Equipamento " + " ID=" + id;
    }
    
}
