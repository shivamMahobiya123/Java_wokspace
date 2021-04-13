// class with parameter
class Circle
{

   double r;    	
   double area(double r){
	this.r= r;
    return 3.14*r*r;
  }
  double circumferenc(double r)
  {
	  this.r=r;
	  return 2*3.14*r;
  }
}
class class_with_parameter
{
  public static void main(String args[])
  {
	
    Circle c= new Circle();
    System.out.println("Area :"+c.area(5));
	System.out.println("Circumference :"+c.circumferenc(5));
	
  }
}
