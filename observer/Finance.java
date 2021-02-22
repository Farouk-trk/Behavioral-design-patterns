package observer;

// implements the Subject interface
// Uses the Subject interface to update all Observers

import java.util.ArrayList;

public class Finance implements Subject {

    private ArrayList<Observer> observers;
    private Double vat =1.0 ;
    private Double dollar2euro = 1.0;

    public Finance(){
        // Creates an ArrayList to hold all observers
        observers=new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {

        // Adds a new observer to the ArrayList
        observers.add(o);

    }

    @Override
    public void notifyObserver() {

        // Update all observers and notifies them of the new tax and exchange rate
        for(Observer observer : observers){
            observer.update(vat, dollar2euro);
        }
    }


    public void setVat(Double vat) {
        this.vat = vat;
        notifyObserver();
    }

    public void setDollar2euro(Double dollar2euro) {
        this.dollar2euro = dollar2euro;
        notifyObserver();
    }
}
