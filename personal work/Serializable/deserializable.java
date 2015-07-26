
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deserializable {
  public static void main(String[] args) {
  	// create a file to store teh serialize data
    String filename = "time.ser";
    //create the new boject you made in serializable.java and input data values
    serializable p = new serializable("Lars", "Vogel");

    // save the object to file
    FileOutputStream fos = null;
    ObjectOutputStream out = null;
    try {
      fos = new FileOutputStream(filename);
      out = new ObjectOutputStream(fos);
      out.writeObject(p);

      out.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    // read the object from file
    // save the object to file
    FileInputStream fis = null;
    ObjectInputStream in = null;
    try {
      fis = new FileInputStream(filename);
      in = new ObjectInputStream(fis);
      p = (serializable) in.readObject();
      in.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    System.out.println(p);
  }
} 