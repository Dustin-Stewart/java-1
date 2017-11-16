/**
 * Models a circle as a Point2D and a radius. 
 *
 * Author: Franklin D. Worrell
 * Revised: 18 July 2016 at 9:38
 * Assignment: Lab 9 - Polymorphism
 * Class: Circle
 */ 

public class Circle extends Shape {
	/* Stubbed */ 
	
	// Declare any additional instance variables a Circle will need. 
	private double radius;
   
	// Write an appropriate constructor for a circle. 
	public Circle(Point2D center, double radius){
   super(center);
   this.radius=radius;
   }
	// Write an appropriate area() method for a circle. 
	@Override
   public double area(){
      return Math.PI*(radius*radius);
   }
	// Think about whether Shape.toString() will be adequate for Circle.
	// If not, write a toString() method for Circle. 
   @Override
   public String toString(){
      return "Circle located at "+ super.toString() +"with a radius of "+ this.radius;
   } 
} // end class Triangle