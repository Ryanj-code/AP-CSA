import java.util.*;

public class Deck extends Card{
  public ArrayList<Integer> Deck;
  public Deck (String rank, String suit){
    super(rank, suit);
    //creates deck
    Deck = new ArrayList<Integer>();
    for (int i = 1; i < 14; i++){
      for(int x = 0; x < 4; x++){
        Deck.add(i);
      }
    }
  }

  public void shuffle(){
    Collections.shuffle(Deck);
  } //shuffles the deck

  public void getDeck(){
    System.out.println(Deck);
  } //prints the deck

  public boolean isDeckEmpty(){
    if(Deck.size() > 0){
      return false;
    }
    return true;
  } //returns false is deck size is greater than 0
}
