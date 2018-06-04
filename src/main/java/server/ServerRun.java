package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun {

    public static void main(String[] args) throws IOException {

        int id = 0;

        ServerSocket serverSocket = new ServerSocket(9002);

        System.out.println("Server is running.........");

        while(true) {
            Socket client = serverSocket.accept();

            System.out.println("-----------------------");

            StringBuilder sb = new StringBuilder();
            sb.append(id++).append("\n")
              .append(client.getInetAddress()).append("\n")
              .append(client.getPort()).append("\n");

            PrintWriter pw = new PrintWriter(client.getOutputStream());
            pw.println(sb);
            pw.flush();
            pw.close();

        }
    }
}