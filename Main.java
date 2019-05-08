import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        boolean connected = false;

        DialogueWindow window = new DialogueWindow();
        window.createWindow();

        //tworzenie serwera
        ServerSocket ss = null;
        Socket s = null;
        PrintWriter pr = null;
        try {
            InetAddress address = InetAddress.getByName("192.168.43.119");
            ss = new ServerSocket( 4999, 50, address );
            //ss = new ServerSocket( 4999 );
            s = ss.accept();
            pr = new PrintWriter( s.getOutputStream());
            connected = true;
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        InputStreamReader in = null;
        BufferedReader bf = null;
        String wiadomosc = null;

       while(connected) {
           try {
               in = new InputStreamReader( s.getInputStream() );
               bf = new BufferedReader( in );
               wiadomosc = bf.readLine();
           } catch (IOException e1) {
               e1.printStackTrace();
           }
       }

       //przycisk wyslij

        pr.println( wiadomosc );
        pr.flush();

    }
}
