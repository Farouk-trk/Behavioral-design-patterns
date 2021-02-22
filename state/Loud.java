package state;

public class Loud implements MobileState {
    Mobile mobile;

    public Loud(Mobile  mobile) {
        this.mobile = mobile;
    }


    public void incomingCall() {
        System.out.println("Incoming call... Audio signal");
    }


	public void switchNextState() {
		System.out.println("switching state to Mute");
		mobile.setMobileState(mobile.mute);
		
	}


	
}
