package core;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/*
    A deck of cards to use in the game, at first, we complete the initial queue with all the cards from the 
    Card enum and then in each call of the shuffle method we shuffle the cards 
    */

public class DeckOfCards {
    private final ArrayDeque<Card> deck;
    private boolean initialDeckCreated;

    public DeckOfCards(){
        this.deck = new ArrayDeque<>();
        this.initialDeckCreated = false;
    }

    public void shuffle(){
        ArrayList<Card> avaliableCards = new ArrayList<>();

        while(!deck.isEmpty()){
            avaliableCards.add(deck.remove());
        }

        if(!initialDeckCreated){
            for(Card card : Card.values()){
                avaliableCards.add(card);
            }

            initialDeckCreated = true;
        }

        Collections.shuffle(avaliableCards);

        for(Card card : avaliableCards){
            deck.add(card);
        }

        avaliableCards.clear();
    }

    public Card drawCard(){
        return deck.poll();
    }

    public void addToBottom(Card card){
        deck.add(card);
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }

    public int size(){
        return deck.size();
    }
}