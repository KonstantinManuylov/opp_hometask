package product;

public class Chocolate extends Product {
    private int cocoaChocolate;
    private String additions;

    public Chocolate(int id, String name, String brand, double price, int cocoaChocolate) {
        super(id, name, brand, price);
        this.cocoaChocolate = cocoaChocolate;
    }
    public Chocolate(int id, String name, String brand, double price, int cocoaChocolate, String additions) {
        super(id, name, brand, price);
        this.cocoaChocolate = cocoaChocolate;
        this.additions = additions;
    }

    public int getCocoaChocolate() {
        return cocoaChocolate;
    }

    public void setCocoaChocolate(int cocoaChocolate) {
        this.cocoaChocolate = cocoaChocolate;
    }

    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    @Override
    public String printInfo() {
        if (additions != null) {
            return super.printInfo() + " Содержание какао: " + cocoaChocolate + " Добавки: " + additions;
        } else {
            return super.printInfo() + " Содержание какао: " + cocoaChocolate;
        }
    }
}
