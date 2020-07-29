package staticex2;

public class Card {
    public int cardNumber;
    private static int serialNumber = 1000;

    public Card() {
        this.cardNumber = serialNumber;
        serialNumber++;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
