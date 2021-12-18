import java.util.*;

class Main {
  public static void main(String[] args) {
    //initialize variables
    boolean p1Turn = true;
    boolean p2Turn = true;
    boolean checkWin = true;
    int choice = 0;

    Blackjack Game = new Blackjack("A", "Spades");
    Game.shuffle();
    Game.getDeck();

    for (int x = 0; x < 2; x++){
      Game.p1Draw(1);
    }
    for (int y = 0; y < 2; y++){
      Game.p2Draw(1);
    }

    while(Game.getP1Total() < 21 && p1Turn){
      Scanner in = new Scanner(System.in);

      System.out.println("P1 hand : ");
      Game.viewP1Hand();
      System.out.println("\nAction : \n1) Draw a card. \n2) End turn.");
      choice = in.nextInt();
      
      if (choice == 1){
        Game.p1Draw(1);
      }
      else if(choice == 2){
        p1Turn = false;
      }
      if (Game.getP1Total() > 21){
        System.out.println("You went over 21.\nPlayer 2 wins.");
         checkWin = false;
      }
    }

    if(checkWin)
    while(Game.getP2Total() < 21 && p2Turn){
      Scanner in = new Scanner(System.in);

      System.out.println("P2 hand : ");
      Game.viewP2Hand();
      System.out.println("\nAction : \n1) Draw a card. \n2) End turn.");
      choice = in.nextInt();
      
      if (choice == 1){
        Game.p2Draw(1);
      }
      else if(choice == 2){
        p2Turn = false;
      }
      if (Game.getP2Total() > 21){
        System.out.println("You went over 21.\nPlayer 1 wins.");
      }
    }

    if(Game.getP1Total() < 21 && Game.getP2Total() < 21){
      if(Game.getP1Total() > Game.getP2Total()){
        System.out.println("Player 1 wins.");
      }
      else if(Game.getP1Total() < Game.getP2Total()){
        System.out.println("Player 2 wins.");
      }
      else{
        System.out.println("The game is a tie.");
      }
    }
  }
}
