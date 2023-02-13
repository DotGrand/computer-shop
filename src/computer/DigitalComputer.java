package computer;

public class DigitalComputer extends Computer{
    private String processor;

    public DigitalComputer(String details, double price, String processor) {
        super(details, price);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "DigitalComputer{" +
                "processor='" + processor + '\'' +
                '}';
    }
}
