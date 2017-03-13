import java.io.*;
import java.net.*;
import java.util.Scanner;

public class clientProgram {

	public static void main(String[] args) {
            
            DataInputStream in = null;
            DataOutputStream out = null;
            
            // read args from cmd
            String host = args[0];
            int port = Integer.parseInt(args[1]);
            try {
                // intialize socket to connect to the server
                Socket clientSocket = new Socket(host, port);

                // comunicate throut input/ output stream
                InputStream inStream = clientSocket.getInputStream();
                in = new DataInputStream(inStream);
                OutputStream outStream = clientSocket.getOutputStream();
                out = new DataOutputStream(outStream);
            } catch (UnknownHostException e) {
                System.err.println("UnknownHostException" +  e);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
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
	}

}
