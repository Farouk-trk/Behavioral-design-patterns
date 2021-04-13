package Iter3;

import java.util.ArrayList;

public class NewBmwIterator implements CarIterator{
	
	private ArrayList<Car> cars;
    protected int cursor;
    private int year;
	
	public NewBmwIterator(ArrayList<Car> bmwCars,int year) {
        this.cars = bmwCars;
        this.cursor = 0;
        this.year = year;
    }
	
	@Override
	public boolean HasNext() {
		return (cursor < cars.size() && cars.get(cursor) != null);
	}

	@Override
	public Car Next() {
		if (cars.get(cursor).getFirstRegistration()>=year) {
			return cars.get(cursor++);
			}
		cursor++;
		return this.Next();
	}

}
