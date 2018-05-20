package game;

import card.Card;

import java.util.ArrayList;
import java.util.Stack;

public class Trash {
    private final Stack<ArrayList<Card>> content;

    public Trash() {
        this.content = new Stack<>();
    }

    public void discard(ArrayList<Card> cards) {
        this.content.push(cards);
    }

    public ArrayList<Card> getLastDiscarded() {
        return this.content.peek();
    }

    public Card peek(Card card) {
        if (this.content.peek().remove(card)) {
            return card;
        }
        return null;
    }
}
