/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorpresadaniela;

import java.util.Scanner;

/**
 *
 * @author hca
 */
public class SorpresaDaniela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lee = new Scanner(System.in);
        String lectura = "";
        int numFav, numNoFav;
        int cont = 0;
        StringBuilder luis = new StringBuilder();
        StringBuilder dani = new StringBuilder();
        
        System.out.println("Hola Daniela, me alegra que hayas encontrado tu sorpresa, intenta no romperla");
        
        while(!lectura.equalsIgnoreCase("N")){
            
            luis.delete(0, luis.length());
            dani.delete(0, dani.length());
            
            luis.append("Luis es ");
            dani.append("Dani es ");
            
            System.out.println("Escribe tu número entero favorito");
            
            lectura = lee.nextLine();
            
            try{
                numFav = Integer.parseInt(lectura);
                if(numFav < 1){
                    System.out.println("Vuelve a intentar");
                    continue;
                }else{
                    while(cont<numFav){
                        luis.append("muy ");
                        cont++;
                    }
                    luis.append("cool!");
                    cont =0;
                }
                System.out.println(luis.toString());
            }catch(Exception e){
                System.out.println("Dije un número");
                continue;
            }
            
            System.out.println("Escribe el número que más odias:");
            
            lectura = lee.nextLine();
            
            try{
                numNoFav = Integer.parseInt(lectura);
                if(numNoFav < 0){
                    System.out.println("Que no sea negativo");
                    continue;
                }else{
                    while(cont<numNoFav){
                        dani.append("muy ");
                        cont++;
                    }
                    dani.append("chafa :(");
                    cont = 0;
                }
                System.out.println(dani.toString());
            }catch(Exception e){
                System.out.println("Dije un número");
                continue;
            }
            
            System.out.println("Gustas volver a intentar?(Y/N) ((Todo lo que no sea n lo tomaré como un SI))");
            
            lectura = lee.nextLine();
        }
        
        System.out.println("Espero hayas disfrutado tu sorpresa :)");
        System.out.println("Btw creo que hice esto en el directorio de alguien que no conocemos");
        System.out.println("P.D. me tienes que mandar una fotito de que viste tu sorpresa.");
        
    }
    
}
