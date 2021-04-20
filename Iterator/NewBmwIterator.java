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
		if (cursor < cars.size() && cars.get(cursor) != null) {
			if (cars.get(cursor).getFirstRegistration()>=year) {
				return true;
			}
			else {
				cursor ++;
				return HasNext();
			}
		}
		else {
			return false;
		}
	}

	@Override
	public Car Next() {
		return cars.get(cursor++);
			
	}

}
