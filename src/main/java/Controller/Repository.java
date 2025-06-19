package Controller;

import Model.Client.Client;
import Model.Hotel.Booking;
import Model.Hotel.Hotel;

import java.util.stream.Stream;

public interface Repository {
    Stream<Hotel> hotels = null;
    Stream<Client> clients = null;
    Stream<Booking> books = null;

}
