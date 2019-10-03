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
public class ArCondicionado extends Equipamento implements Atuador {
    private boolean estado;
    private float temperatura;
    public ArCondicionado(String compartimentoAssociado) {
        super(compartimentoAssociado);
        temperatura = 0;
        estado = false;
    }
    /**
     * Altera a temperatura nos sensores de Temperatura
     */
    @Override
    public String toString() {
        return "ID: " + getID() + " ArCondicionado" + temperatura;
    }
    @Override
    public boolean isEstado() {
        return estado;
    }
    public float getTempAC(){
        return temperatura;
    }
    @Override
    public void alterar() {
        
    }
    
}
