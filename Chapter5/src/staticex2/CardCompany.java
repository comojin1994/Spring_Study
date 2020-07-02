package staticex2;

public class CardCompany {
    private static CardCompany instance = new CardCompany();

    public static CardCompany getInstance(){
        if (instance == null){
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard(){
        return new Card();
    }
}
