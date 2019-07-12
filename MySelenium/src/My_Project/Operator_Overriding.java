package My_Project;

public class Operator_Overriding {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.payment();
		
		
		Parent p1=new Child();
		p1.payment();
	//	p1.show();
		
		
		
		Child c=new Child();
		c.payment();
		

	}

}
class Parent{
	public void payment() {
		System.out.println("Payment of Parent");
		System.out.println("10");
		
		
	}
}
class Child extends Parent{
	public void payment() {
		System.out.println("Payment of Child");
		System.out.println("20");
	}
	
	public void show()
	{
		System.out.println("Show in Child");
	}
}
