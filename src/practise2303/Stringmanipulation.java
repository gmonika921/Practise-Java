package practise2303;

import java.util.Arrays;

public class Stringmanipulation {

	public static void main(String[] args) {
		
		String s1 = "This is my java code";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(0));
		System.out.println(s1.length()-1);
//		System.out.println(s1.charAt(-1));// SIOR
		System.out.println(s1.indexOf('i')); // 1st occurence of i
//		System.out.println(s1.indexOf('i')+s1.indexOf('i')+1);
//		System.out.println(s1.indexOf('i')+s1.indexOf('i')+s1.indexOf('i')+1);

		System.out.println(s1.indexOf("this")); // -1
		System.out.println(s1.indexOf("This")); // 0
		System.out.println(s1.indexOf("is")); //2
		System.out.println(s1.indexOf("")); // 0
		System.out.println(s1.indexOf("my")); // 
		System.out.println(s1.indexOf("my"));//8
		System.out.println(s1.indexOf("code"));
		
		String s2 = "hello world";
		
		System.out.println(s2.contains("hello"));
		
		String s3 = "Hello world";
		
		System.out.println(s2==s3);
		
		String s4 = "hello world";
		
		System.out.println(s3==s4);
		
		System.out.println(s2.equalsIgnoreCase(s4));
		
		
		String dob = "29-09-1987";
		
		System.out.println(dob.replace("-", "/"));
		
		String dob1 = dob.replace("-", "/");
		
		System.out.println(dob1);
		
		String lang = "Java_python_ruby_dotnet";
		String lang1 = "Java1_python1_ruby1_dotnet1";
		
		String lg[]=lang.split("_");
		String lan[] = lang1.split("1");
		System.out.println(lang);
		System.out.println(Arrays.toString(lg));
		System.out.println(Arrays.toString(lan));
		
		String loop = "xXtestingxXSeleniumXXxXPythonxxXJava";
		System.out.println(loop.length());
		System.out.println(loop.indexOf("t"));
		
		String lp[] = loop.split("xX");
		System.out.println(lp[1]);
		System.out.println(lp[2]);
		System.out.println(lp[3]);
		System.out.println(lp[4]);
//		System.out.println(lp[5]); - AIOB
		System.out.println(lp[0]);
		System.out.println(Arrays.toString(lp));
		
		
		
		
		

	}

}
