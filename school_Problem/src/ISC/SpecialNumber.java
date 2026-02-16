package ISC;

public class SpecialNumber {
	
	int number;
	
	public SpecialNumber(int numb) {
		number = numb;
	}
	
    public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		return n* factorial(n-1);
	}
    
	
	public int getDigitFactorialSum(int num) {
		
		int sum = 0;
		
		while(num > 0) {
			int d = num%10;
			sum+= factorial(d);
			num = num/10;
		}
		
		return sum;
		
	}
	
	
	public boolean isSpecial() {
		
		if(number==getDigitFactorialSum(number)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void displayResult() {
		if(isSpecial()) {
			System.out.println("It is an Special Number");
		}else {
			System.out.println("It is not an Special Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialNumber obj = new SpecialNumber(20);
		
		obj.displayResult();

	}

}
