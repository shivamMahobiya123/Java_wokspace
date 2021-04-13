class Circle
{
  double r;
  double area(){
    return 3.14*r*r;
  }
}
class Main
{
  public static void main(String args[])
  {
    Circle c= new Circle();
    c.r=10;
    System.out.println("Area :"+c.area());
  }
}
