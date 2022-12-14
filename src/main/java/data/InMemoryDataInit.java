package data;

import model.Card;
import model.Product;
import repository.CardRepository;
import repository.ProductRepository;
import repository.Repository;

import java.util.List;

public class InMemoryDataInit implements DataInit {
    private ProductRepository productRepository = new ProductRepository();
    private CardRepository cardRepository = new CardRepository();

    @Override
    public void init() {
        if (productRepository.getAll().isEmpty()) {
            productRepository.add(new Product(1, "Milk", 1.5, 4, false));
            productRepository.add(new Product(2, "Apple", 3.0, 6, false));
            productRepository.add(new Product(3, "Water", 2.4, 10, true));
        }

        if (cardRepository.getAll().isEmpty()) {
            cardRepository.add(new Card(1, 123, 10.0));
            cardRepository.add(new Card(2, 321, 5.0));
            cardRepository.add(new Card(3, 456, 50.0));
        }
    }
}
