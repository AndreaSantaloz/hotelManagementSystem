package Model.Hotel;

import java.util.Objects;

public class Room {
    private final String id;
    private final String name;
    private final Double pricePerNight;

    public Room(String id, String name, Double pricePerNight) {
        this.id = id;
        this.name = name;
        this.pricePerNight = pricePerNight;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id) && Objects.equals(name, room.name) && Objects.equals(pricePerNight, room.pricePerNight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pricePerNight);
    }
}
