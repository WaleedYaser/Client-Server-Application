import java.io.*;
import java.net.*;
import java.util.Scanner;

public class clientProgram {

	public static void main(String[] args) {
            
            
            Socket clientSocket = null;
            DataInputStream in = null;
            DataOutputStream out = null;
            
            try {
            // intialize socket to connect to the server
            clientSocket = new Socket("localhost", 1555);
            
            // comunicate throut input/ output stream
            InputStream inStream = clientSocket.getInputStream();
            in = new DataInputStream(inStream);
            OutputStream outStream = clientSocket.getOutputStream();
            out = new DataOutputStream(outStream);
            } catch (UnknownHostException e) {
                System.err.println("Don't know about host");
            } catch (IOException e) {
                System.err.println("Couldn't get I/O for the connection to");
            }
            
            try {
            while (true)
            {
                // read user input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                
                // send number to be processed
                out.writeInt(number);
                System.out.println("Square root of " + number +" is: " 
                        + in.readInt());	
            }
            } catch (UnknownHostException e) {
                System.err.println("Trying to connect to unknown host: " + e);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
            //clientSocket.close();
				
	}

}
