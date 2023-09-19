
package clientside;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClientSide {


    public static void main(String[] args) {
        final String SERVER_HOST = "103.60.175.16";
 // Change to the server's IP or hostname if necessary
        final int SERVER_PORT = 1204;

        try {
            // Create a socket and connect to the server
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            System.out.println("Connected to server");

            // Get input and output streams for communication with the server
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            // Create a Scanner to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Read and send messages to the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            PrintWriter writer = new PrintWriter(out, true);

            String message;
            while (true) {
                System.out.print("Enter a message (or 'exit' to quit): ");
                message = scanner.nextLine();

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                // Send the message to the server
                writer.println(message);

                // Receive and display the server's response
                String serverResponse = reader.readLine();
                System.out.println("Server says: " + serverResponse);
            }

            // Close the client socket
            socket.close();
            System.out.println("Disconnected from server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}