package state;

public class Mute implements MobileState {

    Mobile mobile;

    public Mute(Mobile  mobile) {
        this.mobile = mobile;
    }


    public void incomingCall() {
        System.out.println("Incoming call... No audio signals");
    }
        
        public void switchNextState() {
        	System.out.println("switching state to Vibration");
    		mobile.setMobileState(mobile.vibrate);
    		
    	}
}
