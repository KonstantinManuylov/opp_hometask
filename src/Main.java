import product.BottleOfMilk;
import product.BottleOfWater;
import product.Chocolate;
import product.Product;
import vending_machine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, null, "ООО Источник", -200);

        Product product3 = new Product(3, "Бутылка с молоком", 250);

        Product bottleOfWater1 =
                new BottleOfWater(2, "Вода #1", "ООО Источник", 250, 0.5);

        Product bottleOfMilk1 =
                new BottleOfMilk(3,"Молоко #1", "ООО Источник", 250, 0.5, 25);

        Product bottleOfMilk2 =
                new BottleOfMilk(4, "Молоко #2", "ООО Источник", 280, 1.5, 1);

        Product bottleOfMilk3 =
                new BottleOfMilk(5,"Молоко #3", "ООО Источник", 150, 1.5, 5);

        Product bottleOfMilk4 =
                new BottleOfMilk(6, "Молоко #4", "ООО Источник", 290, 2, 25);

        Product Chocolate1 = new Chocolate(7, "Бабаевский", "БКФ", 300, 83);
        Product Chocolate2 =
                new Chocolate(8, "Alpen Gold", "Nestle", 190, 55, "Черника");
        Product Chocolate3 =
                new Chocolate(9, "Отломи", "Акконд", 100, 48, "Орех");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(Chocolate1);
        products.add(Chocolate2);
        products.add(Chocolate3);

        System.out.println(getAllProductsInfo(products));

        VendingMachine machine = new VendingMachine(products);

        Chocolate chocolateResult = (Chocolate) machine.getProductByName("Alpen Gold");
        if (chocolateResult != null) {
            System.out.println("Вы купили:\n");
            System.out.println(chocolateResult.printInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

//
//        BottleOfMilk bottleOfMilkResult = machine.getBottleOfMilk(3.5);
//        if (bottleOfMilkResult != null){
//            System.out.println("Вы купили:");
//            System.out.println(bottleOfMilkResult.displayInfo());
//        }
//        else {
//            System.out.println("Такого товара нет в автомате.");
//        }
    }

    public static String getAllProductsInfo(List<Product> listOfProducts) {
        System.out.println("Чего желаете купить?\nВ наличии:");

        StringBuilder sb = new StringBuilder();
        for (Product item : listOfProducts) {
            sb.append(item.getName()).append(" ")
                    .append(item.getBrand()).append(" ")
                    .append(item.getPrice()).append(".\n");
        }
        return sb.toString();
    }
}
