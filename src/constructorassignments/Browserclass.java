package constructorassignments;

public class Browserclass {
	
	private String Browsername;
	private double version;
	private String[] plugin;
	
	
	

	public String getBrowsername() {
		return Browsername;
	}




	public void setBrowsername(String browsername) {
		Browsername = browsername;
	}




	public double getVersion() {
		return version;
	}




	private void setVersion(double version) {
		this.version = version;
	}




	public String[] getPlugin() {
		return plugin;
	}




	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}




	public Browserclass(String browsername, double version, String[] plugin) {
		
		Browsername = browsername;
		this.version = version;
		this.plugin = plugin;
	}




	public static void main(String[] args) {
		



	}

}
