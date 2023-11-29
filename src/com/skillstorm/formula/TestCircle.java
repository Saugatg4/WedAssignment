package com.skillstorm.formula;

public class TestCircle {
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle();
		
		printCircleDetails("Circle 1", circle1);
		printCircleDetails("Circle 2", circle2);
		
		circle1.setColor("blue");
		
		printCircleDetails("Circle 1", circle1);
		printCircleDetails("Circle 2", circle2);
		
		   circle1.setColor("Blue");
		   
		   printCircleDetails("Circle 1 after color change", circle1);
	        printCircleDetails("Circle 2", circle2);
		
	}
	
	private static void printCircleDetails(String circleName, Circle circle) {
		
		  System.out.println(circleName + " Details:");
	        System.out.println("Radius: " + circle.calculateDiameter(5));
	        System.out.println("Circumference: " + circle.calculateCircumference(10));
	        System.out.println("Area: " + circle.calculateArea());
	        System.out.println("Color: " + circle.getColor());
	        System.out.println();
	}
	
}
