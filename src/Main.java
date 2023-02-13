import computer.Computer;
import service.ComputerShop;
import service.DigitalComputerShop;
import service.QuantumComputerShop;

public class Main {

    public static void main(String[] args) {
        ComputerShop digitalComputerShop = new DigitalComputerShop(140);
        ComputerShop quantumComputerShop = new QuantumComputerShop(1);

        Computer digitalComputer1 = digitalComputerShop.buyComputer();
        Computer digitalComputer2 = digitalComputerShop.buyComputer();

        Computer quantumComputer = quantumComputerShop.buyComputer();

        System.out.println(digitalComputer1);
        System.out.println(digitalComputer2);

        System.out.println(quantumComputer);

    }


}
