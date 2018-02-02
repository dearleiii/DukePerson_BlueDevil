package DukePerson;

import static java.lang.System.out;

public class BlueDevil extends Person {
	// create subclass: BlueDevil : property being at Duke 
		private String major;
		private String degree;  
		
		public BlueDevil(String firstName, String lastName,  
				String country, String gendar, Boolean workExperience, 
				String undergrade, String hobby, 
				String major, String degree) {
			super(firstName, lastName, country, gendar, workExperience, undergrade, hobby);
			this.major = major;
			this.degree = degree;
		}
		
		public String getMajor() {
			return major;
		}
		public String getDegree() {
			return degree;
		}
		
}
