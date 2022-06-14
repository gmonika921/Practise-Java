package constructor2703;

import java.util.ArrayList;

public class Universitytemplate {
	
	private String name;
	private String country;
	private int establisheddate;
	private ArrayList<String> courselist;
	
	
	

	public String getName() {
		return name;
	}




	private void setName(String name) {
		this.name = name;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public int getEstablisheddate() {
		return establisheddate;
	}




	public void setEstablisheddate(int establisheddate) {
		this.establisheddate = establisheddate;
	}




	public ArrayList<String> getCourselist() {
		return courselist;
	}




	public void setCourselist(ArrayList<String> courselist) {
		this.courselist = courselist;
	}




	public Universitytemplate(String name, String country, int establisheddate, ArrayList<String> courselist) {
		super();
		this.name = name;
		this.country = country;
		this.establisheddate = establisheddate;
		this.courselist = courselist;
	}




	public Universitytemplate(String name, String country, int establisheddate) {
		super();
		this.name = name;
		this.country = country;
		this.establisheddate = establisheddate;
	}




	public static void main(String[] args) {

	}

}
