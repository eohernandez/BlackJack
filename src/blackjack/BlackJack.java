package blackjack;

import java.util.*;

/**
 *  Blackjack game by Diego Garza, Enrique Hernandez and Marcelo Salcedo
 */
public class BlackJack {
    
    private static Scanner in = new Scanner(System.in); //Scanner global
    
    public static void main(String[] args) {
        
        int option;
        Game game = new Game();
        
        do
        {
            option = menu();
            switch (option)
            {
                case 1: game.deal();
                    break;
                case 2: game.hit();
                    break;
                case 3: game.stand();
                    break;
                case 4: System.out.println("Gracias por jugar!");
                    break;
                default: System.out.println("Opcion incorrecta!");
                    break;                    
            }
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