package state;

public class Mobile {
    MobileState mute;
    MobileState vibrate;
    MobileState loud;

    MobileState currentState;

    public Mobile() {
        mute = new Mute(this);
        vibrate = new Vibrate(this);
        loud = new Loud(this);
        currentState = loud; 
    }
    
    public void setMobileState(MobileState newState) {
        currentState = newState;
    }

    public void incomingCall() {
        currentState.incomingCall();
    }
    
    public void switchNextState() {
        currentState.switchNextState();
    }

    
    
}