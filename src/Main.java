import card.Card;
import card.Rank;
import card.Tile;

public class Main {

    public static void main(String[] args) {
        Card c = new Card(Rank.ACE, Tile.DIAMOND);
        System.out.println(c);
    }
}
