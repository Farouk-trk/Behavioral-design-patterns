package memento;

class Memento {
    private String savedText;

    public Memento(String text) {
        this.savedText = text;
    }

    public String getText() {
        return savedText;
    }
}
