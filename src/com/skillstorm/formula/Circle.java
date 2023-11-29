package com.skillstorm.formula;

public class Circle {

	int radius;
	double area;
	int diameter;
	double circumference;
	String color;


	public Circle() {

		this.radius = 5;
		this.color = "green";

	}

	public Circle(int radius) {

		this.radius = radius;
		this.color = "yellow";

	}

	public int calculateDiameter (int radius) {
		return diameter = 2 * radius;
	}

	public double calculateArea() {
		return area = Math.PI * radius * radius;
	}

	public double calculateCircumference (int radius) {
		return circumference = 2 * Math.PI * radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



}
