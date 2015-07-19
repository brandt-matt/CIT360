package designpatterns.mvc.controller;

import designpatterns.mvc.model.Model;
import designpatterns.mvc.view.View;

public class Controller {
  private View view;
  private Model model;
  public Controller(Model model, View view) {
	  this.model = model;
	  this.view = view;
	  
	  System.out.println("<controller.java> i have both " + "[" + model + "]"  + " and " +  "[" + view + "]");
  }
 
  
}
