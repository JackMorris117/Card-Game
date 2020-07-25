import org.junit.Before;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Deck deck;

    @Before
    public void before(){
        this.player1 = new Player();
        this.player2 = new Player();
        this.deck = new Deck();
    }

}
