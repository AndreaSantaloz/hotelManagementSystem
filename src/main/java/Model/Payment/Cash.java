package Model.Payment;

public class Cash implements PaymentMethod {
    @Override
    public void processPay() {
        System.out.println("Paga el día acordado");
    }
}
