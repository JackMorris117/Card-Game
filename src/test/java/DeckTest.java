import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private SuitType suits;
    private RankType ranks;
    private Player player;

    @Before
    public void before(){

        this.deck = new Deck();
        this.player = new Player();
    }


    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.checkAmount());
    }

    @Test
    public void deckCanBeFilled(){
        deck.makeDeckOfCards(suits, ranks);
        assertEquals(52, deck.checkAmount());
    }

    @Test
    public void deckCanBeShuffled(){
        deck.makeDeckOfCards(suits, ranks);
        System.out.println(this.deck.getDeck());
        deck.shuffleDeck();
        System.out.println(this.deck.getDeck());
//      assertEquals(this.deck, deck.shuffleDeck());
    }

    @Test
    public void deckCanBeDealtToHand(){
        deck.makeDeckOfCards(suits, ranks);
        deck.shuffleDeck();
        deck.dealCard(player);
        assertEquals(51, deck.checkAmount());
        assertEquals(1, player.checkHand());
    }
}
