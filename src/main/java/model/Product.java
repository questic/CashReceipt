package model;

public class Product implements Idable{
    private int id;
    private String name;
    private double price;
    private int quantity;
    private boolean isDiscounted;

    public Product(int id, String name, double price, int quantity, boolean isDiscounted) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isDiscounted = isDiscounted;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isDiscounted=" + isDiscounted +
                '}';
    }
}
