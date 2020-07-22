import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		StaticIllustrator obj1=new StaticIllustrator();
		StaticIllustrator obj2=new StaticIllustrator();
		obj1.i=1;
		obj2.i=2;
		System.out.println("Enter object 1 details\nEnter i1");
		obj1.setI1(s.nextInt());
		System.out.println("Enter i2");
		StaticIllustrator.setI2(s.nextInt());
		System.out.println(obj1);
		System.out.println("Enter object 2 details\nEnter i1");
		obj2.setI1(s.nextInt());
		System.out.println("Enter i2");
		StaticIllustrator.setI2(s.nextInt());
		System.out.println(obj2);
		System.out.println(obj1);
		
		
		
		

	}

}
