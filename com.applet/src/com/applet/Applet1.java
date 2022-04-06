package com.applet;

import java.applet.Applet;
import java.awt.*;

public class Applet1 extends Applet{
	Button b;
	TextField t;
	public void init() {
		b= new Button("submit");
		add(b);
		t= new TextField();
		add(t);
	}
	

}