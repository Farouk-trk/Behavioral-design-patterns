package MediatorPattern;

public abstract class User {
	
	private String name;
	protected CommunicationChannel mediator;
	
	public User(String name, CommunicationChannel m) {
		this.mediator = m;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void recieve(String message);
	
	public String getName() {
		return this.name;
	}
}
