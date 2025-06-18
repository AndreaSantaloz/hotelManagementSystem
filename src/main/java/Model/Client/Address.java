package Model.Client;

import java.util.Objects;

public class Address {
    private final String name;
    private final String numberHouse;
    private final String postalCode;
    private final String province;
    private final String country;

    public Address(String name, String numberHouse, String postalCode, String province, String country) {
        this.name = name;
        this.numberHouse = numberHouse;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(name, address.name) && Objects.equals(numberHouse, address.numberHouse) && Objects.equals(postalCode, address.postalCode) && Objects.equals(province, address.province) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberHouse, postalCode, province, country);
    }
}
