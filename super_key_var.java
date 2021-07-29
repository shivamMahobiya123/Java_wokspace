class Vehicle
{
    String color="White";
    
}
class Bike extends Vehicle
{
     String color="Black";
     void printcolor()
     {
         System.out.println(color);
         System.out.println(super.color);
     }
}

public class Main
{
	public static void main(String[] args) {
    Bike obj= new Bike();
    obj.printcolor();
	}
}
