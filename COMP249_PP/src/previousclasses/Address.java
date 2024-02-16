package previousclasses;

public class Address {

    // Street number (int)
    private int streetNumber;
    // Street name (String)
    private String streetName;
    // Zip code (String)
    private String zipCode;
    // City (String)
    private String cityName;

    // Constructors
    public Address(int streetNumber, String streetName, String zipCode, String cityName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.cityName = cityName;
    }

    public Address() {
        this(0, "Unknown street name", "Unknown zip code", "Unknown city name");
    }

    public Address(Address address) {
        this(address.streetNumber, address.streetName, address.zipCode, address.cityName);
    }

    // Setters
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // Getters
    public int getStreetNumber() {
        return this.streetNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCityName() {
        return this.cityName;
    }
    // toString

    // equals
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Address otherAddress = (Address) otherObject;

        if (streetNumber == otherAddress.streetNumber && zipCode.equals(otherAddress.zipCode)) {
            return true;
        } else {
            return false;
        }
    }
}
