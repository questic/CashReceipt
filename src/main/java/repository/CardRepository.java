package repository;

import model.Card;
import repository.utils.Specification;

import java.util.ArrayList;
import java.util.List;

public class CardRepository implements Repository<Card> {
    private List<Card> cardStorage;

    public CardRepository() {
        cardStorage = CardStorageSingleton.getInstance().getStorageList();
    }
    @Override
    public List<Card> getAll() {
        return cardStorage;
    }

    @Override
    public List<Card> findBySpecification(Specification specification) {
        List<Card> cardList = new ArrayList<>();

        for (Card card : cardStorage) {
            if(specification.isExist(card)) {
                cardList.add(card);
            }
        }
        return cardList;
    }

    @Override
    public void add(Card card) {
        cardStorage.add(card);
    }
}
