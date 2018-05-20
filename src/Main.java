import card.Card;
import card.Deck;
import card.Rank;
import card.Tile;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.fill();
        System.out.println(deck);
        System.out.println("------------------------------------------");
        deck.shuffle();
        System.out.println(deck);
    }
}
