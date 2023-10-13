package example;

public class Thiskeyworduse {
	
	String name;
	int roll;
	
	Thiskeyworduse(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(roll);
	}

	public static void main(String[] args) {
		
		Thiskeyworduse a1 = new Thiskeyworduse("pooja",1);
		
		a1.display();
	
	}

}
