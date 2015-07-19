package nonthreads;

import java.net.Socket;

public class main {

	public static void main(String[] args) {
		String host = "localhost";
	       for (int i = 1; i < 10001; i++){
	    	   try {
				Socket socket = new Socket(host,i);
				System.out.println("Print " + i + " is open....!");
			    socket.close();
			   }catch (Exception e2) {
				System.out.println("Port " + i + " is not open..!");
			  }
	       }

	}

}
