import java.util.List;

public class Market  {
    String name;
    List<Country> countries ;

    @Override
    public String toString() {
        return String.valueOf(countries);
    }

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }
}
