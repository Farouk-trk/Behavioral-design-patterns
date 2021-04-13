package MediatorPattern;

import java.util.ArrayList;

public class ChatRoom implements CommunicationChannel {
	
	private User techSupport;
	private User client;

	@Override
	public void notify(User sender, String message) {
		// TODO Auto-generated method stub
		if (sender== client) {
			techSupport.recieve(message);
		}
		else {
			client.recieve(message);
		}
		
	}

	@Override
	public void registerClient(User client) {
	this.client= client;
		
	}
	
	@Override
	public void registerTechSupport(User techSupport) {
	this.techSupport = techSupport	;
		
	}
  
}
