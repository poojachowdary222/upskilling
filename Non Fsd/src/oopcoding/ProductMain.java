package oopcoding;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 10.0, 2));
        products.add(new Product("Product 2", 5.0, 3));
        products.add(new Product("Product 3", 7.5, 1));
        products.add(new Product("Product 4", 3.25, 4));
        products.add(new Product("Product 5", 2.5, 6));

        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getTotalCost();
        }

        System.out.println("Total cost of all products: $" + totalCost);
    }
}
