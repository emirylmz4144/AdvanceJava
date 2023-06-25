package Address;

public class HomeAddress implements Address{

    public String city;
    public String town;
    public String neighborhood;
    public String street;
    public String buildName;
    public int doorNumber;

    public HomeAddress(String city, String town, String neighborhood, String street, String buildName, int doorNumber) {
        this.city = city;
        this.town = town;
        this.neighborhood = neighborhood;
        this.street = street;
        this.buildName = buildName;
        this.doorNumber = doorNumber;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String city) {
        this.city=city;
    }

    @Override
    public String getTown() {
        return this.town;
    }

    @Override
    public void setTown(String town) {
        this.town=town;
    }

    @Override
    public String getNeighborhood() {
        return this.neighborhood;
    }

    @Override
    public void setNeighborhood(String neighborhood) {
        this.neighborhood=neighborhood;
    }

    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public void setStreet(String street) {
        this.street=street;
    }

    @Override
    public String getCompanyOrBuildName() {
        return this.buildName;
    }

    @Override
    public void setCompanyOrBuildName(String buildNameName) {
        this.buildName=buildNameName;
    }

    @Override
    public int getCompanyOrDoorNumber() {
        return this.doorNumber;
    }

    @Override
    public void setCompanyOrDoorNumber(int doorNumber) {
        this.doorNumber=doorNumber;
    }

    @Override
    public String toString() {return this.city.toUpperCase()+"/"+this.town.toUpperCase()+"/"+this.neighborhood.toUpperCase()+"/"+this.street.toUpperCase()+"/"+this.buildName.toUpperCase()+"/"+this.doorNumber;}

}
