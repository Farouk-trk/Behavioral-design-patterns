package MediatorPattern;

public interface CommunicationChannel {
	
	void notify(User sender, String message);
	void registerTechSupport(User user);
	void registerClient(User user);

}
