import java.io.*;
import java.net.*;

public class serverProgram {

	public static void main(String[] args) throws IOException {

            // initialze server socket
            ServerSocket ss = new ServerSocket(1555);
            // wait untill client connects to the server port
            Socket someSocket = ss.accept();
            
            // comunicate throut input/ output stream
            InputStream is = someSocket.getInputStream();
            DataInputStream in = new DataInputStream(is);
            OutputStream os = someSocket.getOutputStream();
            DataOutputStream out = new DataOutputStream(os);
            
            while (true)
            {
                int number = in.readInt();
                System.out.println("Processing " + number + " ... ");
                out.writeInt(Square(number));
            }	
            //someSocket.close();
	}
        
        public static int Square(int number)
        {
            // return square of the number
            return number * number;
        }
}
