package Iter3;

public class Car {
	
	String brand; 
	String model; 
	int firstRegistration;
	
	public  Car(String brand, String model, int firstRegistration){
		
		this.brand = brand;
		this.model = model;
		this.firstRegistration = firstRegistration;
		
	}
	
	public String getBrand(){ return brand; }
	public String getModel(){ return model; }
	public int getFirstRegistration(){ return firstRegistration; }
	public String getInfo(){ 
		return  "Brand: " + brand + ", Model: " + model + ", First Registration: " + firstRegistration ; 
		}

}