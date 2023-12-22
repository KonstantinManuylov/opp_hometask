package product;

public class BottleOfWater extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(int id, String name, String brand, double price, double volume) {
        super(id, name, brand, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f; Объем: %.2f",
                name, brand, price, volume);
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(volume);
        return super.printInfo() + sb;
    }
}