/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domest;
import java.io.File;
import java.util.Scanner;
        
/**
 *
 *
 */

public class DOMEST {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nomeDoFicheiro = "DOMESTV1.txt";
       Scanner sc = new Scanner(System.in);
       File myFile = new File(nomeDoFicheiro);
       if(myFile.exists()){
            System.out.println("O ficheiro existe, pretende substituir?");
            String s = sc.nextLine();
                if(s.equalsIgnoreCase("Sim")){
                    
                }
                else if(s.equalsIgnoreCase("Nao")){
                    System.out.println("Ficheiro não guardado.");
                    
                }
       }
       else{
           System.out.println("O ficheiro não existe, a gravar...");
           
       }
                    
               
        Consola cl1 = new Consola();
        cl1.menu1();
    }
    
}
