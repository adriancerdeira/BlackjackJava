package core;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.iu.IU;
import core.DeckOfCards;
import core.Player;
import core.Croupier;

public class Game {
    private static final int MIN_PLAYERS = 1;
    private static final int MAX_PLAYERS = 7;
    private static final int INITIAL_HAND_SIZE = 2;

    private final IU iu;

    private DeckOfCards deck;
    private ArrayList<Player> players;
    private Croupier croupier;

    public Game(IU iu){
        this.iu = iu;
        this.deck = new DeckOfCards();
        this.players = new ArrayList<>();
        this.croupier = new Croupier();
    }

    public void play(){
        createPlayers();
        deck.shuffle();
        dealInitialCards();

    }

    private void playUntilGameFinish(){
        for(Player player : players){
            
        }

        

        // luego toca el del crouppier tiene q hasta las 17 ptos meter cartas en su mano

        
        
    }


    private void createPlayers(){
        int numberOfPlayers = iu.readNumberOfPlayers(MIN_PLAYERS, MAX_PLAYERS);

        for(int i = 1; i <= numberOfPlayers; i++){
            players.addLast(new Player(iu.readPlayerName()));
        }
    }

    private void dealInitialCards(){
        for(int i = 0; i < INITIAL_HAND_SIZE; i++){
            for(Player player : players){
                player.addCardToHand(deck);
            }
            croupier.addCardToCroupierHand(deck);
        }
    }

    private boolean playOption(Player player){
        switch(iu.readOptionToPlay()){
            case 1: 
                player.caseDouble(deck);
                return false;

            case 2:
                player.caseHit(deck);

                if(player.getTotalValueOfHand() > 21){
                    iu.displayLimitValuePassed();
                    return false;
                }

                return true;

            case 3: 
                return false;

            default:
                return true;
        }
    }
}