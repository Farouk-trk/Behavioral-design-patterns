package MediatorPattern;

public class TechSupport extends User {
	
	public TechSupport (String name, CommunicationChannel m) {
		super(name, m);
		
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" sent: "+ message);
		this.mediator.notify(this,message);
	}

	@Override
	public void recieve(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" recieved: "+ message);
		
	}

}
