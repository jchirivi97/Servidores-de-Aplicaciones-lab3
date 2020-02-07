package edu.escuelaing.arem.app;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BetterSpringBoot {

	public void main(String[] args) {
		String classname = "edu.escuelaing.arep.webservices";
		try {
			Class c = Class.forName(classname);
			Method[] metodos = c.getMethods();
			
			for (Method m: metodos) {
				//ejecutando metodo
				m.getName();
				//clase del metodo
				c.getName();
			}
		}
		catch (ClassNotFoundException ex) {
			Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE,null,ex);
		}
		
	}
		
}
