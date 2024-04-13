public
class Address {

    private String city;
    private String postalCode;
    private String street;
    private String number;

    public Address(String city, String postalCode, String street, String number) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return postalCode + " " + city + " st." +  street + " " + number;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }
}