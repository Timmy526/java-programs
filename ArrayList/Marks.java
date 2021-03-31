//Marks Class
//Generics and ArrayList
//Written by Timothy Tu
//November 20 2020
//Language: Java

package ArrayList;
import java.lang.Number;
import java.util.ArrayList;

public class Marks<M extends Number>{
    public Marks() {

    } 
    public double average(ArrayList<M> list){
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i).doubleValue();
        }
        return (sum / list.size());
    }
}
