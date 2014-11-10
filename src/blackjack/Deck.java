package blackjack;
import java.util.*;
public class Deck 
{
        Stack cards = new Stack();
    
	private void Deck()
	{
            char [] suites = {'H', 'S', 'C', 'D'};
            char [] value = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
            
            for (int i=0; i<suites.length; i++)
            {
                for(int j=0; j<value.length; j++)
                {
                    cards.push(new Card(suites[i], value[j]));
                }
            }
	}

	public void shuffle()
	{

	}

	public Card getNextCard()
	{   
            return (Card) cards.pop();
	}

	public Card stand()
	{
            return (Card) cards.pop();
	}
}