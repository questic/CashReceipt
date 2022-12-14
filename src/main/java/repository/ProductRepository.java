package repository;

import model.Product;
import repository.utils.Specification;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {
    private List<Product> productStorage;

    public ProductRepository() {
        productStorage = ProductStorageSingleton.getInstance().getStorageList();
    }

    @Override
    public List<Product> getAll() {
        return productStorage;
    }

    @Override
    public List<Product> findBySpecification(Specification specification) {
        List<Product> productList = new ArrayList<>();

        for (Product product : productStorage) {
            if (specification.isExist(product)) {
                productList.add(product);
            }
        }
        return  productList;
    }

    @Override
    public void add(Product product) {
        productStorage.add(product);
    }
}
