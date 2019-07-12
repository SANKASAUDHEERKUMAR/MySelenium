package My_Project;

public class Operator_Overloading {

	public void Operator_Overloading() {
		System.out.println("Method overloading constructer");
	}
	public void Operator_Overloading(int x) {
		System.out.println(x);
	}
	public int Operator_Overloading(int x,int y) {
		System.out.println(x+y);
		return x+y;
	}
	public static void main(String[] args) {
		
		Operator_Overloading OpOLoad=new Operator_Overloading();
		
		OpOLoad.Operator_Overloading();
		OpOLoad.Operator_Overloading(5);
		OpOLoad.Operator_Overloading(5,10);
		
	}

}
