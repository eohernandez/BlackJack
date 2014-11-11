package blackjack;
import java.util.*;
public class Deck 
{
        private Vector<Card> cards;
        private int cont;
    
	public Deck()
	{
            cards = new Vector<Card>();
            cont = 0;
            char [] suites = {'H', 'S', 'C', 'D'};
            char [] value = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
            
            for (int i=0; i<suites.length; i++)
            {
                for(int j=0; j<value.length; j++)
                {
                    cards.add(new Card(suites[i],value[j]));
                    cont++;
                }
            }
            cont = -1;
	}

	public void shuffle()
	{
            Collections.shuffle(cards);
	}
        
	public Card getNextCard()
	{
            cont++;
            return cards.get(cont);
	}

	public Card stand()
	{
            return cards.get(cont);
	}
}