import java.util.ArrayList;

public class Player {

    private ArrayList<PlayingCard> hand;

    public Player(){
        this.hand = new ArrayList<PlayingCard>();
    }

    public void takeCard(PlayingCard card) {
        this.hand.add(card);
    }

    public int countRank() {
        int total = 0;
        for (PlayingCard card : this.hand) {
            total += card.getRank().getRankType();
        }
        return total;
    }

    public int checkHand(){
        return this.hand.size();
    }

}
