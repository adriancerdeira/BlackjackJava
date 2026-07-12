package core;

/*
    Enum where there are all the cards to use in the game, 
    one card has his suit, rank and value */

public enum Card {

    // SPADES
    ACE_SPADES(Suit.SPADES, Rank.ACE, 11),
    TWO_SPADES(Suit.SPADES, Rank.TWO, 2),
    THREE_SPADES(Suit.SPADES, Rank.THREE, 3),
    FOUR_SPADES(Suit.SPADES, Rank.FOUR, 4),
    FIVE_SPADES(Suit.SPADES, Rank.FIVE, 5),
    SIX_SPADES(Suit.SPADES, Rank.SIX, 6),
    SEVEN_SPADES(Suit.SPADES, Rank.SEVEN, 7),
    EIGHT_SPADES(Suit.SPADES, Rank.EIGHT, 8),
    NINE_SPADES(Suit.SPADES, Rank.NINE, 9),
    TEN_SPADES(Suit.SPADES, Rank.TEN, 10),
    JACK_SPADES(Suit.SPADES, Rank.JACK, 10),
    QUEEN_SPADES(Suit.SPADES, Rank.QUEEN, 10),
    KING_SPADES(Suit.SPADES, Rank.KING, 10),

    // HEARTS
    ACE_HEARTS(Suit.HEARTS, Rank.ACE, 11),
    TWO_HEARTS(Suit.HEARTS, Rank.TWO, 2),
    THREE_HEARTS(Suit.HEARTS, Rank.THREE, 3),
    FOUR_HEARTS(Suit.HEARTS, Rank.FOUR, 4),
    FIVE_HEARTS(Suit.HEARTS, Rank.FIVE, 5),
    SIX_HEARTS(Suit.HEARTS, Rank.SIX, 6),
    SEVEN_HEARTS(Suit.HEARTS, Rank.SEVEN, 7),
    EIGHT_HEARTS(Suit.HEARTS, Rank.EIGHT, 8),
    NINE_HEARTS(Suit.HEARTS, Rank.NINE, 9),
    TEN_HEARTS(Suit.HEARTS, Rank.TEN, 10),
    JACK_HEARTS(Suit.HEARTS, Rank.JACK, 10),
    QUEEN_HEARTS(Suit.HEARTS, Rank.QUEEN, 10),
    KING_HEARTS(Suit.HEARTS, Rank.KING, 10),

    // DIAMONDS
    ACE_DIAMONDS(Suit.DIAMONDS, Rank.ACE, 11),
    TWO_DIAMONDS(Suit.DIAMONDS, Rank.TWO, 2),
    THREE_DIAMONDS(Suit.DIAMONDS, Rank.THREE, 3),
    FOUR_DIAMONDS(Suit.DIAMONDS, Rank.FOUR, 4),
    FIVE_DIAMONDS(Suit.DIAMONDS, Rank.FIVE, 5),
    SIX_DIAMONDS(Suit.DIAMONDS, Rank.SIX, 6),
    SEVEN_DIAMONDS(Suit.DIAMONDS, Rank.SEVEN, 7),
    EIGHT_DIAMONDS(Suit.DIAMONDS, Rank.EIGHT, 8),
    NINE_DIAMONDS(Suit.DIAMONDS, Rank.NINE, 9),
    TEN_DIAMONDS(Suit.DIAMONDS, Rank.TEN, 10),
    JACK_DIAMONDS(Suit.DIAMONDS, Rank.JACK, 10),
    QUEEN_DIAMONDS(Suit.DIAMONDS, Rank.QUEEN, 10),
    KING_DIAMONDS(Suit.DIAMONDS, Rank.KING, 10),

    // CLUBS
    ACE_CLUBS(Suit.CLUBS, Rank.ACE, 11),
    TWO_CLUBS(Suit.CLUBS, Rank.TWO, 2),
    THREE_CLUBS(Suit.CLUBS, Rank.THREE, 3),
    FOUR_CLUBS(Suit.CLUBS, Rank.FOUR, 4),
    FIVE_CLUBS(Suit.CLUBS, Rank.FIVE, 5),
    SIX_CLUBS(Suit.CLUBS, Rank.SIX, 6),
    SEVEN_CLUBS(Suit.CLUBS, Rank.SEVEN, 7),
    EIGHT_CLUBS(Suit.CLUBS, Rank.EIGHT, 8),
    NINE_CLUBS(Suit.CLUBS, Rank.NINE, 9),
    TEN_CLUBS(Suit.CLUBS, Rank.TEN, 10),
    JACK_CLUBS(Suit.CLUBS, Rank.JACK, 10),
    QUEEN_CLUBS(Suit.CLUBS, Rank.QUEEN, 10),
    KING_CLUBS(Suit.CLUBS, Rank.KING, 10);
    ;

    Suit suit;
    Rank rank;
    int value;

    Card(Suit siut, Rank rank, int value){
        this.suit = siut;
        this.rank = rank;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "[" + this.suit + " / " + this.rank + " / " + this.value + "]";
    }
}