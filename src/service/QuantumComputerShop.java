package service;

import computer.Computer;
import computer.QuantumComputer;
import exception.NegativeQuantityComputerException;

public class QuantumComputerShop extends ComputerShop{

    private static final Computer QUANTUM_COMPUTER = new QuantumComputer("professional quantum pro", 300.0, 35.5);

    public QuantumComputerShop(int quantityInStock) {
        super(quantityInStock);
    }

    @Override
    public Computer buyComputer() {
        if (getQuantityInStock() < 1){
            throw new NegativeQuantityComputerException("Sorry, there are no computer anymore");
        }

        setQuantityInStock(getQuantityInStock()-1);

        return QUANTUM_COMPUTER;
    }
}
