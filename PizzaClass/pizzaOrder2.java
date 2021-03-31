//Pizza Order 2 Code
//Arrays
//Written by Timothy Tu
//October 2 2020
//Language: Java

package PizzaClass;

public class pizzaOrder2 extends pizzaOrder{
	private int pizzaNum;
    private pizza[] myPizzas = new pizza[20];
    private int i;
    private int num;

    public pizzaOrder2(){
        setNumPizzas(1);
    }

    public pizzaOrder2(int numPizzas){
    	setNumPizzas(numPizzas);
    	num = numPizzas;
    }

    public pizzaOrder2(pizzaOrder2 original){
    	setNumPizzas(original.getNumPizzas());
    	for (i = 0; i < original.getNumPizzas(); i++){	
            setPizza(original.getPizza(i));
        }
    }

    //get / set myNumPizzas
    public int getNumPizzas(){
    	return pizzaNum;
    }

    public void setNumPizzas(int numPizzas){
    	pizzaNum = numPizzas;
    	for (i = 0; i < numPizzas; i++){
    		myPizzas[i] = new pizza();
    	}
    }

    //get / set Pizzas
    public pizza getPizza(int num){
    	if (myPizzas[num] == null){
            return null;
        }
    	else{
            return myPizzas[num];
        }
    }

    public void setPizza(pizza pizza){
    	myPizzas[num] = new pizza(pizza);
    }

    //calc total double
    public double calcTotal(){
    	double total = 0.0;
    	for (i = 0; i < getNumPizzas(); i++){
            total += getPizza(i).calcCost();
        }
    	return total;
    }
}