
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PokerDeck pokerDeck = new PokerDeck();

        // Repartir 5 cartas y mostrarlas
        List<String> hand = pokerDeck.dealHand();
        pokerDeck.printHand(hand);

        // Mostrar cuántas cartas quedan en el deck
        System.out.println("Cartas restantes en el mazo: " + pokerDeck.getRemainingCards());
    }
}
