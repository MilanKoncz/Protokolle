

public class Daytime_Client extends Client{
	public Daytime_Client(String pServerIP) {
		super(pServerIP, 13);
		
	}

	@Override
	public void processMessage(String pMessage) {
	System.out.println(pMessage);
		
	}

	
}
