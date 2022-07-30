package com.bridgelabz;

public class MainDeck {
    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        for(int i=0;i<52;i++){
            System.out.println(deckOfCards.dealCard()+"            ");
            if(i % 5 == 0){
                System.out.println();
            }

        }
    }
}
