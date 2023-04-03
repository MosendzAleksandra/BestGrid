package course.project.bestgrid.model;

public class Address {
    private int addressID;
    private String country;
    private String city;
    private String street;
    private int house;
    
    public Address() {
    }
    public int getAddressID() {
        return addressID;
    }
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getHouse() {
        return house;
    }
    public void setHouse(int house) {
        this.house = house;
    }
}
