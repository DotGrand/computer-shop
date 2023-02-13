package service;

import computer.Computer;
import computer.DigitalComputer;
import exception.NegativeQuantityComputerException;

public class DigitalComputerShop extends ComputerShop{

    private static final Computer DIGITAL_COMPUTER= new DigitalComputer("powerful ", 120.5,"Intel");

    public DigitalComputerShop(int quantityInStock) {
        super(quantityInStock);
    }

    @Override
    public Computer buyComputer() {
        if (getQuantityInStock() < 1){
            throw new NegativeQuantityComputerException("Sorry, there are no computer anymore");
        }

        setQuantityInStock(getQuantityInStock()-1);

        return DIGITAL_COMPUTER;
    }
}
