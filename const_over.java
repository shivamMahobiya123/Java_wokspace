class Student
{   
    int rollno;
    String name,course;
    float fees;
    Student(int rollno,String name,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fees)
    {
        this(rollno,name,course); //resuing data members
        this.fees=fees;
    }
    void display()
    {
        System.out.println(" "+this.rollno+" "+this.name+" "+this.course+" "+this.fees);
    }
}
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Welcome to details");
	    Student s1=new Student(101,"Ashish","BSC");
	    
	    Student s2=new Student(102,"Brijesh","MCA",1200.1f);
	    s1.display();
	    s2.display();
	}
}
