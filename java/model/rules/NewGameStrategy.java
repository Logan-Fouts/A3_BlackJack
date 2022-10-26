package model.rules;

import model.Dealer;
import model.Deck;
import model.Player;

/**
 * Rule interface for mangaing the start of a new game. I.e. dealing the cards.
 */
public interface NewGameStrategy {
  /**
   * Encapsulates the start of a new game. I.e. should deal cards to dealer and player according to some rule.

   * @param deck The deck to use to get cards from.
   * @param dealer The dealer to deal cards to.
   * @param player The player to deal cards to.
   * @return True if the game could be started.
   */
  boolean newGame(Deck deck, Dealer dealer, Player player);
}