package day8;

interface  A {
	void show();
}

class B implements A {
	public void show()
	{
		System.out.println("This is Interface program");
	}
}

public class Interface {

	public static void main(String[] args) {
		A a = new B();
         a.show();
	}     
	}


