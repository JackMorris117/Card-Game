import org.junit.Before;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Deck deck;

    @Before
    public void before(){
        this.player1 = new Player("John");
        this.player2 = new Player("Michael");
        this.deck = new Deck();
    }

}
