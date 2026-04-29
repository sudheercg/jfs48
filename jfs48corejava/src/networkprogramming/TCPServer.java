package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1. Create a ServerSocket and we need specify the port 5000
2. Accept client connection
3. Read data from client
 using BufferedREader, InputStreamReader
4. Send response to the clilent by using PrintWriter
5. Close resources.
 * 
 * 
 * */
public class TCPServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server is waiting for Clinet...");
			//accept client connection
			Socket socket = serverSocket.accept();
			System.out.println("Client conected");
			
			InputStream inputStream = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader reader = new BufferedReader(inputStreamReader);
		    String message = reader.readLine();
		    System.out.println("Client Message: "+ message);
		    
		    PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			writer.println("Hello from Server");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
