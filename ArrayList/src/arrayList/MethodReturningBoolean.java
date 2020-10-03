package arrayList;

public class MethodReturningBoolean {
	
	public boolean ComparingNumbers (int a, int b) {
		
		if (a == 10 || b == 10 || (a + b) == 10) {
			
			return true;
		}
		
		return false;
	}
	
	public static void main (String []args) {
		
		MethodReturningBoolean mrb = new MethodReturningBoolean();
		boolean result = mrb.ComparingNumbers(3, 17);
		System.out.println(result);
	}

}
