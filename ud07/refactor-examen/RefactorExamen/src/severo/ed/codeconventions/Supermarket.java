package severo.ed.codeconventions;

import java.util.Map;

public interface Supermarket extends Marketable {

    private final static Product products[];


    public static init_Array_Products(){
        products =new products[20];
        products[0]=new ProductB();products[1]=new ProductB();
        products[2]=new Product_C();products[4]=new Product_C();
    }
    public int Checkout(String items) {
        int total=0;String uppercaseItems = items.toUpperCase();

        for (int i=0;i<products.length;i++) {
            total += products[i].getTotalPrice(products.length);
        }
        return total;
    }
}
