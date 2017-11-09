public class Runner{
   public static void main(String[] args){
      Point2D point1 = new Point2D(1.5,2.5);
      Point2D point2 = new Point2D(4.0,2.5);
      Point2D point3 = new Point2D(1.5,2.5);
      Point2D point4 = new Point2D(3.5,2.5);
         
      System.out.println("Point1: "+point1.toString());
      System.out.println("Point1: "+point2.toString());
      System.out.println("Point1: "+point3.toString());
      System.out.println("p1 = p2: "+point1.equals(point2));
      System.out.println("p1 = p3: "+point1.equals(point3));
      System.out.println("p1 = p1: "+point1.equals(point1));
      Object point5 = (Object)point4;
      System.out.println("point5: "+point5.toString());
      SetOfPoints set1 = new SetOfPoints(point1,point2);
      System.out.println("\n set1: " + set1.toString());
      
      Triangle tr1 = new Triangle(point1, point2, point4);
      System.out.println("\n tr1: " + tr1.toString());
      
      LineSegment line1 = new LineSegment();
      line1.add(point1);
      System.out.println("\n line1: "+ line1.toString());
      
      SetOfPoints set2;
      set2 = new Triangle();
      set2.add(point1);
      System.out.println("set2: " + set2);
      
      set2.add(point2);
      set2.add(point4);
      set2 = (Triangle)set2;
      System.out.println("set2 area: "+ set2.area());
   }
}