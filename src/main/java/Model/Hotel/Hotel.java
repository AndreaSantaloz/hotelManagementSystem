package Model.Hotel;

import Model.Client.Address;
import Model.Client.NumberPhone;

import java.util.Objects;

public class Hotel {
    private final String id;
    private final String name;
    private final Address address;
    private final NumberPhone numberPhone;
    private final String email;

    public Hotel(String id, String name, Address address, NumberPhone numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public NumberPhone getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(name, hotel.name) && Objects.equals(address, hotel.address) && Objects.equals(numberPhone, hotel.numberPhone) && Objects.equals(email, hotel.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, numberPhone, email);
    }
}
