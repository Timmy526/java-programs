//Professor Rating Class
//Collections, Maps, and Iterators
//Written by Timothy Tu
//December 13 2020
//Language: Java

package ProfRating;

public class ProfRating {
    private int numRatings, sumRatings;
	public ProfRating() {
		numRatings = 0;
		sumRatings = 0;
	}
	public int getNumRatings() {
		return numRatings;
	}
	public int getSumRatings() {
		return sumRatings;
	}
	public void addRating(int rating) {
		numRatings++;
		sumRatings += rating;
	}
}
