package Address;

public class BusinessAddress implements Address
{
    public String city;
    public String town;
    public String neighborhood;
    public String street;
    public String companyName;
    public int companyNumber;

    public BusinessAddress(String city, String town, String neighborhood, String street, String companyOrBuildName, int companyOrDoorNumber) {
        this.city = city;
        this.town = town;
        this.neighborhood = neighborhood;
        this.street = street;
        this.companyName = companyOrBuildName;
        this.companyNumber = companyOrDoorNumber;
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
        return this.companyName;
    }

    @Override
    public void setCompanyOrBuildName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public int getCompanyOrDoorNumber() {
        return this.companyNumber;
    }

    @Override
    public void setCompanyOrDoorNumber(int companyNumber) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {return this.city.toUpperCase()+"/"+this.town.toUpperCase()+"/"+this.neighborhood.toUpperCase()+"/"+this.street.toUpperCase()+"/"+this.companyName.toUpperCase()+"/"+this.companyNumber;}
}
