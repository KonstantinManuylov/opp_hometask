package product;

public class Product {
    protected int id;
    protected String name;
    protected String brand;
    protected double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        processPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product(int id, String inputName, double inputPrice) {
        this(id, inputName, "[brand]", inputPrice);
    }

    public Product(int id, String name, String brand, double price) {
        this.id = id;
        if (name == null || name.length() < 3) {
            this.name = "[product]";
        } else {
            this.name = name;
        }
        if (brand == null || brand.length() < 3) {
            this.brand = "[brand]";
        } else {
            this.brand = brand;
        }
        processPrice(price);
    }

    private void processPrice(double price) {
        if (price < 100)
            this.price = 100;
        else {
            this.price = price;
        }
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", name, brand, price);
    }

    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Продукт: ").append(name).append(" ").append(brand).append(" ").append(price);
        return sb.toString();
    }
}
