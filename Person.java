package DukePerson;

import static java.lang.System.out;


//after writing class, create >= 6 instantiates: 
//add more features
//add more instantiates in array 

public class Person {
	private String firstName;
	private String lastName;
	private String country;
	private String gendar;
	private Boolean workExperience;
	private String undergrade;
	private String hobby;
	
	public Person(String firstName, String lastName,  
			String country, String gendar, Boolean workExperience, 
			String undergrade, String hobby) {
		this.firstName = firstName;
		this.lastName = lastName; 
		this.country = country;
		this.gendar = gendar;
		this.workExperience = workExperience;
		this.undergrade = undergrade;
		this.hobby = hobby;
	}
	
	
	// get private parameters 
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		String name = firstName + " "+ lastName;
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getGendar() {
		return gendar;
	}
	public Boolean getWorkExperience() {
		return workExperience;
	}
	public String getUndergrade() {
		return undergrade;
	}
	public String getHobby() {
		return hobby;
	}
	
	
	// this should be a virtual method in Person class? 
	// public void whoIs(String name) { // search through an array of persons, by first & last name  
}
