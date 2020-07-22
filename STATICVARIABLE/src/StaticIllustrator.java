
public class StaticIllustrator {
	private int i1;
	private static int i2;
	int i;
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	public static int getI2() {
		return i2;
	}
	public static void setI2(int i2) {
		StaticIllustrator.i2 = i2;
	}
	@Override
	public String toString() {
		
		return "Object "+i+" Details: i1= "+ i1 +", i2= "+i2;
		
	}

	
	

}
