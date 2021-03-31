//Professor Rating Driver File
//Collections, Maps, and Iterators
//Written by Timothy Tu
//December 13 2020
//Language: Java

package ProfRating;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ProfRatingDriver {
    public static void main (String args[]){
		HashMap<String, ProfRating> ratings = new HashMap<String, ProfRating>();
        int ratingAmount = 0;
        int i = 0;
        double average = 0.0;
        String line;
        String uniqueID;
        
        
		try {
			Scanner inputFile = new Scanner(new FileInputStream("ProfRating"));
		
			ratingAmount = 0;
			line = inputFile.nextLine();
			ratingAmount = Integer.parseInt(line);
		
			for (i = 0; i < ratingAmount; i++) {
				uniqueID = inputFile.nextLine();
				line = inputFile.nextLine();
			
				int rating = Integer.parseInt(line);
				if (!ratings.containsKey(uniqueID)) {
					ProfRating info = new ProfRating();
					info.addRating(rating);
					ratings.put(uniqueID, info);
				}
				else {
					ProfRating info = ratings.get(uniqueID);
					info.addRating(rating);
				}
			}
			inputFile.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found or opened");
		}
		Set<String> profInfo = ratings.keySet();
		for (String prof : profInfo) {
			ProfRating info = ratings.get(prof);
			average = info.getSumRatings() / ((double) info.getNumRatings());
			System.out.println(prof + ": " + info.getNumRatings() + " reviews, average of " + average);
		}
	}
}
