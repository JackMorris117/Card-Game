import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private SuitType suits;
    private RankType ranks;
    private Player dealer;
    private Player player;


    @Before
    public void before(){

        this.deck = new Deck();
        this.dealer = new Player("John");
        this.player = new Player("Michael");

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
        deck.dealCard(dealer);
        assertEquals(51, deck.checkAmount());
        assertEquals(1, dealer.checkHand());
    }

    @Test
    public void deckCanBeDealtToTwoHands(){
        deck.makeDeckOfCards(suits, ranks);
        deck.shuffleDeck();
        deck.dealCard(dealer);
        assertEquals(51, deck.checkAmount());
        assertEquals(1, dealer.checkHand());
        deck.dealCard(player);
        assertEquals(50, deck.checkAmount());
        assertEquals(1, player.checkHand());

    }
    @Test
    public void canCompareHands(){
        deck.makeDeckOfCards(suits, ranks);
        deck.dealCard(dealer);
        deck.dealCard(dealer);

        deck.dealCard(player);
        deck.dealCard(player);

        assertEquals(player, deck.compareCard(dealer, player));
    }
}
