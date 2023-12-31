/**
 * Ein Echo-Server auf Port 7
 * 
 * @author QUA-LIS NRW 
 * @version 1.0
 */

public class EchoServer extends Server
{
    
    public EchoServer()
    { 
      super(7); 
      System.out.println("Server gestartet");
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        send(pClientIP, pClientPort, pMessage);
    }

    public void processClosingConnection(String pClientIP, int pClientPort) {
    }
       
}
