package final_Keyword;

public class Shape {

	String name;
	int l;
	int w;
	Shape()
	{
		
	}
	Shape(String name, int l, int w)
	{
		this.name=name;
		this.l=l;
		this.w=w;
	}
	
	@Override
	 public String toString()
	 {
		 
		 return "Name is: "+name+" Length is: "+l+" Width is: "+w;
     }
}
