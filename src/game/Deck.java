package game;

import card.Card;
import card.Rank;
import card.Tile;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    private final Stack<Card> content;

    public Deck() {
        this.content = new Stack<>();
    }

    public final void fill() {
        for (Rank rank : Rank.values()) {
            for (Tile tile : Tile.values()) {
                content.add(new Card(rank, tile));
            }
        }
    }

    // TODO : Improve random shuffling
    public final void shuffle() {
        Collections.shuffle(this.content);
    }

    public Card draw() {
        return this.content.pop();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card c: this.content) {
            sb.append(c.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
