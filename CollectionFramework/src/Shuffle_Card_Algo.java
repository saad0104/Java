import java.util.*;

class Card {
    private String face;
    private String suit;

    public Card(String initilaface, String Initialsuit) {
        face = initilaface;
        suit = Initialsuit;
    }

    public String getFace() {

        return face;
    }

    public String getSuit() {

        return suit;
    }

    public String toString() {
        StringBuffer buf = new StringBuffer(face + " of" + suit);
        buf.setLength(20);
        return buf.toString();
    }
}

class cards {
    public static final String suits[] = { "Heart", "Clubs", "Diamonds", "Spades" };

    private static final String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Jack", "Queen", "King" };
    private List list;

    public cards() {
        Card deck[] = new Card[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);

            list = Arrays.asList(deck);
            Collections.shuffle(list);

        }
    }

    public void printCards() {
        int half = list.size() / 2 - 1;

        for (int i = 0, j = (half + 1); i <= half; i++, j++) {
            System.out.println(list.get(i).toString() + list.get(j));
        }

    }

}

public class Shuffle_Card_Algo {
    public static void main(String[] args) {

        new cards().printCards();
    }
}
