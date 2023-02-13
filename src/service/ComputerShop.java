package service;

import computer.Computer;
import exception.NegativeQuantityComputerException;

public abstract class ComputerShop {
    private int quantityInStock;

    public ComputerShop(int quantityInStock) {
        if (quantityInStock < 0){
            throw new NegativeQuantityComputerException("Quantity cannot be a negative number!");
        }
        this.quantityInStock = quantityInStock;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public abstract Computer buyComputer();
}
