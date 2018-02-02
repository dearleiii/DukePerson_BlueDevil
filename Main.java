package DukePerson;
import java.util.ArrayList;
import static java.lang.System.out;

public class Main {
	
	public static void main(String[] args) {
		
		BlueDevil[] nameList = new BlueDevil[5];
		BlueDevil Lei = new BlueDevil("Lei", "Chen", "China", "Female", false, "KAIST", "Play the piano and sing", "ECE", "M.S.");
		BlueDevil Ric = new BlueDevil("Ric", "Telford", "America", "Male", true, "Trinity University", "Mentoring", "ECE", "Professor");
		BlueDevil Ganti = new BlueDevil("Ganti", " ", "NJ, America", "Male", true, "unknown.. ", "Climbing", "ECE", "PhD candidate");
		BlueDevil Shalin = new BlueDevil("Shalin", "Shah", "India", "Female", true, "DA-IICT", "Bodybuilding and dancing", "ECE", "PhD candidate");
		BlueDevil Niral = new BlueDevil("Niral", "Shal", "NJ, America", "Male", true, "Rutgers University", "Playing tennis and reading the news", "ECE", "MEng");

		nameList[0] = Lei;
		nameList[1] = Ric;
		nameList[2] = Ganti;
		nameList[3] = Shalin;
		nameList[4] = Niral;
		
		
		out.println("You have " + nameList.length + "persons in your name list. ");
		for (int i = 0; i < nameList.length; i++) {
			out.println((i + 1) + "." + nameList[i].getName());
		}
		
		
	}
	
	// public static void printInstructions() {
	/*
	public static void whoIs(String name) { 
		// A search function: search through an array of persons, by first & last name  
		// print the info of this person 
		BlueDevil result = searchList(name);
		out.println(result.getName() + 
				" is from " + result.getCountry() + " and is a " + 
				result.getDegree() + ".");
		
		out.println(result.);
	}
	
	public static BlueDevil searchList(String name){
		// implement search 
		
		return searchResult;
	}*/
}
