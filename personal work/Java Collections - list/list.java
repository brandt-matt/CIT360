import java.util.*;


public class list{
	public static void main(String[] args){
		   // Few examples of how to create a LIST instance
              List listA = new ArrayList(); // we are using this for the examples below
              List listB = new LinkedList();
              List listC = new Vector();
              List listD = new Stack();

            // adding and accessing the list elements.
              // add() calls add a STRING instance to the end of the list 
              listA.add("element 1");
              listA.add("element 2");
              listA.add("element 3");
              // add() calls add a String  at index 0, meaning the beginning of the list
              //listA.add(0, "element 0 ");
              
             // accessing the list elements stored, either by index or via Iterator
         
                // access via Iterator
                Iterator iterator = listA.iterator();
                while(iterator.hasNext()){
                	String element = (String) iterator.next();
                	System.out.println(element + " using Iterator");
                }

                // access via new for-loop
                for(Object object : listA){
                	String element = (String) object;
                	System.out.println(element + " using for loop");
                }

     //REMOVING ELEMENTS
                  // remove(Object element);
                  // remove(int index);
     //REFERENCE
                //http://tutorials.jenkov.com/java-collections/list.html

	}
}