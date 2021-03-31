//Program to calculate gpa
//Input & Control Flow
//Written by Timothy Tu
//September 11 2020
//Language: Java

import java.util.Scanner;

public class gpaCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Class 1
	    System.out.println("Class Name 1:");
	    String class1 = input.nextLine();
	    System.out.println("Assignment Grade Recieved:");
        int grade1 = input.nextInt();
        System.out.println("Possible Points:");
        int totalGrade1 = input.nextInt();
	    System.out.println();

        String line = input.nextLine();

        //Class 2
	    System.out.println("Class Name 2:");
	    String class2 = input.nextLine();
	    System.out.println("Assignment Grade Recieved:");
        int grade2 = input.nextInt();
        System.out.println("Possible Points:");
        int totalGrade2 = input.nextInt();
	    System.out.println();

        line = input.nextLine();

        //Class 3
        System.out.println("Class Name 3:");
	    String class3 = input.nextLine();
	    System.out.println("Assignment Grade Recieved:");
        int grade3 = input.nextInt();
        System.out.println("Possible Points:");
        int totalGrade3 = input.nextInt();
	    System.out.println();
        
        //Calculating Grades
        int totalGradesRecieved = grade1 + grade2 + grade3;
        int totalPoints = totalGrade1 + totalGrade2 + totalGrade3;
        float percent = (float)totalGradesRecieved / totalPoints * 100;

        //Printing Out Class Information
        System.out.printf("%-22s %-20s %-20s \n", "Class Name", "Score", "Total Possible");
        System.out.printf("%-22s %-20d %-20d \n", class1, grade1, totalGrade1);
        System.out.printf("%-22s %-20d %-20d \n", class2, grade2, totalGrade2);
        System.out.printf("%-22s %-20d %-20d \n", class3, grade3, totalGrade3);
        System.out.printf("%-22s %-20d %-20d \n", "Total", totalGradesRecieved, totalPoints);

        //Total Grades + Percentage
        System.out.printf("%nYour total recieved points is %d out of %d possible points. That is a recieved grade of %.2f", totalGradesRecieved, totalPoints, percent);
        System.out.print("%.\n\n");
        return;
    }   
}