import java.util.*;

public class Blackjack extends Deck{
  //initialize fields
  private int p1Total;
  private int p2Total;
  public ArrayList<Integer> p1Hand;
  public ArrayList<Integer> p2Hand;

  public Blackjack(String rank, String suit){ 
    super(rank, suit);
    p1Total = 0;
    p2Total = 0;
    p1Hand = new ArrayList<Integer>();
    p2Hand = new ArrayList<Integer>();
  } // constructor

  public void viewP1Hand(){
    System.out.print(p1Hand);
  } // gets player 1's hand

  public void viewP2Hand(){
    System.out.print(p2Hand);
  } // gets player 2's hand
 
  public int getP1Total(){
    return p1Total;
  } //returns player 1's total hand

  public int getP2Total(){
    return p2Total;
  } //returns player 2's total hand

  public void p1Draw(int x){
    int var1 = Deck.get(0);
    if(x == 1){
      if(var1 >= 11){
        p1Hand.add(10);
      }
      else{
        p1Hand.add(var1);
      }
      p1Total += var1;
    }
    Deck.remove(0);
  } //Player 1 draws a card if they choose to

  public void p2Draw(int y){
    int var2 = Deck.get(0);
    if(y == 1){
      if(var2 >= 11){
        p2Hand.add(10);
      }
      else{
        p2Hand.add(var2);
      }
      p2Total += var2;
    }
    Deck.remove(0);
  } //Player 2 draws a card if they choose to
}
