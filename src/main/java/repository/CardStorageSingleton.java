package repository;

import model.Card;

import java.util.ArrayList;
import java.util.List;

public class CardStorageSingleton implements Storage<Card>{
    private List<Card> cardList;
    private static CardStorageSingleton instance = new CardStorageSingleton();
    private CardStorageSingleton() {
        cardList = new ArrayList<>();
    }

    public static CardStorageSingleton getInstance() {
        return instance;
    }

    public CardStorageSingleton(List<Card> cardList) {
        this.cardList = cardList;
    }
    @Override
    public List<Card> getStorageList() {
        return cardList;
    }
}
