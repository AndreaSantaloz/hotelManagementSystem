package Model.Client;

public class NumberPhone {
    private final String formatNumber;
    private final String number;

    public NumberPhone(String formatNumber, String number) {
        this.formatNumber = formatNumber;
        this.number = number;
    }

    public String getFormatNumber() {
        return formatNumber;
    }

    public String getNumber() {
        return number;
    }
}
