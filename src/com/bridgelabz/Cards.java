package com.bridgelabz;

public class Cards {
    private String face;
    private String suit;
    public Cards(String cardFace,String cardSuite){
        face = cardFace;
        suit = cardSuite;
    }
    public String toString(){
        return face+ " of "+ suit;
    }
}
