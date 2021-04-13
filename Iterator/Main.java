package Iter3;

public class Main {

	public static void main(String[] args) {
		
		
		BmwCars bmws = new BmwCars();
		bmws.addCar("BMW", "i3", 2014);
		bmws.addCar("BMW", "X1", 2012);
		bmws.addCar("BMW", "X3", 2020);
		bmws.addCar("BMW", "m8", 2014);
		bmws.addCar("BMW", "X5", 2018);
		bmws.addCar("BMW", "m3", 2015);
		
		FordCars fords = new FordCars();
		fords.addCar("Ford", "Kuga", 2014);
		fords.addCar("Ford", "Fiesta", 2014);
		fords.addCar("Ford", "Focus", 2018);
		fords.addCar("Ford", "Kuga", 2014);
		
		CarIterator iterator1 = bmws.getIterator();
		
		System.out.print("First Iterator: BMW Arraylist\n");
		while(iterator1.HasNext()) {
            Car current = iterator1.Next();
            System.out.println(current.getInfo());
        }
		
		
		CarIterator iterator2 = fords.getIterator();
		
		System.out.print("\nSecond Iterator: FORD List\n");
		while(iterator2.HasNext()) {
            Car current = iterator2.Next();
            System.out.println(current.getInfo());
        }
		
		System.out.print("\nThird Iterator: Iterate only throught new BMW cars\n");
		CarIterator iterator3 = bmws.getNewIterator(2015);
		while(iterator3.HasNext()) {
            Car current = iterator3.Next();
            System.out.println(current.getInfo());
        }
	}

}
