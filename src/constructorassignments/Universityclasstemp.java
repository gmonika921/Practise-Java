package constructorassignments;

import java.util.ArrayList;

public class Universityclasstemp {
	
//		Design a University class template with the following features:
//		variables:
//		name﻿
//		country
//		establishedDate
//		List of course provided in Array List<String>
//		--Design the constructor of this class with different parameters and all parameters.
//		--Write the get method of each variable with return keyword. 
	
	private String name;
	private String country;
	private int establishedDate;
	private ArrayList<String> courses;
	
	
	

	public Universityclasstemp(String name, String country, int establishedDate, ArrayList<String> courses) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courses = courses;
	}




	public Universityclasstemp(String name, String country) {
		this.name = name;
		this.country = country;
	}




	public Universityclasstemp(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getcountry() {
		return country;
	}

    public int getestablishedDate() {
    	return establishedDate;
    }
    
    public ArrayList<String> getcourses(){
    	return courses;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    	
    public void setCourses(ArrayList<String> courses){
    	this.courses = courses;
    	
    	
    }
    	
    


	public static void main(String[] args) {



	}

}
