package Model.Payment;

import Model.Hotel.Booking;

public interface PaymentService {
    public static Double calculatePrice(Booking booking){
        double price = (booking.getPeople()*booking.getRoom().getPricePerNight());
        return (price > 0)?price:0.00;
    }
}
