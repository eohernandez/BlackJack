package blackjack;
import java.util.*;
class Hand{
        
    private List<Card> cards;
    private int handTotal;
    
    public Hand()
    {
        handTotal = 0;
        cards = new ArrayList<Card>();
    }
    
    public void addToHand(Card card){
        cards.add(card);
        
        //Modifies handTotal depending on recieving card
        switch(card.getValue())
        {
            case 'A':
            {
                if(handTotal+11>21)
                    handTotal++;
                else
                    handTotal+=11;
            } break;
            case '2': handTotal += 2; break;
            case '3': handTotal += 3; break;
            case '4': handTotal += 4; break;
            case '5': handTotal += 5; break;   
            case '6': handTotal += 6; break;
            case '7': handTotal += 7; break;
            case '8': handTotal += 8; break;       
            case '9': handTotal += 9; break;
            case 'T': handTotal += 10; break;
            case 'J': handTotal += 10; break;    
            case 'Q': handTotal += 10; break;
            case 'K': handTotal += 10; break;
            default: break;    
        }
    }
    
    public void showHand(){
        Iterator iterator = cards.iterator();
        while(iterator.hasNext())
        {
            Card element = (Card) iterator.next();
            System.out.println(element.getSuite()+" "+element.getValue());
        }
    }
    
    public void emptyHand(){

    }
}