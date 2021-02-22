package memento;

import java.util.ArrayList;

class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();
    private int current_save = -1;
    private int all_saves=-1 ;

    public void addMemento(Memento m) {
        mementos.add(m);
        this.all_saves +=1;
        this.current_save = this.all_saves;
    }

    public Memento getUndoMemento() {
        if(current_save>0) {
            current_save-=1;
        }
        return mementos.get(current_save);

    }
    public Memento getRedoMemento() {
        if(current_save<all_saves) {
            current_save+=1;
        }
        return mementos.get(current_save);

    }
}
