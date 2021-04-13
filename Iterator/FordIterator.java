package Iter3;

import java.util.ArrayList;

public class FordIterator implements CarIterator{
	
	private Car[] cars;
    protected int cursor;

    public FordIterator(Car[] fordCars) {
        this.cars = fordCars;
        this.cursor = 0;
    }

    public boolean HasNext() {
        return (cursor < cars.length && cars[cursor] != null);
    }

    public Car Next() {
        return cars[cursor++];
    }
	
	

}
