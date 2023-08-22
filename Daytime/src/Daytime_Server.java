
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Calendar;

public class Daytime_Server extends Server{

	public Daytime_Server() {
		super(13);
		
	}

	@Override
	public void processNewConnection(String pClientIP, int pClientPort) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date); 
		send(pClientIP, pClientPort, strDate);
		
	}

	@Override
	public void processMessage(String pClientIP, int pClientPort, String pMessage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processClosingConnection(String pClientIP, int pClientPort) {
		// TODO Auto-generated method stub
		
	}

}
