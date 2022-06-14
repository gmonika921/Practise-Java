package abstractconcept25;

public class Pagetest {

	public static void main(String[] args) {

		Loginpage lp = new Loginpage();
		lp.dologin();
		lp.header();
		lp.timeout();
		lp.url();
		lp.title();
		System.out.println(lp.time);
		System.out.println(lp.age);
		System.out.println(Page.age);
		
		System.out.println();
		
		System.out.println("Top- up casting");
		
//		up/top casting
		
		Page p = new Loginpage();
		p.timeout();
		p.header();
		p.title();
		System.out.println(p.time);
		
		
		
		System.out.println();
		System.out.println("Parameterized cons--------");
		
		Loginpage lp1 = new Loginpage(10);
		
		
		
		
	}

}
