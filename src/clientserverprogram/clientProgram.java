import java.io.*;
import java.net.*;

public class clientProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket clientSocket = new Socket("localhost",1555);
		OutputStream outStream = clientSocket.getOutputStream();
		DataOutputStream out = new DataOutputStream(outStream);
		out.writeUTF("This is a greeting from the client");
		
		InputStream inStream = clientSocket.getInputStream();
		DataInputStream in = new DataInputStream(inStream);
		
		System.out.println("Server says: " + in.readUTF());	
		clientSocket.close();
				
	}

}
