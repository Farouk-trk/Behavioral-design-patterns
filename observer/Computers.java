package observer;

public class Computers implements Observer {
    private final  Double primaryDellPrice = 1200.0;
    private final  Double primaryHpPrice = 1400.0;
    private Double currentDellPrice;
    private Double currentHpPrice;

    // holds reference to the Finance object
    private Subject finance;

    public Computers(Subject finance){
        // Store the reference to the finance object so we can make calls to its methods
        this.finance = finance;

        // Message notifies user of new observer
        System.out.println("New Computers Store  Observer has been created " );

        // Add the observer to the Subjects ArrayList
        finance.register(this);
    }

    // Called to update all observers
    @Override
    public void update(double vat, double dollar2euro) {
        this.currentHpPrice = (this.primaryHpPrice * vat + this.primaryHpPrice) * dollar2euro;

        this.currentDellPrice = (this.primaryDellPrice * vat + this.primaryDellPrice) * dollar2euro;

        System.out.println("Dell PC price: " +currentDellPrice+"\nHP PC price: " +currentHpPrice+"\n");
    }



}
