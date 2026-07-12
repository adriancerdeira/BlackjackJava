package com.iu;

import core.Card;

public class Main {
    public static void main(String[] args) {
        for(Card card : Card.values()){
            System.out.println(card);
        }
    }
}