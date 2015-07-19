package threads;
import java.io.IOException;
import java.net.*;

public class main {
   private static String host;
	public static void main(String[] args) {	
       host = "localhost";
       for (int i = 1; i < 10001; i++){
    	  portThread t = new portThread(host, i ); 
    	  t.start();
       }
	}

}
