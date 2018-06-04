package client;

import java.io.*;
import java.net.Socket;

public class ClientRun {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.43.155",9002);

        System.out.println("Client is running");

        //while(true) {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String strline = null;
            StringBuilder sb = new StringBuilder();


            while ((strline = br.readLine()) != null) {
                sb.append(strline).append("\n");
            }

            System.out.println(sb.toString());
        }

    //}
}
