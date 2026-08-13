package core;

import java.util.ArrayList;

import com.iu.IU;

public class Player {
    private final String name;
    private final ArrayList<Card> hand;
    private IU iu;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCardToHand(DeckOfCards deck){
        hand.addLast(deck.drawCard());
    }

    /*
    A method to count the hand value in each round with a cunter
    which counts all the cards values in the hand every time it's called
    */

    public int getTotalValueOfHand(){
        int total = 0;

        for(Card card : hand){
            total += card.getValue();
        }

        return total;
    }

     /*
    If player selects the option of hitting, the game will add a card to the player hand,
    if the new total value is over 21, the player loses and the game finishes,
    if the total value is under 21 or 21 he can continue playing
     */

    public void caseHit(DeckOfCards deck){
        if(getTotalValueOfHand() < 21){
            hand.addLast(deck.drawCard());
        }
    }

    public void caseDouble(DeckOfCards deck){
        if(getTotalValueOfHand() < 21){
            hand.addLast(deck.drawCard());
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return "";
    }
}    