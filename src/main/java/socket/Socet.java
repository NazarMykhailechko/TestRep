package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Socet {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("localhost");

        System.out.println(inetAddress.getHostAddress());
    }
}
