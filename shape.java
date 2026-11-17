package Inheritance;

class Shape
{
  void draw()
  {
    System.out.println("Drawing A Shape");
  }
}
class Circle extends Shape
{
  void draw()
  {
    System.out.println("Drawing A Cricle");
  }
}
public class P10
{
  public static void main(String[] args)
  {
    Shape shape = new Circle() ;
    shape.draw(); 
  }

}




