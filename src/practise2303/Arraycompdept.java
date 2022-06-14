package practise2303;

import java.util.Arrays;

public class Arraycompdept {
	
	public String[] company(String companyname) {
	
	
	String dp[] = new String[5];
	
	if (companyname.equals("TCS")) {
		dp[0] = "Accounts";
		dp[1] = "IT";
		dp[2] = "Advertisement";
		dp[3] = "Tax";
	}
	
	else if (companyname.equals("IBM")) {
		dp[0] = "Accounts-IBM";
		dp[1] = "IT - IBM";
		dp[2] = "Advertisement - IBM";
		dp[3] = "Tax - IBM";
	
	}
	
	else {
		System.out.println("Company name not found :" +companyname);
	}
	
	return dp;
	
	}

	public static void main(String[] args) {
		
		Arraycompdept cd = new Arraycompdept();
		String[] dc = cd.company("TCS");
		
		System.out.println(Arrays.toString(dc));

	}

}
