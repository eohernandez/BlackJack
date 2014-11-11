package blackjack;

public class Card{

	private char suite;
	private char value;
        
        public Card()
        {
            suite = '-';
            value = '-';                    
        }
        
        public Card(char s, char v)
        {
            suite = s;
            value = v;
        }
        
	public char getSuite(){
            return suite;
	}
	public char getValue(){
            return value;
	}
	public void setSuite(char c){
            suite = c;
	}
	public void setValue(char c){
            value = c;
	}
}