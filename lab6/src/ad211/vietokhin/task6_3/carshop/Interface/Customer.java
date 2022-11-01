package ad211.vietokhin.task6_3.carshop.Interface;

public interface Customer {
    double[] getCarsPrices();
    String[] getCarsColors();
    double getCarPrice(int id);
    String getCarColor(int id);
    boolean purchaseCar(int id);
}
