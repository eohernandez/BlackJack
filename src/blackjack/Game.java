package blackjack;

public class Game 
{
	private Deck deck;
	private Player player;
	private Dealer dealer;
        
        public Game()
        {
            deck = new Deck();
            player = new Player();
            dealer = new Dealer();
        }
        
	public void deal(){
            Card aux;
            for(int i=0; i<2; i++)
            {
                aux = deck.getNextCard();
                player.addToHand(aux);
                aux = deck.getNextCard();
                dealer.addToHand(aux);
            }
            player.getHand().showHand();
	}

	public void hit(){

	}

	public void stand(){

	}

	public void newGame(){
               
	}
}