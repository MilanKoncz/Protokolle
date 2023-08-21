
public class Main {

	public static void main(String args[]) {
		TCPIPConnection tcip0 = new TCPIPConnection("time.fu-berlin.de", 13);
		tcip0.servernachrichtAusgeben();
	}
}
