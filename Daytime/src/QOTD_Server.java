import java.util.Random;

public class QOTD_Server extends Server{

	public QOTD_Server() {
		super(17);
		
	}

	@Override
	public void processNewConnection(String pClientIP, int pClientPort) {
		Random ra = new Random();
		String[] quotes= {
				"Now I am become death, the destroyer of worlds ~J. Robert Oppenheimer ",
				"It's over Anakain, I have the highground ~General Obi-Wan Kenobi",
				"Do or do not, there is no try ~Grand Master Yoda",
				"I trust no one, not even myself ~Joseph Stalin",
				"The only thing we have to fear is fear itself ~Franklin D. Roosevelt",
				"I am the one who knocks ~Whalter Hartwell White",
				"Don't worry when you are not recognized, but strive to be worthy of recognition ~Abraham Lincoln",
				"Welche Kuh? ~Alexander Klözer",
				"The greatest glory in living lies not in never falling, but in rising every time we fall ~Nelson Mandela",
				"The supreme art of war is to subdue the enemy without fighting ~Sun Tzu"
				
		};
		String q = quotes[ra.nextInt(9)];
		send(pClientIP, pClientPort, q);
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
