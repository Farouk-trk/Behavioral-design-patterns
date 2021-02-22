package observer;

public class ObserverPattern {
    public static void main(String[] args) {

        // Create the Subject object It will handle updating all observers
        var finance = new Finance();

        // Create a concreate Observer that will be sent updates from Subject
        var laptops = new Computers(finance);

        // Create another Observer that will be sent updates from Subject
        var accessories = new Accessories(finance);

        finance.setVat(0.13);
        finance.setDollar2euro(1.2);


    }
}
