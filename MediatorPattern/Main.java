package MediatorPattern;

public class Main {

	public static void main(String[] args) {

		CommunicationChannel chatroom1 = new ChatRoom();
		
		User techSupport = new TechSupport("Mark", chatroom1);
		User client = new Client("Max", chatroom1);
		
		chatroom1.registerTechSupport(techSupport);
		chatroom1.registerClient(client);
		
		client.send("My Computer Has Crashed – How Do I Fix It?");
		
		techSupport.send("Open the Task Manager (Ctrl-Alt-Delete ) to see which programme isn’t responding, and close it."
				+ " If your computer still isn’t working, then restart it.");
		
		

	}

}
