package designpatterns.mvc.view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import designpatterns.mvc.model.Model;

public class View extends JFrame {
	 private Model model;
	 public View viewTest;
	 public static int testView = 1;
	public  View(Model model) throws HeadlessException {
		this.model = model;
		System.out.println("<view.java> i have the package " + model);
	}
	
	
	
}
