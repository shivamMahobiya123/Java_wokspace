class using_this
{   
  void m()
  {
      System.out.println("Hello m");
  }
  
  void n()
  {
      this.m();
      System.out.println("Hello n");
  }
}
public class Main
{
	public static void main(String[] args) {
	    
	    using_this d1=new using_this();
	    d1.n();
	    
	}
}
