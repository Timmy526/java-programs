//Array List Driver File
//Generics and ArrayList
//Written by Timothy Tu
//November 20 2020
//Language: Java

package ArrayList;
import java.util.ArrayList;
import arrayListDriver.Marks;
import java.lang.Number;

public class arrayListDriver {
    public static void main (String args[]){
        int i = 0;
        double output = 0.0;
        ArrayList <Integer> intNum = new ArrayList <> (16);
        Marks <Integer> intMark = new Marks <> ();

        for (i = 0; i < 10; i++){
            intNum.add(i * i);
        }

        output = intMark.average(intNum);
        System.out.println("Int: " + output);

        output = 0;

        ArrayList<Double> doubleNum = new ArrayList<>(16);
        Marks<Double> doubleMark = new Marks<>();

        for (i = 0; i < 10; i++){
            doubleNum.add(1.5 * i);
        }

        output = doubleMark.average(doubleNum);
        System.out.println("Doubles: " + output);
    }
}
