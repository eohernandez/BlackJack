package blackjack;

public class Card{

	private char suite;
	private char value;

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