package core;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.iu.IU;
import core.DeckOfCards;
import core.Player;

public class Game {
    private static final int MIN_PLAYERS = 1;
    private static final int MAX_PLAYERS = 7;
    private static final int INITIAL_HAND_SIZE = 2;

    private final IU iu;

    private DeckOfCards deck;
    private Player player;

    public Game(IU iu){
        this.iu = iu;
        this.deck = new DeckOfCards();
        this.player = new Player();
    }

    public void play(){

        deck.shuffle();
    }


    private void createPlayers(){
        int numberOfPlayers = 2;

        for(int i = 0; i < numberOfPlayers; i++){
            
        }
    }
}