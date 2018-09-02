import com.sun.deploy.net.HttpRequest;

import java.io.IOException;
import java.net.*;

public class Main {
    HttpRequest request;

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        HttpURLConnection newConnection = (HttpURLConnection) url.openConnection();

        System.out.println(connection.getRequestMethod());
        System.out.println(connection.getResponseCode());
        System.out.println(connection.getHeaderFields());

        System.out.println();


        newConnection.setRequestMethod("POST");
        System.out.println(newConnection.getRequestMethod());
        System.out.println(newConnection.getResponseCode());
    }
}


