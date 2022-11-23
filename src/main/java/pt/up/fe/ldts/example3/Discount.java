package pt.up.fe.ldts.example3;

public class Discount {
    private final int fixed;
    private final double percentage;

    public Discount(int fixed) {
        double applyDiscount(double price);
    }

    public Discount(double percentage) {
        this.percentage = percentage;
        this.fixed = 0;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;

        if (fixed > 0) discountedPrice = fixed > price ? 0 : price - fixed;
        else if (percentage > 0) discountedPrice = price - price * percentage;
        else discountedPrice = price;

        return discountedPrice;
    }
}
