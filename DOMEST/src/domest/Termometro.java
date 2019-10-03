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
public class Termometro extends Equipamento implements Sensor {
    private float temperatura;
    private boolean estado;
    
    public Termometro(String compartimentoAssociado) {
        super(compartimentoAssociado);
        this.temperatura=0;
    }
    @Override
    public boolean isEstado() {
        return estado;
    }
    @Override
    public String toString() {
        return "ID: " + getID() + " Termometro " + temperatura;
    }
    public float getTemp(){
        return temperatura;
    }

    @Override
    public float ler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    



    
}
