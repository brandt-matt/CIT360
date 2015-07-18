package designpatterns.mvc;
import designpatterns.mvc.controller.Controller;
import designpatterns.mvc.model.Model;
import designpatterns.mvc.view.View;


public class Main {

	public static void main(String[] args) {
       runMain();
	}
   public static void runMain(){
	    Model model = new Model();
	    View view = new View(model);
        Controller controller = new Controller(model, view);
   }
}
