package Iter3;

import java.util.ArrayList;


public class BmwCars implements Cars{
	
	ArrayList<Car> bmwCars;
	
	public BmwCars() {
		
		bmwCars = new ArrayList<Car>();
	}
	
	public void addCar(String brand, String model, int firstRegistration){
		
		Car car = new Car(brand, model, firstRegistration);
		bmwCars.add(car);
	}
	
	@Override
	public CarIterator getIterator() {
		return new BmwIterator(bmwCars);
	}
	
	public CarIterator getNewIterator(int year) {
		return new NewBmwIterator(bmwCars,year);
	}

}
