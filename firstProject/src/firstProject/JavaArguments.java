package firstProject;

public class JavaArguments {

	public static void main(String[] args) {
		testMethod(10,20);
		System.out.println("testing");
		
	}

	private static void testMethod(int... i) {
		System.out.println(i[0]);
	}

}
