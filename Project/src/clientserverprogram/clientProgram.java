import java.io.*;
import java.net.*;
import java.util.Scanner;

public class clientProgram {

	public static void main(String[] args) throws Exception {
            
            // intialize socket to connect to the server
            Socket clientSocket = new Socket("localhost",1555);
            
            // comunicate throut input/ output stream
            InputStream inStream = clientSocket.getInputStream();
            DataInputStream in = new DataInputStream(inStream);
            OutputStream outStream = clientSocket.getOutputStream();
            DataOutputStream out = new DataOutputStream(outStream);
            
            while (true)
            {
                // read user input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                
                // send number to be processed
                out.writeInt(number);
                System.out.println("Server says: " +number +" "+ in.readInt());	
            }
            //clientSocket.close();
				
	}

}
