package blackjack;
public class Player extends Character{

	private int score;

        public Player()
        {
            score = 0;
        }
        
	public int getScore(){
            return score;
	}
        
	public void setScore(int s){
            score = s;
	}
        
        public void lose()
        {
            score--;
        }
        
        public void win()
        {
            score++;
        }
        
}
