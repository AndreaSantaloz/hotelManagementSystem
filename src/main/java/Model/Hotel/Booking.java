package Model.Hotel;

import Model.Client.Client;

import java.util.Objects;

public class Booking {
    private final String id;
    private final Client client;
    private final Hotel hotel;
    private final Room room;
    private final Integer people;

    private final String dateInitial;
    private final String dateFinal;

    public Booking(String id, Client client, Hotel hotel, Room room, Integer people, String dateInitial, String dateFinal) {
        this.id = id;
        this.client = client;
        this.hotel = hotel;
        this.room = room;
        this.people = people;
        this.dateInitial = dateInitial;
        this.dateFinal = dateFinal;
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

    public String getDateInitial() {
        return dateInitial;
    }

    public String getDateFinal() {
        return dateFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id) && Objects.equals(client, booking.client) && Objects.equals(hotel, booking.hotel) && Objects.equals(room, booking.room) && Objects.equals(people, booking.people) && Objects.equals(dateInitial, booking.dateInitial) && Objects.equals(dateFinal, booking.dateFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, hotel, room, people, dateInitial, dateFinal);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", hotel=" + hotel +
                ", room=" + room +
                ", people=" + people +
                ", dateinicial='" + dateInitial + '\'' +
                ", dateend='" + dateFinal + '\'' +
                '}';
    }
}
