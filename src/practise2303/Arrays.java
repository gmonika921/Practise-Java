package practise2303;



public class Arrays {
	
//	What is am Array? -> To store data of same type, collection of data of same type
//	Various types of Array 1. Integer array 2. Boolean array 3. String array 4. double array 5. char array
//	In order to store different data type we can have object array as well.
//	Real use case of this array is where the size is fixed, like train, flight, hospital bed booking etc
//	Array is a static array where size is fixed, so this is limitation, in order t overcome 
//	we can use Array list which is dynamic in nature and the memory allocation and deallocation done automatically.
	

	public static void main(String[] args) {
		
//		There are three ways to define an array 
//		1. using new key word, key is used to assign memory.
		
		int i[] = new int[11];
		i[0] = 1;
		i[1] = 1;
		i[2] = 2;
		i[3] = 3;
		i[4] = 4;
//		i[5] = 5;
		i[6] = 6;
		i[7] = 7;
		i[8] = 8;
		i[9] = 9;
		i[10] =10;
		
		System.out.println(java.util.Arrays.toString(i));
		
//		System.out.println(i[5]); // AIOB because index 5 is unavailable
		System.out.println(i[2]); // if we don't define by default it is 0
		System.out.println(i.length); // 5
		System.out.println("highest index...." +(i.length-1));
		System.out.println("li..." +0 );
		System.out.println();
		
//		index based loop
		
		for (int k =0; k<=i.length-1; k++) {
			if (i[k]%2==0) {
				System.out.print(i[k] +" ");
			}
		}
		
		System.out.println();
		
		
		
		
	String[] s = new String[5];
//		By using literals we can define an array
		
		
		
		s[0] = "Java";
		s[1] = "python";
		s[2] = "dotnet";
		s[3] = "PHP";
		s[4] = "Angular";
		
//		advanced for loop
		
		int counter = 0;
		
		for (String e: s) {
			
			System.out.println(counter +" " +e);
			counter++;
		}
		
		
		
//object data type where we can store different data type
//		by using literals
		
		char ch[] = {'a', '1' , '0' , '3'};
		
		System.out.println(java.util.Arrays.toString(ch));
		
//		 by using another method
		
		int marks[] = new int[] {1, 2, 3,4,5};
		System.out.println(marks.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
