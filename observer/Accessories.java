package observer;

public class Accessories implements Observer {
    private Double primaryMousePrice = 20.0;
    private Double primaryKeyboardPrice = 65.0;
    private Double currentMousePrice;
    private Double currentKeyboardPrice;

    // holds reference to the Finance object
    private Subject finance;

    public Accessories(Subject finance){
        // Store the reference to the finance object so we can make calls to its methods
        this.finance = finance;

        // Message notifies user of new observer
        System.out.println("New Accessories store has been created " );

        // Add the observer to the Subjects ArrayList
        finance.register(this);
    }

    // Called to update all observers
    @Override
    public void update(double vat, double dollar2euro) {
        this.currentMousePrice = (this.primaryMousePrice * vat + this.primaryMousePrice) * dollar2euro;

        this.currentKeyboardPrice = (this.primaryKeyboardPrice * vat + this.primaryKeyboardPrice) * dollar2euro;

        System.out.println("Keyboard price: " +currentKeyboardPrice+"\nMouse price: " +currentMousePrice+"\n");
    }



}

