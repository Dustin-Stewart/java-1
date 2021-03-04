/**
 * Models a two dimensional point for use with the SetOfPoints class. 
 *
 * @author 	Franklin D. Worrell
 * @version	4 April 2017
 */ 

public class Point2D {
	private double x; 	// the x coordinate of the point
	private double y; 	// the y coordinate of the point 
	
	
	/**
	 * Constructor initializes the x and y coordinates of this.
	 * WHY IS THERE NO DEFAULT, NO-ARGUMENT CONSTRUCTOR??? 
	 *
	 * @param	x	the x coordinate of the new Point2D
	 * @param	y	the y coordinate of the new Point2D
	 */ 
	public Point2D(double x, double y) {
		this.x = x; 
		this.y = y; 
	} // end Constructor
	
	
	/**
	 * Return the x-coordinate. 
	 */ 
	public double getX() {
		return this.x; 
	} // end method getX
	
	
	/**
	 * Return the y-coordinate. 
	 *
	 * return	this.y
	 */ 
	public double getY() {
		return this.y; 
	} // end method getY
	
	
	/**
	 * Returns the distance between this and another Point2D. 
	 *
	 * @return	the distance between the points
	 */ 
	public double distance(Point2D otherPoint) {
		return Math.sqrt((otherPoint.getX() - this.x) * (otherPoint.getX() - this.x) + 
		                 (otherPoint.getY() - this.y) * (otherPoint.getY() - this.y)); 
	} // end method distance
	
	
	/**
	 * Returns a <code>String</code> representation of this.
	 * @return	a String representing the Point2D instance
	 */ 
	public String toString() {
	return "(" + x + " , " +  y + ")";
	} // end method toString
	
	
	/**
	 * Returns whether or not this Point2D instance is equal to another
	 * passed in a a parameter. 
	 *
	 * <b>Does NOT fully implement the contract for <code>equals</code>.</b>
	 * @param	otherPoint	the other instance being compared for equality
	 * @return	whether the two instances are equal
	 */ 
    @Override
	public boolean equals(Object otherPoint) {
		 
		// Check for null reference and type inequality. 
			// Return false appropriately. 
         if ((otherPoint == null)|| !(otherPoint instanceof Point2D)){
         return false;
         }
		// Check the coordinates for equality.
         if ((Math.abs(this.x - ((Point2D)otherPoint).x)<0.0001) &&
             (Math.abs(this.y - ((Point2D)otherPoint).y)<0.0001)){
             return true;
            }
            else{
            return false;
            }
            }
//	} // end method equals
} // end class Point2D