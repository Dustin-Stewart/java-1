public class Runner {
   public static void main(String[] args){
      Point2D vert1 = new Point2D(0.0,0.0);
      Point2D vert2 = new Point2D(0.0,3.0);         //initialize three points for triangle   
      Point2D vert3 = new Point2D(4.0,3.0);
      
      //center for circle
      Point2D circleCenter = new Point2D(5.5,5.5);
      //create a shape
      Triangle triangle = new Triangle(vert1,vert2,vert3);
      Circle circle = new Circle(circleCenter, 2.0);
      
      //initialize an array of shapes
      Shape[] shapes= new Shape[2];
      shapes[0] = triangle;
      shapes[1] = circle;
      //print the area of shape
      for (Shape shape : shapes){
         System.out.println(shape + " has area " + shape.area()+"\n");
   }
   //move shapes
   for (Shape shape: shapes){
      shape.moveVertical(2.0);
      shape.moveHorizontal(2.0);
       }
   //print the area of shape
   for (Shape shape : shapes){
       System.out.println(shape + " has area " + shape.area()+"\n");
}
}
}