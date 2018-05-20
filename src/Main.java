import card.Card;
import card.Rank;
import card.Tile;
import game.Deck;
import game.Trash;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        testDeck();
        testTrash();
    }

    private static void testTrash() {
        Trash trash = new Trash();
        Card j_s = new Card(Rank.JACK, Tile.SPADE);
        Card q_c = new Card(Rank.QUEEN, Tile.CLUB);
        Card a_h = new Card(Rank.ACE, Tile.HEART);
        trash.discard(new ArrayList<>(Arrays.asList(j_s)));
        trash.discard(new ArrayList<>(Arrays.asList(q_c, a_h)));
        System.out.println(trash.getLastDiscarded());
        System.out.println("--------");
        System.out.println(trash.peek(j_s));
        System.out.println("--------");
        System.out.println(trash.peek(a_h));
        System.out.println("--------");
        System.out.println(trash.getLastDiscarded());
    }

    private static void testDeck() {
        Deck deck = new Deck();
        deck.fill();
        System.out.println(deck);
        System.out.println("------------------------------------------");
        deck.shuffle();
        System.out.println(deck);
    }
}
