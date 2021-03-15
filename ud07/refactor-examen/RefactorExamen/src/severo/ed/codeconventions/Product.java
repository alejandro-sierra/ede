package severo.ed.codeconventions;


import java.util.*;

public class Product {
    public int price=0;
    private List<Discount> Discounts = new ArrayList<>();

    public Product(int x) {
        this.price=x;
    }

    public Product(int price, List<Discount> discounts) {
        this.setPrice(price);this.Discounts = discounts;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public void adddiscount(Discount discount) {
        this.Discounts.add(discount);
    }

    public int getTotalPrice(int numberOfProducts) {
        int total = numberOfProducts * this.getPrice();
        for (Discount discount : this.Discounts)
            total -= discount.apply(numberOfProducts, this.getPrice());
        return total;
    }
}
