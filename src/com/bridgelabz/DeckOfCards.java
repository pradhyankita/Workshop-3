package com.bridgelabz;
import java.util.*;
public class DeckOfCards {
    private Cards[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS=52;
    private static final Random randomNumbers =new Random();

    public DeckOfCards() {
        String rank[] ={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String suits[] ={"Hearts","Diamonds","Clubs","Spades"};
        deck =new Cards[NUMBER_OF_CARDS];
            for(int count =0; count < deck.length; count++){
                deck[count]=new Cards(rank[count % 13], suits[count/13]);
            }
    }

    public Cards dealCard(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }
        else
            return null;
    }
}
