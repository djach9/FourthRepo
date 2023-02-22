import java.util.List;

public class Car {

    Producent producent;
    boolean isAutomaticGear;

    Market market;

    String segment;

    Dimension dimensions;

    public Producent getProducent() {
        return producent;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return "" + market ;
    }

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, Dimension dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public static void generateData(List<Car> cars) {

        String FirstCondition="BMW";
        int SecondCondiotion=300;
        for (Car c : cars) {
            if (c.getProducent().model.contains(FirstCondition) && (c.isAutomaticGear) && (c.getDimensions().trankCapacity >(SecondCondiotion)))
            {
                System.out.println(c);
            }
        }
    }
}
