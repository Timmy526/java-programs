//Driver File
//FileIO & Exceptions
//Written by Timothy Tu
//October 30 2020
//Language: Java

package FileIO_Exceptions;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testFile {
	public static void main(String args[]){
	int i = 0;
	Person Tim = new Person("Tim", new Date(4, 13, 1995), null);
	Person Nick = new Person("Nick", new Date(10, 31, 2000), null);
	Person Shawn = new Person("Shawn", new Date(7, 23, 2001), null);
	Person Lauren = new Person("Lauren", new Date(3, 3, 2005), null);
	Person Jay = new Person(Lauren);
	Jay.setName("Raymond");
	
	FileReader fm = null;
	Date today = new Date(10,30,2020);
	
	try
	{
	    fm = new FileReader();
	    fm.clearFile();
	    fm.openStreams();

	    fm.addRecord(Tim);
	    fm.addRecord(Nick);
	    fm.addRecord(Shawn);
	    fm.addRecord(Lauren);
	    fm.addRecord(Jay);

	    System.out.println("People Records");
	    fm.printRecord("Tim");
	    fm.printRecord("Nick");
	    fm.printRecord("Shawn");
	    fm.printRecord("Lauren");
	    fm.printRecord("Raymond");

	    System.out.println();

	    System.out.println("Under 18:");
	    Person[] people0_18 = fm.obtainRecordsByAge(today, 0, 18);
	    i=0;
	    while (people0_18[i] != null){
	    	System.out.println(people0_18[i]);
	    	i++;
	    }

	    System.out.println();

	    System.out.println("Age: 18 - 21: ");
	    Person[] people18_21 = fm.obtainRecordsByAge(today, 18, 21);
	    i=0;
	    while (people18_21[i] != null){
	    	System.out.println(people18_21[i]);
	    	i++;
	    }

	    System.out.println();

	    System.out.println("Age: 21+ ");
	    Person[] people21_100 = fm.obtainRecordsByAge(today, 21, 100);
	    i=0;
	    while (people21_100[i] != null){
	    	System.out.println(people21_100[i]);
	    	i++;
	    }

	    System.out.println();

	    System.out.println("Deleting Nick and Shawn");
	    fm.deleteRecord("Nick");
	    fm.deleteRecord("Shawn");

	    System.out.println();

	    System.out.println("New People Records");
	    fm.printRecord("Tim");
	    fm.printRecord("Nick");
	    fm.printRecord("Shawn"); 
	    fm.printRecord("Lauren");
	    fm.printRecord("Raymond");

	    System.out.println();

	    fm.closeStreams();
	}
	catch (FileNotFoundException e){
	    System.out.println("ERROR: File not found. Aborting program");
	    System.exit(0);
	}
	
	catch (IOException e){
	    System.out.println(e.getMessage());
	    e.printStackTrace();
	    System.out.println("ERROR: IOException. Aborting program");
	    System.exit(0);
	}
	
	catch(ClassNotFoundException e){
	    System.out.println("ERROR: Class not found. Aborting program");
	    System.exit(0);
	}
    }
}
