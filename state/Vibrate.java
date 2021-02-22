package state;

public class Vibrate implements MobileState {
    Mobile mobile;

    public Vibrate(Mobile newMobile){
        this.mobile = newMobile;
    }


    @Override
    public void incomingCall() {
        System.out.println("Incoming call... Vibration signal");
    }
    
    public void switchNextState() {
    	System.out.println("switching state to Loud");
		mobile.setMobileState(mobile.loud);
		
	}
}
