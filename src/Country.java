public class Country {

    String countryName;
    char countrySign ;

    @Override
    public String toString() {
        return "countryName=" + countryName  + " " +
                "countrySign=" + countrySign ;
    }


    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

}
