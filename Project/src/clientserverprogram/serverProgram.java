import java.io.*;
import java.net.*;

public class serverProgram {

	public static void main(String[] args) {

            DataInputStream in = null;
            DataOutputStream out = null;
            
            try {
                // initialze server socket
                ServerSocket ss = new ServerSocket(1555);
                // wait untill client connects to the server port
                Socket someSocket = ss.accept();

                // comunicate throut input/ output stream
                InputStream is = someSocket.getInputStream();
                in = new DataInputStream(is);
                OutputStream os = someSocket.getOutputStream();
                out = new DataOutputStream(os);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
            
            try {
                while (true)
                {
                    int number = in.readInt();
                    System.out.println("Processing " + number + " ... ");
                    out.writeInt(Square(number));
                }	
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
	}
        
        public static int Square(int number)
        {
            // return square of the number
            return number * number;
        }
}
