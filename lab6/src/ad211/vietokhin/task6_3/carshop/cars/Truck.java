package ad211.vietokhin.task6_3.carshop.cars;

public class Truck extends Car {
    private int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight = weight;
    }
    public Truck() {
    }


    @Override
    public double getSalePrice() {
        return weight>2000 ? regularPrice*0.9 : regularPrice;
    }

    @Override
    public String outputCarInfo() {
        return String.format("Track, price: %.2f$, color: %s, speed: %d, weight: %d.", getSalePrice(), color, speed, weight);
    }
}