import java.io.*;
import java.net.*;

public class serverProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			ServerSocket ss = new ServerSocket(1555);
			Socket someSocket = ss.accept();
			
			InputStream is = someSocket.getInputStream();
			DataInputStream in = new DataInputStream(is);
			System.out.println("Client says: " + in.readUTF());
			
			OutputStream os = someSocket.getOutputStream();
			DataOutputStream out = new DataOutputStream(os);
			out.writeUTF("Hello from server");
			
			someSocket.close();

	}

}
