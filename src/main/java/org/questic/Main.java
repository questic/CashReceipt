package org.questic;

import data.InMemoryDataInit;
import model.Card;
import model.Product;
import repository.CardRepository;
import repository.ProductRepository;
import repository.utils.FindById;
import data.DataInit;
import data.DataInitFactory;
import data.utils.InitType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataInitFactory initFactory = new DataInitFactory();
        DataInit iniData = initFactory.getData(InitType.IN_MEMORY);
        iniData.init();

        ProductRepository productRepository = new ProductRepository();

        List<Product> productList = productRepository.getAll();
        for (Product product : productList) {
            System.out.println(product.toString());
        }

        CardRepository cardRepository = new CardRepository();

        List<Card> cardList = cardRepository.getAll();
        for (Card card : cardList) {
            System.out.println(card.toString());
        }

        System.out.println(productRepository.findBySpecification(new FindById(1)));
        System.out.println(cardRepository.findBySpecification(new FindById(2)));
    }
}