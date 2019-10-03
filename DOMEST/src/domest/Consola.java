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
public class Consola {
    private boolean ligado;
    private Compartimentos compartimentos;
    private Scanner input = new Scanner(System.in);
   
    public Consola(){
       compartimentos=new Compartimentos();
    }
    public void showConsole(){
            menu1();
        }
    public void menu1(){
        String totalmenu1 = "";
        int op;
        totalmenu1 += "\tConsola DOMEST\n";
        totalmenu1 += "1.\tFunção Reset\n";
        totalmenu1 += "2.\tFunção Recover\n";
        totalmenu1 += "3. \tDesligar Consola \n";
        totalmenu1 += "Escolha a sua opção:";
        do{
            System.out.println(totalmenu1);
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("DOMEST reseted");
                        for(int i = 0; i<15; i++)
                            System.out.println();
                    menu2();
                    break;
                case 2:
                    System.out.println("Dados recuperados");
                    //menu3();
                    break;
                default:
                    System.out.println("Opção não definida");
                    continue;
                    
                
            }
        }while(op != 3);
        for(int i = 0; i<15; i++)
            System.out.println();
        desligarConsola();
        System.exit(0);
        
    }
    public void menu2(){
        String totalmenu2 = "";
        int op;
        // MENU 2
        totalmenu2 += "\tMenu DOMEST\n";
        totalmenu2 += "1.\tModo de Manutenção\n";
        totalmenu2 +="2.\tModo de Utilização\n";
        totalmenu2 +="3.\tVoltar\n";
        totalmenu2 += "Escolha uma opção:";
        do{
            //System("CLS");
            System.out.println(totalmenu2);
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("Modo de Manutenção");
                        for(int i = 0; i<15; i++)
                            System.out.println();
                    menu21();
                    break;
                case 2:
                    System.out.println("Modo Utilização");
                    menu22();
                    break;
                default:
                    System.out.println("Opção não definida");
                    
                    
                
            }
        }while(op != 3);
        for(int i = 0; i<15; i++)
            System.out.println();
        menu1();
    }
    public void menu21(){
        String totalmenu21 = "";
        int op;
        // MENU 2.1
        totalmenu21 += "\tDOMEST (Modo Manutenção)\n";
        totalmenu21 += "Adicionar:\n";
        totalmenu21 += "1.\tCompartimento\n";
        totalmenu21 += "2.\tEquipamento a compartimento\n";
        totalmenu21 += "Listar:\n";
        totalmenu21 += "3.\tCompartimentos\n";
        totalmenu21 += "4.\tEstado de todos os equipamentos ordenados por tipo\n";
        totalmenu21 += "5.\tEstado de todos os equipamentos ordenados por compartimento\n";
        totalmenu21 += "6.\tVoltar\n";
        totalmenu21 += "Escolha a sua opção:";
        do{
            //System("CLS");
            System.out.println(totalmenu21);
            op = input.nextInt();
            switch(op){
                case 1:
                    adicionarCompartimento();
                    
                    break;
                case 2:
                    System.out.println("Adiciona Equipamento a Compartimento");
                    adicionarEquipamento();
                    //menu3();
                    break;
                case 3:
                    System.out.println(" Lista todos os compartimenots");
                    showCompartimentos();
                    break;
                case 4:
                    System.out.println("Lista estado de todos oes equipamentos por tipo");
                    break;
                case 5:
                    System.out.println("Lista todos os equipamentos por compartimento");
                    showEquipamentosPorCompartimento();
                    break;
                default:
                    System.out.println("Opção não definida");
                    
                    
                
            }
        }while(op != 6);
        for(int i = 0; i<15; i++)
            System.out.println();
        menu2();
    }
    public void menu22(){
        String totalmenu22 = "";
        int op;
        // MENU 2.2

        totalmenu22 += "\tDOMEST (Modo Utilização)\n";
        totalmenu22 += "Ligar/Desligar:\n";
        totalmenu22 += "1.\tConsola\n";
        totalmenu22 += "2.\tEquipamento\n";
        totalmenu22 += "Outras:\n";
        totalmenu22 += "3.\tConsultar o estado do equipamento\n";
        totalmenu22 += "4.\tDefenir a temperatura do AC\n";
        totalmenu22 += "5.\tVoltar\n";
        totalmenu22 += "Escolha a sua opção:";
        do{
            //System("CLS");
            System.out.println(totalmenu22);
            op = input.nextInt();
            switch(op){
                case 1:
                    
                    System.out.println("GoodBye :)");
                    System.exit(0);
                    
                    break;
                case 2:
                    System.out.println("Liga/Desliga Equipamento");
                    break;
                case 3:
                    System.out.println("Consulta estado do equipamento");
                    showAllEquipamentosByEstado();
                    break;
                case 4:
                    System.out.println("Define temp AC");
                    break;
                default:
                    System.out.println("Opção não definida");
                    
                    
                
            }
        }while(op != 5);
        for(int i = 0; i<15; i++)
            System.out.println();
        menu2();
    }
    /**
     * Verifica se existe um compartimento com a mesma desiganação do usado em argumento
     */
    private boolean verificarCompartimentos(Compartimento comp){
            for(Compartimento item: compartimentos){
                if(comp.getZonaDaCasa().equalsIgnoreCase(item.getZonaDaCasa()))
                    return false;
            }
            return true;
    }
    

    
    // FUNCOES DE MANUTENCAO
    
    /**
     * Adiciona um compartimento à consola verificando se não existe nenhum com a mesma zona da casa
     * @param compartimento 
     */
    public void adicionarCompartimento(){
        System.out.println("Por favor indique o nome do compartimento: ");
        Scanner scanner = new Scanner(System.in);
        String getit = scanner.nextLine();
        if(verificarCompartimentos(new Compartimento(getit)))
            compartimentos.add(new Compartimento(getit));
        else
            System.out.println("Compartimento duplicado");
        
    }
        
    
    
    public void adicionarEquipamento(){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Equipamentos Disponiveis:");
        showCompartimentos();
        System.out.println("A Qual dos compartimentos pretende adicionar o equipamento");
        String compartimentoaux = sc.nextLine();
        if(!verificarCompartimentos(new Compartimento(compartimentoaux))){
            
            System.out.println("Qual é o tipo de equipamento que quer adicionar?");
            System.out.println("1- Sensor de Luminosidade");
            System.out.println("2- Termometro");
            System.out.println("3- Lampada");
            System.out.println("4- Ar Condicionado");
            System.out.println("Selecione a opção: ");
            Compartimento compartimento = getCompartimentoByString(compartimentoaux);
                switch(sc.nextInt()){
                    case 1:
                        compartimento.adicionarEquipamento(new SensorDeLuz(compartimento.getZonaDaCasa()));
                        break;
                    case 2:
                        compartimento.adicionarEquipamento(new Termometro(compartimento.getZonaDaCasa()));
                        break;
                    case 3:
                        compartimento.adicionarEquipamento(new Lampada(compartimento.getZonaDaCasa()));
                        break;
                    case 4:
                        compartimento.adicionarEquipamento(new ArCondicionado(compartimento.getZonaDaCasa()));
                        break;
                    default:
                        System.out.println("Nao é uma opcao valida");
            }
        }
        else{
            System.out.println("Não Existe o compartimento ");
        }
    }
    
    /**
     * Irá mostrar os compartimentos, por ordem alfabética
     * @return 
     */ 
    public String showCompartimentos(){
        
        String show = "";
        for(Compartimento item: compartimentos){
            System.out.println(item.getZonaDaCasa() + "\n");
        }
        return show;
          
    }
        
    
    
    /**
     * Irá mostrar os equipamentos, separados por compartimento
     */
    public void showEquipamentosPorCompartimento(){
        for(Compartimento item: compartimentos){
            System.out.println(item.getZonaDaCasa());
            item.showEquipamentos();
        }
        
        
    }
    
    /**
     * Mostra todos os equipamentos organizados por ID
     */
    public void showAllEquipamentosByEstado(){
        System.out.println("Ligados:");
        for(Compartimento item: compartimentos){
            for (Equipamento e: item.getEquipamentos()){
                if(e.isEstado()){
                    System.out.println(e.toString());
                }
            }
            
        }
        
         System.out.println("Desligados:");
        for(Compartimento item: compartimentos){
            for (Equipamento e: item.getEquipamentos()){
                if(!e.isEstado()){
                    System.out.println(e.toString());
                }
            }
            
        }
    
    

    }
    public void showAllEquipamentosByTipo(){
        System.out.println("Lampadas: ");
        for(Compartimento item: compartimentos){
            for (Equipamento e: item.getEquipamentos()){
               
                    System.out.println(e.toString());
                
            }
            
        System.out.println("ArCondicionados: ");
        System.out.println("Termometros");
        System.out.println("SensorDeLuz");
    }
    // MODO DE UTILIZACAO
    /**
     * altera o estado da Consola para o seu estado oposoto(desligado/ligado)
     */

    /**
     * Desligar a Consola guardando os dados da consola numa FILE
     */
    public void desligarConsola(){
        System.out.println("GoodBye");
        System.exit(0);
        
    }
    
    /**
     * Ligar a Consola conforme o modo escolhido de RESET ou RECOVER
     */
    public void ligarConsola(){
        
    }
    
    /**
     * Desliga um equipamento
     */
    public void desligarEquipamento(){
        
    }
    public Compartimento getCompartimentoByString(String compString){
        for(Compartimento item: compartimentos){
            if(compString.equalsIgnoreCase(item.getZonaDaCasa()))
                return item;
        }
        return null;
       
    }
    /**
     * Alterar o ar expelido pelo Ar Condicionado de um determinado atuador de temperatura
     * 
     */
    public void mudarTemperatura(){
        
    }
    
    
}
