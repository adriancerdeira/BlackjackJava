package core;

import java.util.ArrayList;

public class Croupier {
    private final ArrayList<Card> hand;

    public Croupier(){
        this.hand = new ArrayList<>();
    }

    public void addCardToCroupierHand(DeckOfCards deck){
        hand.addLast(deck.drawCard());
    }
}