//File Reader Class
//FileIO & Exceptions
//Written by Timothy Tu
//October 30 2020
//Language: Java

package FileIO_Exceptions;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

public class FileReader {
	private String inputFile;
    private ObjectInputStream myInputStream;
    private ObjectOutputStream myOutputStream;

    public FileReader(){
    	inputFile = "file.dat";
    }
    
    public FileReader(String fileName){
    	inputFile = fileName;
    }

    public void openOutStream() throws FileNotFoundException, IOException{
    	myOutputStream = new ObjectOutputStream(new FileOutputStream(inputFile,false));
    	return;
    }
    
    public void closeOutStream() throws FileNotFoundException, IOException{
    	myOutputStream.close();
    	return;
    }

    public void openInStream() throws FileNotFoundException, IOException{
    	myInputStream = new ObjectInputStream(new FileInputStream(inputFile));
    	return;
    }
    
    public void closeInStream() throws FileNotFoundException, IOException{
    	myInputStream.close();
    	return;
    }

    public void openStreams() throws FileNotFoundException, IOException{
    	this.openInStream();
    	this.openOutStream();
    	return;
    }
    
    public void closeStreams() throws FileNotFoundException, IOException{
    	this.closeOutStream();
    	this.closeInStream();
    }

    public void resetInStream() throws FileNotFoundException, IOException{
    	this.closeInStream();
    	this.openInStream();
    }
    
    public void resetOutStream() throws FileNotFoundException, IOException{
    	this.closeOutStream();
    	this.openOutStream();
    }

    public void clearFile() throws FileNotFoundException, IOException{
    	ObjectOutputStream myOutputStreamClear = new ObjectOutputStream(new FileOutputStream(inputFile,false));
    	myOutputStreamClear.close();
    	return;
    }

    public void deleteRecord(String name) throws FileNotFoundException, IOException, ClassNotFoundException{
    	int i = 0, j = 0;
    	Person temp = null;
    	Person[] array = new Person[20];
    	try{
    		while (true){
    			temp = (Person)myInputStream.readObject();
    			if (temp.getName().equals(name)){
    				System.out.println(name + "has been deleted.");
    			}
    			else{
    				array[j] = new Person(temp);
    				j++;
    			}
    		}
    	}
    	catch (EOFException e){
    	}
    	resetOutStream();
    	for (i = 0; i < j; i++){
    		this.addRecord(array[i]);
    	}
    	resetInStream();
    	return;
    }
    
    public void addRecord(Person person) throws FileNotFoundException, IOException{   
    	myOutputStream.writeObject(person);
        return;
    }

    public void addRecord(String name, Date birthDate, Date deathDate) throws FileNotFoundException, IOException{
    	myOutputStream.writeObject(new Person(name, birthDate, deathDate));
    	return;
    }

    public Person retrieveRecord(String name) throws FileNotFoundException, IOException, ClassNotFoundException{
    	try{
    		Person temp = null;
    		while(true){
    			temp = (Person)myInputStream.readObject();
    			if (temp.getName().equals(name)){
    				this.resetInStream();
    				return new Person(temp);
    			}	
    		}
    	}
    	catch (EOFException e){
    		System.out.println(name + "not found.");
    	}
    	this.resetInStream();
    	return null;
    }

    public void printRecord(String name) throws FileNotFoundException, IOException, ClassNotFoundException{
    	Person output = this.retrieveRecord(name);
    	if (output != null){
    		System.out.println(output.toString());
    	}
    	else{
    		System.out.println(name + "no data found.");
    	}
    	return;
    	}

    public Person[] obtainRecordsByAge(Date today, int minAge, int maxAge) throws FileNotFoundException, IOException, ClassNotFoundException{
    	int i = 0;
    	Person temp = null;
    	Person[] people = new Person[20];
    	Date minDate = new Date(today);
    	minDate.setYear(today.getYear() - maxAge);
    	Date maxDate = new Date(today);
    	maxDate.setYear(today.getYear() - minAge);
    	try{
	    while (true){
	    	temp = (Person)myInputStream.readObject();
	    	if (temp.getBirthDate().precedes(maxDate) && minDate.precedes(temp.getBirthDate())){
		    people[i] = temp;
		    i++;
	    	}
	    }
    	}
    	catch (EOFException e){
    	}
    	this.resetInStream();
    	return people;
    }
}