package firstProject;
class StringOperations {

	public static void main(String[] args) {
		
		Name1 n1 =new Name1() {
			@Override
			public void test2() {
				System.out.println("test");
			}
		};
}


}

 abstract class Name1{
	public void test1() {
		System.out.println("ram");
	};
	public abstract void test2();
}
 
 abstract class Name2 extends Name1{
		public abstract void test1();
	}

 class ImplementAbstract extends Name2{

	@Override
	public void test1() {
		System.out.println("ram");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	 
 }
