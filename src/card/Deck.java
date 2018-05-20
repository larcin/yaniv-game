package card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> content;

    public Deck() {
        this.content = new ArrayList<>();
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
