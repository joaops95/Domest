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
public class SensorDeLuz extends Equipamento implements Sensor {
    private float f;
    private boolean estado;
    public SensorDeLuz(String compartimentoAssociado) {
        super(compartimentoAssociado);
        f = 0;
        estado = false;
    }

    @Override
    public float ler() {
       return f;
    }

    public float getLeitura() {
        return f;
    }
    @Override
    public boolean isEstado() {
        return estado;
    }
      
    @Override
    public String toString() {
        return "ID: " + getID() + " SensorDeLuz" + f;
    }
    
    
}
