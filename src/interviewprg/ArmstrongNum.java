package interviewprg;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		isArmstrongNum(90);	

	}
	
	
	public static void isArmstrongNum(int num) {
		int t, r, cube=0;
		
		t = num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube +(r*r*r);
		}
		
		if(cube == t) {
			System.out.println("It's an armstrong number");
		}
		
		else {
			System.out.println("It's not an armstrong number");
		}
	}

}
