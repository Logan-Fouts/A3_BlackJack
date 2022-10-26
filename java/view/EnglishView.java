package view;

/**
 * Implements an english console view.
 */
public class EnglishView implements View {

  /**
   * Shows a welcome message.
   */
  public void displayWelcomeMessage() {
    for (int i = 0; i < 50; i++) {
      System.out.print("\n");
    }
    System.out.println("Hello Black Jack World");
    System.out.println("Type 'p' to Play, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
  }

  /**
   * Returns pressed characters from the keyboard.

   * @return the pressed character.
   */
  public Event getInput() {
    try {
      int c = System.in.read();
      while (c == '\r' || c == '\n') {
        c = System.in.read();
      }
      if (c == 'p') {
        return Event.Play;
      } else if (c == 'h') {
        return Event.Hit;
      } else if (c == 's') {
        return Event.Stand;
      } else if (c == 'q') {
        return Event.Quit;
      }
    } catch (java.io.IOException e) {
      System.out.println("" + e);
      return null;
    }
    return null;
  } 

  public void displayCard(model.Card card) {
    System.out.println("" + card.getValue() + " of " + card.getColor());
  }

  /** A more exciting display of the cards dealt. */
  public void excitingDisplayCard(model.Card c, boolean pord) {
    if (pord) {
      System.out.print("Dealer");
    } else {
      System.out.print("Player");
    }
    System.out.print(" Drew A: ");
    displayCard(c);
  }

  public void displayPlayerHand(Iterable<model.Card> hand, int score) {
    displayHand("Player", hand, score);
  }

  public void displayDealerHand(Iterable<model.Card> hand, int score) {
    displayHand("Dealer", hand, score);
  }

  private void displayHand(String name, Iterable<model.Card> hand, int score) {
    System.out.println(name + " Has: ");
    for (model.Card c : hand) {
      displayCard(c);
    }
    System.out.println("Score: " + score);
    System.out.println("");
  }

  /**
   * Displays the winner of the game.

   * @param dealerIsWinner True if the dealer is the winner.
   */
  public void displayGameOver(boolean dealerIsWinner) {
    System.out.println("GameOver: ");
    if (dealerIsWinner) {
      System.out.println("Dealer Won!");
    } else {
      System.out.println("You Won!");
    }

  }
}
