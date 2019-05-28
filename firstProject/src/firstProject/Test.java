package firstProject;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.preCalculation((short)121);
	}
	
	// eg : 121 --> true ; 122 --> false;
	private boolean preCalculation(short value) {
		ArrayList<Integer> dividedValues= new ArrayList<>();
		short n=value;
		while(n>0) {
			dividedValues.add(n%10);
			n=(short) (n/10);
		}
		dividedValues.forEach(System.out::println);
		checkValue(dividedValues);
		return false;
	}

	private void checkValue(ArrayList<Integer> dividedValues) {
		byte i=0;
		byte j=(byte) (dividedValues.size()-1);
		byte flag=1;
		while(i<j) {
			if(dividedValues.get(i)==dividedValues.get(j)) {
				continue;
			}
			else {
				flag=0;
				break;					
			}
		}
		
		if(flag==1) {
			System.out.println("value");
		}
		else {
			System.out.println("not a value");
		}
		
		
		
	}
	

}
