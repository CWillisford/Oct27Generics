package GenericWildcard02.ShoppingCart;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Purchase extends Product{
    public Purchase(String name, double price){
        super(name, price);
    }
}

class Shopping {
    public static <T> void affordable(List<? extends T> source, List<? super T> destination, double minPrice, double maxPrice){
        for(T item : source) {
            if(item instanceof Product){
                Product product = (Product) item;
                if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice){
                    destination.add(item);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Purchase> fullList = new ArrayList<>();

        fullList.add(new Purchase("Cereal", 5.99));
        fullList.add(new Purchase("PS5", 599));
        fullList.add(new Purchase("Socks", 5.96));
        fullList.add(new Purchase("Shirt", 5.99));
        fullList.add(new Purchase("Soap", 6.91));
        fullList.add(new Purchase("iPad", 100));

        List<Product> affordableList = new ArrayList<>();

        Shopping.affordable(fullList,affordableList,6,1000);

        for(Product x : affordableList){
            System.out.println(x);
        }
    }
}
