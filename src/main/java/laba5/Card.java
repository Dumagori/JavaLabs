package laba5;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }

    public String toString(){
        return this.suit + " - " + this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return this.value;
    }
}
