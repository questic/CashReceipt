package model;

public class Card implements Idable {
    private int id;
    private int number;
    private double discount;

    public Card(int id, int number, double discount) {
        this.id = id;
        this.number = number;
        this.discount = discount;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number=" + number +
                ", discount=" + discount +
                '}';
    }
}
