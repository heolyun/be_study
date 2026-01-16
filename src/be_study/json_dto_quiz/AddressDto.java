package be_study.json_dto_quiz;

public class AddressDto {
    private String street;
    private String city;
    private String zipcode;

    public AddressDto() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "AddressDto{street='" + street + '\'' + ", city='" + city + '\'' + ", zipcode='" + zipcode + '\'' + '}';
    }
}
