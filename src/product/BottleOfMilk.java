package product;

public class BottleOfMilk extends Product {

    private double volume;

    private double fat;

    public double getVolume() {
        return volume;
    }

    public BottleOfMilk(int id, String name, String brand, double price, double volume, double fat) {
        super(id, name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с молоком] %s - %s - %.2f; Объем: %.2f; Жирность: %.2f",
                name, brand, price, volume, fat);
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Объём: ").append(volume).append(" Жирность: ").append(fat);
        return super.printInfo() + sb;
    }
}

