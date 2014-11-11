package blackjack;

public class Game 
{
	private Deck deck;
	private Player player;
	private Dealer dealer;
        private boolean playing;
        
        public Game()
        {
            deck = new Deck();
            player = new Player();
            dealer = new Dealer();
            playing = false;
        }
        
	public void deal(){
            Card aux;
            
            if(playing)
            {
                int score = player.getScore();
                player.setScore(score--);
            }
            
            //Creates new deck and shuffles
            deck = new Deck();
            deck.shuffle();
            
            //Empties players hands
            player.getHand().emptyHand();
            dealer.getHand().emptyHand();
            
            for(int i=0; i<2; i++)
            {
                aux = deck.getNextCard();
                player.addToHand(aux);
                aux = deck.getNextCard();
                dealer.addToHand(aux);
            }
            System.out.println("Tu mano:");
            player.getHand().showHand(false);
            System.out.println("Mano del Dealer:");
            dealer.getHand().showHand(true);
            
            playing = true;
	}

	public void hit(){

	}

	public void stand(){

	}

	public void newGame(){
               
	}
        
        public boolean getPlaying()
        {
            return playing;
        }
        
        public void setPlaying(boolean a)
        {
            playing = a;
        }
}