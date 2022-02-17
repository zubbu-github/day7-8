package day9;

 class A {
	  int a = 20;
	  final void m1() {
		  a = 25;
		  System.out.println("Value of a " + a);
	  }
	  void m2() {
		  System.out.println("This is the method 2");
	  }
  }
 public class finaldemo extends A{

	public static void main(String[] args) {
		A a =new A();
		a.m1();
		a.m2();
	}
}
