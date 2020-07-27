import java.util.ArrayList;
import java.util.Collections;


public class Deck {

    private ArrayList<PlayingCard> deckOfCards;
    private ArrayList<PlayingCard> hand;

    public Deck() {
        this.deckOfCards = new ArrayList<PlayingCard>();
        this.hand = new ArrayList<PlayingCard>();
    }

    public void makeDeckOfCards(SuitType suit, RankType rank) {
        for (SuitType suitName : suit.values()) {
            for (RankType rankNumber : rank.values()) {
                PlayingCard card = new PlayingCard(suitName, rankNumber);
                this.deckOfCards.add(card);
            }
        }
    }

    public int checkAmount(){
        return this.deckOfCards.size();
    }

    public int checkHand(){
        return this.hand.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deckOfCards);
    }

    public ArrayList<PlayingCard> getDeck(){
        return this.deckOfCards;
    }

    public void dealCard(Player player){
        PlayingCard card;
        card = this.deckOfCards.remove(0);
        player.takeCard(card);
    }

    public Player compareCard(Player player1, Player player2) {
        int player1RankCount;
        int player2RankCount;

        player1RankCount = player1.countRank();
        player2RankCount = player2.countRank();

        if (player1RankCount > player2RankCount) {
            return player1;
        }
        else if (player1RankCount ==  player2RankCount) {

        }
        else {
            return player2;
        }
        return null;
    }





}




















