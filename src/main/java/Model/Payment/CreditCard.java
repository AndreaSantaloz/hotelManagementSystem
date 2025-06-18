package Model.Payment;

public class CreditCard implements PaymentMethod{

    private final String cardNumber;
    private final String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void processPay() {
        System.out.println("Paga en el día acordado");
    }
}
