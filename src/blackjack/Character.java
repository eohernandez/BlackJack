package blackjack;
public class Character{

    private Hand hand;
        
    public Character()
    {
        hand = new Hand();
    }
    
    public Hand getHand(){
        return hand;
    }
    
    public void addToHand(Card c)
    {
        hand.addToHand(c);
    }
}