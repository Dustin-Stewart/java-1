/**
 * Models a triangle as a set of three Point2Ds.  
 *
 * Author: Franklin D. Worrell
 * Revised: 18 July 2016 at 9:08
 * Assignment: Lab 9 - Polymorphism
 * Class: Triangle
 */ 

public class Triangle extends Shape {
	/**
	 * Constructor takes three Point2Ds--the vertices of the triangle. 
	 *
	 * @param	vert1	the triangle's first vertex
	 * @param	vert2 	the triangle's second vertex
	 * @param	vert3	the triangle's third vertex
	 */ 
	public Triangle(Point2D vert1, Point2D vert2, Point2D vert3) {
		super(vert1, vert2, vert3); 
	} // end Constructor
   
   @Override
   public double area(){
   return Math.abs(((super.get(1).getX() - super.get(0).getX())*
                    (super.get(2).getY() - super.get(0).getY())- 
                    (super.get(2).getX() - super.get(0).getX())*
                    (super.get(1).getY() - super.get(0).getY()))/2);
   }
} // end class Triangle