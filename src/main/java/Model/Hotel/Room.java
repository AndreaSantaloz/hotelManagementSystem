package Model.Hotel;

import java.util.Objects;

public class Room {
    private final String id;
    private final String name;
    private final Double pricePerNight;

    private final Hotel hotel;
    public Room(String id, String name, Double pricePerNight,Hotel hotel) {
        this.id = id;
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.hotel=hotel;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }
    public Hotel gethotel() {
        return hotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id) && Objects.equals(name, room.name) && Objects.equals(pricePerNight, room.pricePerNight) && Objects.equals(hotel, room.hotel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pricePerNight,hotel);
    }
}
