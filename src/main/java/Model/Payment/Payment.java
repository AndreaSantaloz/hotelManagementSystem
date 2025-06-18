package Model.Payment;

import Model.Hotel.Booking;

import java.util.Objects;

public class Payment {
    private final Booking booking;
    private final Double totalPrice;
    private final PaymentMethod paymentMethod;

    public Payment(Booking booking, Double totalPrice, PaymentMethod paymentMethod) {
        this.booking = booking;
        this.totalPrice = PaymentService.calculatePrice(this.booking);
        this.paymentMethod = paymentMethod;
    }

    public Booking getBooking() {
        return booking;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(booking, payment.booking) && Objects.equals(totalPrice, payment.totalPrice) && Objects.equals(paymentMethod, payment.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booking, totalPrice, paymentMethod);
    }
}
