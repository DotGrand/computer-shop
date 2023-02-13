package computer;

public abstract class Computer {

    private String details;
    private double price;

    public Computer(String details, double price) {
        this.details = details;
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}