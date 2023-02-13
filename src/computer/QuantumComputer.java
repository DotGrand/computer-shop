package computer;

public class QuantumComputer extends Computer{
    private double weight;

    public QuantumComputer(String details, double price, double weight) {
        super(details, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "QuantumComputer{" +
                "weight=" + weight +
                '}';
    }
}
