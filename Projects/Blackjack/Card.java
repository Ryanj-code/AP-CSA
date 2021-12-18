public class Card{
  //initialize fields
  private int value;
  private String rank;
  private String suit;

  public Card(String rank, String suit){
    this.rank = rank;
    this.suit = suit;
    switch (rank) {
      case "A" : value = 1;
      case "2" : value = 2;
      case "3" : value = 3;
      case "4" : value = 4;
      case "5" : value = 5;
      case "6" : value = 6;
      case "7" : value = 7;
      case "8" : value = 8;
      case "9" : value = 9;
      case "10" : value = 10;
      case "J" : value = 11;
      case "Q" : value = 12;
      case "K" : value = 13;
      default : value = 0;
    } //set value correspsonding to the rank
  }

  public String toString(){
    return "Rank : " + rank + "\nValue : " + value + "\nSuit : " + suit;
  } //returns the card

  public int getValue(){
    return value;
  } //return value

  public String getSuit(){
    return suit;
  } //return suit

  public String getRank(){
    return rank;
  } //return rank

  public String cardEquality(Card a, Card b){
    if(a.getValue() > b.getValue()){
      return "The card " + a + "is greater";  
    }
    else if(a.getValue() < b.getValue()){
      return "The card " + b + "is greater";
    }
    else{
      return "The cards are equal";
    }
  } //compare the value of the two cards
}
