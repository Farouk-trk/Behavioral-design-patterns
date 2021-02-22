package memento;

public class MementoPattern {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();


        originator.setText("The memento pattern is a software design pattern that provides the ability to restore an object to its previous state. ");
        caretaker.addMemento( originator.save() );

        originator.setText("The memento pattern is a behavioral design pattern that provides the ability to restore an object to its previous state.");
        caretaker.addMemento( originator.save() );

        originator.setText("The memento pattern is a behavioral design pattern that provides the ability to restore an object to its previous state (undo/redo).");
        caretaker.addMemento( originator.save() );



        originator.restore( caretaker.getUndoMemento() );
        originator.restore( caretaker.getUndoMemento() );
        originator.restore( caretaker.getRedoMemento() );
        originator.restore( caretaker.getRedoMemento() );
    }


}
