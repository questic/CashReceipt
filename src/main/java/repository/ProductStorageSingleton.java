package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductStorageSingleton implements Storage<Product> {
    private List<Product> productList;
    private static ProductStorageSingleton instance = new ProductStorageSingleton();

    private ProductStorageSingleton() {
        productList = new ArrayList<>();
    }

    public static ProductStorageSingleton getInstance() {
        return  instance;
    }

    public ProductStorageSingleton(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getStorageList() {
        return productList;
    }
}
