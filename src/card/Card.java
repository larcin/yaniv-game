package card;

public class Card {
    private final Rank rank;

    private final Tile tile;

    public Card(Rank rank, Tile tile) {
        this.rank = rank;
        this.tile = tile;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Tile getTile() {
        return this.tile;
    }

    public Integer getValue() {
        return this.rank.getValue();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", getRank(), getTile());
    }
}
