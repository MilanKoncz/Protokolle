/**
 * Ein allgemeiner TCP/IP-Client unter Verwendung der Klasse Connection
 * 
 * @author QUA-LIS NRW 
 * @version 1.0
 */

import javax.swing.JOptionPane;

public class TCPIPConnection extends Connection
{

    public TCPIPConnection(String pServerIP, int pServerPort)
    {
        super(pServerIP, pServerPort);
    }

    /**
     * Die Methode servernachrichtAusgeben() sollte nur aufgerufen werden, wenn
     * der Server etwas gesendet hat. Anderenfalls blockiert die Methode - bedingt
     * durch den Aufruf der receive()-Methode der Klasse Connection den
     * weiteren Programmablauf, bis der Server etwas sendet. 
     */
    public void servernachrichtAusgeben()
    {
        JOptionPane.showMessageDialog(null,"Server sendet:\n" + receive());
         JOptionPane.showMessageDialog(null,"Server sendet:\n" + receive());
    }
    

}
