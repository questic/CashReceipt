package org.questic;

import model.Card;
import model.Product;
import repository.CardRepository;
import repository.ProductRepository;
import repository.utils.FindById;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "qwe", 1.2, 5, true);
        Product product2 = new Product(2, "asd", 2.6, 2, false);

        ProductRepository repository = new ProductRepository();
        repository.add(product1);
        repository.add(product2);

        List<Product> productList = repository.getAll();

        for(Product product : productList) {
            System.out.println(product.toString());
        }

        Card card1 = new Card(1, 123, 5.4);
        Card card2 = new Card(2, 345, 4.3);

        CardRepository cardRepository = new CardRepository();
        cardRepository.add(card1);
        cardRepository.add(card2);

        List<Card> cardList = cardRepository.getAll();

        for(Card card : cardList) {
            System.out.println(card.toString());
        }

        List<Product> productList1 = repository.findBySpecification(new FindById(1));
        for(Product product : productList1) {
            System.out.println(product.toString());
        }

        List<Card> cardList1 = cardRepository.findBySpecification(new FindById(1));
        for(Card card : cardList1) {
            System.out.println(card.toString());
        }
    }
}