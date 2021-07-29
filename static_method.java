class Student
{
  int roll;
  static String clg="TIT";
  static void change()
  {
    clg="GGCT";
  }
  Student(int r)
  {
        roll=r;
  }
 void display()
 {
    System.out.println(" "+roll+" "+clg);
 }
}

public class Main
{
	public static void main(String[] args) {
	    Student.change();
		Student s1= new Student(122);
        s1.display();
	}
}
