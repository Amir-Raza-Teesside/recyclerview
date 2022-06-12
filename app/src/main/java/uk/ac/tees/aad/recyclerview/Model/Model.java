package uk.ac.tees.aad.recyclerview.Model;

public class Model {

    private  String CountryName;
    private  String CountrDescription;
    private  int CountrFlag;

    public Model(String countryName, String countrDescription, int countrFlag) {
        CountryName = countryName;
        CountrDescription = countrDescription;
        CountrFlag = countrFlag;
    }

    public String getCountrDescription() {
        return CountrDescription;
    }

    public void setCountrDescription(String countrDescription) {
        CountrDescription = countrDescription;
    }

    public int getCountrFlag() {
        return CountrFlag;
    }

    public void setCountrFlag(int countrFlag) {
        CountrFlag = countrFlag;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }
}
