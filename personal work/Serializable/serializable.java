import java.io.Serializable;
import java.text.StringCharacterIterator;
import java.util.*;
import java.io.*;

// Using Serializable will restrict future flexibility, and publicly exposes 
// class implementation details which are usually private.
         //serialVersionUID is a universal version identifier for a Serializable class.
	 	   // Deserialization uses this number to ensure that a loaded class corresponds exactly
	 	      // WARNING if no match is found then an invalidClassException will be thrown


public class serializable implements Serializable {
	// create values you want to be serialized
  private String firstName;
  private String lastName;
  // stupid example for transient
  transient private Thread myThread;

  public serializable(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.myThread = new Thread();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
  	// once it deserialize it will show it in this format.
    return "Person [firstName=" + firstName + ", lastName=" + lastName
        + "]";
  }

} 
	 
