/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class Compartimento{
    private String zona;
    private Equipamentos equipamentos;
    
    /**
     * 
     * @param zona 
     */
    public Compartimento(String zona){
        this.zona=zona;
        equipamentos = new Equipamentos();
    }
    
    /**
     * Mostrará os dados do Compartimento
     */
    public void show(){
        String show = "";
        show += "\nZona da casa: " + getZonaDaCasa() + "\n";
        for(Equipamento item: equipamentos){
            show += item.toString() + "\n";
        }
        System.out.println(show);
        

    }
    
    /**
     * Adiciona um equipamento, verificando se não existe um com o mesmo ID
     *
     * @param equipamento
     */
    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
    
    /**
     * Mostra os equipamentos listado por ordem de ID
     */
    public void showEquipamentos(){
        String show = "";
        
        for(Equipamento item: equipamentos){
            show += item.toString() + "\n";
        }
        System.out.println(show);
          
    }
    
    public void removerEquipamento(){
        this.showEquipamentos();
        System.out.println("Insira o ID que deseja remover");
        Scanner scanner= new Scanner(System.in);
        int id = scanner.nextInt();
        int i =0 ;
          for(Equipamento item: equipamentos){ 
             
            if(item.getID() == id){
                equipamentos.remove(i);
                break;
            }
        
          i++;              
          }
    }
     
    /**
     * Mostra a zona da casa que identifica este compartimento
     * @return zona da casa
     */
    public String getZonaDaCasa(){
        return this.zona;
        
    }

    @Override
    public String toString() {
        return "Compartimento: " + zona;
    }
    public Equipamento getEquipamento(int id){
        for (Equipamento e : equipamentos ){
            if (e.getID()== id)
                return e;
            
            }
        return null;
    }
    
    public ArrayList<Equipamento> getEquipamentos(){
        return equipamentos;
    }
}
