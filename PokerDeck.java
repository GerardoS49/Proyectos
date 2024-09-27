
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerDeck {
    private List<String> deck;

    public PokerDeck() {
        deck = new ArrayList<>();
        String[] redSuits = {"Corazones (Rojo)", "Diamantes (Rojo)"};
        String[] blackSuits = {"Tréboles (Negro)", "Picas (Negro)"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Llenar el deck con todas las combinaciones de valor y palo respetando los colores
        for (String suit : redSuits) {
            for (String value : values) {
                deck.add(value + " de " + suit);
            }
        }
        for (String suit : blackSuits) {
            for (String value : values) {
                deck.add(value + " de " + suit);
            }
        }
        // Barajar las cartas
        Collections.shuffle(deck);
    }

    // Método para repartir cinco cartas y removerlas del deck
    public List<String> dealHand() {
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }

    public void printHand(List<String> hand) {
        System.out.println("Las cartas repartidas son:");
        for (String card : hand) {
            System.out.println(card);
        }
    }

    public int getRemainingCards() {
        return deck.size();
    }
}
