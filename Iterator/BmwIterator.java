package Iter3;

import java.util.ArrayList;

public class BmwIterator implements CarIterator {
	
	private ArrayList<Car> cars;
    protected int cursor;
	
	public BmwIterator(ArrayList<Car> bmwCars) {
        this.cars = bmwCars;
        this.cursor = 0;
    }
	
	@Override
	public boolean HasNext() {
		return (cursor < cars.size() && cars.get(cursor) != null);
	}

	@Override
	public Car Next() {
		return cars.get(cursor++);
		
	}

}
