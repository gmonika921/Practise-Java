package practise2303;

public class nestedifelsecomparison {

	public static void main(String[] args) {

		int marks = 100;

		if (marks == 100) {
			System.out.println("excellent");

			if (marks >= 80 && marks <= 90) {
				System.out.println("very good");

				if (marks >= 70 && marks <= 50) {
					System.out.println("good");
				}

				else {
					System.out.println("fail");
				}
			}
		}
	}
}
	


