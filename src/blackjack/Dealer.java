package blackjack;
public class Dealer extends Character{
    public Dealer()
    {
        
    }
    public void addToHand(Card c)
    {
        super.getHand().addToHand(c);
    }
}