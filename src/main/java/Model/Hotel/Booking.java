package Model.Hotel;

import Model.Client.Client;

import java.util.Objects;

public class Booking {
    private final String id;
    private final Client client;
    private final Hotel hotel;
    private final Room room;
    private final Integer people;

    private final String dateinicial;
    private final String dateend;

    public Booking(String id, Client client, Hotel hotel, Room room, Integer people, String dateinicial, String dateend) {
        this.id = id;
        this.client = client;
        this.hotel = hotel;
        this.room = room;
        this.people = people;
        this.dateinicial = dateinicial;
        this.dateend = dateend;
    }

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Room getRoom() {
        return room;
    }

    public Integer getPeople() {
        return people;
    }

    public String getDateinicial() {
        return dateinicial;
    }

    public String getDateend() {
        return dateend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id) && Objects.equals(client, booking.client) && Objects.equals(hotel, booking.hotel) && Objects.equals(room, booking.room) && Objects.equals(people, booking.people) && Objects.equals(dateinicial, booking.dateinicial) && Objects.equals(dateend, booking.dateend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, hotel, room, people, dateinicial, dateend);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", hotel=" + hotel +
                ", room=" + room +
                ", people=" + people +
                ", dateinicial='" + dateinicial + '\'' +
                ", dateend='" + dateend + '\'' +
                '}';
    }
}
