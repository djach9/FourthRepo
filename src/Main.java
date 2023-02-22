import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country Poland = new Country("Poland", 'P');
        Country Germany = new Country("Germany", 'G');
        Country Scotland = new Country("Scotland", 'S');
        Country France = new Country("France", 'F');
        Country Netherlands = new Country("Netherlands", 'N');


        Dimension option1 = new Dimension(65, 145, 340);

        Dimension option2 = new Dimension(70, 175, 260);

        Dimension option3 = new Dimension(80, 175, 330);

        Dimension option4 = new Dimension(85, 100, 230);

        Dimension option5 = new Dimension(90, 120, 220);

        Dimension option6 = new Dimension(95, 160, 230);

        Dimension option7 = new Dimension(100, 120, 210);

        Dimension option8 = new Dimension(110, 120, 210);

        Dimension option9 = new Dimension(110, 140, 320);

        Dimension option10 = new Dimension(130, 180, 310);


        Producent p1 = new Producent("Toyota", "Corolla");
        Producent p2 = new Producent("BMW", "X3");
        Producent p3 = new Producent("BMW", "X5");
        Producent p4 = new Producent("Mercedes", "E500");
        Producent p5 = new Producent("Mercedes", "CLS");
        Producent p6 = new Producent("Peugeot", "307");
        Producent p7 = new Producent("Peugeot", "206");
        Producent p8 = new Producent("Renault", "Megane");
        Producent p9 = new Producent("Infinity", "Q50");
        Producent p10 = new Producent("Infinity", "FX");

        List<Country> premiumcountries = new ArrayList<>();
        premiumcountries.add(Germany);
        premiumcountries.add(Scotland);
        premiumcountries.add(France);


        List<Country> transportcountries = new ArrayList<>();
        transportcountries.add(Poland);
        transportcountries.add(Scotland);
        transportcountries.add(Netherlands);

        List<Country> taxicountries = new ArrayList<>();
        taxicountries.add(Netherlands);
        taxicountries.add(Scotland);
        taxicountries.add(Germany);
        taxicountries.add(Poland);

        List<Country> cargocountries = new ArrayList<>();
        cargocountries.add(Scotland);
        cargocountries.add(Germany);
        cargocountries.add(Netherlands);

        List<Country> buscountries = new ArrayList<>();
        buscountries.add(Netherlands);
        buscountries.add(Scotland);
        buscountries.add(Poland);
        buscountries.add(France);


        Market business = new Market("business", premiumcountries);
        Market transport = new Market("market", transportcountries);
        Market taxi = new Market("taxi", taxicountries);
        Market cargo = new Market("market", cargocountries);
        Market bus = new Market("market", buscountries);


       List<Car> cars = new ArrayList<>();

        Car car1 = new Car(p1, true, taxi, "premium", option1);
        cars.add(car1);
        Car car2 = new Car(p1, false, cargo, "premium", option2);
        cars.add(car2);
        Car car3 = new Car(p2, true, bus, "standard", option3);
        cars.add(car3);
        Car car4 = new Car(p3, true, transport, "medium", option6);
        cars.add(car4);
        Car car5 = new Car(p5, false, business, "medium", option7);
        cars.add(car5);
        Car car6 = new Car(p4, true, business, "standard", option5);
        cars.add(car6);
        Car car7 = new Car(p6, false, taxi, "medium", option5);
        cars.add(car7);
        Car car8 = new Car(p7, false, cargo, "standard", option4);
        cars.add(car8);
        Car car9 = new Car(p8, true, bus, "medium", option8);
        cars.add(car9);
        Car car10 = new Car(p10, true, business, "medium", option9);
        cars.add(car10);
        Car car11 = new Car(p10, true, business, "medium", option10);
        cars.add(car11);
        Car car12 = new Car(p2, true, taxi, "standard", option10);
        cars.add(car12);
        Car car13 = new Car(p3, true, cargo, "premium", option10);
        cars.add(car13);
        Car car14 = new Car(p9, false, taxi, "premium", option2);
        cars.add(car14);
        Car car15 = new Car(p7, true, bus, "medium", option8);
        cars.add(car15);


        Car.generateData(cars);

    }

    }
