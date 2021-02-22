package memento;


class Originator {
    private String text="";


    public void setText(String text) {
        System.out.println("Setting text to " + text+"");
        this.text = text;
    }

    public Memento save() {
        System.out.println("Saving to Memento."+ "\n");
        return new Memento(text);
    }
    public void restore(Memento m) {
        text = m.getText();
        System.out.println("Text after restoring from Memento: " + text + "\n");
    }
}
