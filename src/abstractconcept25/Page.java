package abstractconcept25;

public abstract class Page {
	
	int time = 10;
	static int age = 100;
	
	public Page() {
		System.out.println("Page----cons");
	}
	
	public Page(int a) {
		System.out.println("Page ----cons" +a);
		
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public abstract void header();
	
	public void timeout() {
		System.out.println("Page time out is ......20sec");
	}
	
	public final void logo() {
		System.out.println("page ----logo");
	}
	
	public static void main(String[] args) {

	}

}
