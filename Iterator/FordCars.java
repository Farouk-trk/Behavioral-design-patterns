package Iter3;

public class FordCars implements Cars{

	private Car[] fordCars;

    public FordCars() {
    	
        this.fordCars = new Car[0];
    }

    public void addCar(String brand, String model, int firstRegistration) {
    	Car car = new Car(brand, model, firstRegistration);
        Car[] newFordCars = new Car[fordCars.length + 1];
        for (int i = 0; i < fordCars.length; i++) {
            newFordCars[i] = fordCars[i];
        }
        newFordCars[fordCars.length] = car;
        this.fordCars = newFordCars;
    }


	
	public CarIterator getIterator() {
		// TODO Auto-generated method stub
		return new FordIterator(fordCars);
	}

}
