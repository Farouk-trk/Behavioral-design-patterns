package state;

public class StatePattern {
    public static void main(String[] args) {

        Mobile phone = new Mobile();

        phone.incomingCall();
        phone.switchNextState();
        
        phone.incomingCall();
        phone.switchNextState();
        
        phone.incomingCall();
        phone.switchNextState();
        
    }
}
