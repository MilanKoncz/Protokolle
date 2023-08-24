import javax.swing.JOptionPane;

public class QOTD_Client extends Client{

	public QOTD_Client(String pServerIP) {
		super(pServerIP, 17);
		
	}

	
	public void processMessage(String pMessage) {
		JOptionPane.showMessageDialog(null, "Server SCHRRREIT:\n" + pMessage);
		
	}
	
}
