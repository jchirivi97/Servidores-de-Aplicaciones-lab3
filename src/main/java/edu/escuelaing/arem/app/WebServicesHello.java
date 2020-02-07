package edu.escuelaing.arem.app;

 

public class WebServicesHello {

	@Web
	public static String Hello() {
		return "<!DOCTYPE html>"
				+"<html>"
				+"<head>"
				+"<title> respuesta </title>"
				+"</head>"
				+"<body>"
				+"<p>"+"hola"+"</p>"
				+"</body>"
				+"</html>";
	}
	
}
