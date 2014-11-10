/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author enriqueohernandez
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner in = new Scanner(System.in); //Scanner global
    
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        
        do
        {
            option = menu();
        }while(option != 4);
    }
   
    public static int menu()
    {
        int option; 
        System.out.println("Elije una opcion:");
        System.out.println("1. Deal");
        System.out.println("2. Hit");
        System.out.println("3. Stand");
        System.out.println("4. Salir");
        
        option = in.nextInt();
                
        return option;
    }

}
