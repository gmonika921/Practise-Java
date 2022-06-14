package practise2303;

public class Incrementdecremental {

	public static void main(String[] args) {

     int a = 10;
     int b = a;
     a++;
     System.out.println(b); //10
     System.out.println(a); //11
     System.out.println("post increment");
     System.out.println();
     
     int a1 = 10;
     int b1 = a1;
     a1--;
     
     System.out.println("post decrement");
     System.out.println(a1); //9
     System.out.println(b1); //10
     System.out.println();
     
     int a2 = 10;
     int b2 = a2;
     ++a2;
     
     System.out.println("pre-increment");
     System.out.println(a2); //11
     System.out.println(b2); //10
     System.out.println();
     
     int a3 = 10;
     int b3 = 10;
     --a3;
     System.out.println("pre-decrement");
     System.out.println(a3); //9
     System.out.println(b3); //10
     
     
     
     
     
     
     

	}

}
