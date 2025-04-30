public class Address {
    private int addressNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;

    // Default constructor
    public Address() {}

    // Parameterized constructor
    public Address(int addressNumber, String streetName, String city, String state, String zipCode) {
        this.addressNumber = addressNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Copy constructor
    public Address(Address other) {
        this(other.addressNumber, other.streetName, other.city, other.state, other.zipCode);
    }

    // Getters and Setters
    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return String.format("%d %s\n%s, %s %s", addressNumber, streetName, city, state, zipCode);
    }
}
