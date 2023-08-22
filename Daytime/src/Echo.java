import javax.swing.JOptionPane;

public class Echo extends Client{
	
	public Echo(String pServerIP) {
		super(pServerIP, 7);
		
	}

	
	public void processMessage(String pMessage) {
		JOptionPane.showMessageDialog(null, "Server SCHRRREIT:\n" + pMessage);
		
	}
	
	public void sendMessageToServer() {
		String Message = JOptionPane.showInputDialog("Was SCHRRRREIST du?");
		send(Message);
	}
}
