package vending_machine;

import product.BottleOfMilk;
import product.Product;

import java.util.List;
import java.util.Objects;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk milk) {
                if (milk.getVolume() == volume)
                    return milk;
            }
        }
        return null;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                return product;
            }
        }
        return null;
    }
}