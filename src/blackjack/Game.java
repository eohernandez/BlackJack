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
            player.lose();
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

        //Prints hands
        System.out.println("Tu mano:");
        player.getHand().showHand(false);
        System.out.println("Mano del Dealer:");
        dealer.getHand().showHand(true);

        //Changes playing state
        playing = true;

        //Displays score
        System.out.println("Tu puntaje es: " + player.getScore());
    }

    public void hit(){
        Card aux;
        
        aux = deck.getNextCard();
        player.addToHand(aux);
        
        //Player can only hit if playing
        if(playing)
        {
            //Lose sequence when player loses by going over 21
            if(player.getHand().getHandTotal() > 21)
            {
                System.out.println("Lo siento perdiste!");
                System.out.println("Tu mano:");
                player.getHand().showHand(false);
                player.lose();
                playing = false;
                
                //Displays score
                System.out.println("Tu puntaje es: " + player.getScore());
            }

            else
            {
                //Prints hands
                System.out.println("Tu mano:");
                player.getHand().showHand(false);
                System.out.println("Mano del Dealer:");
                dealer.getHand().showHand(true);
            }
        }
        
        else
        {
            System.out.println("Comienza una partida con Deal");
        }
    }

    public void stand(){

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