//Pizza Order Class
//Class Definition
//Written by Timothy Tu
//September 18 2020
//Language: Java

package PizzaClass;

public class pizzaOrder extends pizza{
    private int pizzaNum;
    private pizza pizza1 = null;
    private pizza pizza2 = null;
    private pizza pizza3 = null;

    //Different Pizza Order Functions
    public pizzaOrder(){
    	setNumPizzas(0);
    }

    public pizzaOrder(int pizzaNumInput){
    	setNumPizzas(pizzaNumInput);
    }

    public pizzaOrder(pizzaOrder original){
    	setNumPizzas(original.getPizzaNum());
        setPizza1(original.getPizza1());
        setPizza2(original.getPizza2());
        setPizza3(original.getPizza3());
        
    }

    //Get Pizza Amounts
    public int getPizzaNum(){
        return pizzaNum;
    }

    //Setting Pizza Amounts
    public void setNumPizzas(int inputPizzaNum){
        if (inputPizzaNum >= 1 && inputPizzaNum <= 3){
            pizzaNum = inputPizzaNum;
        }
        else{
        	pizzaNum = 1;
        	System.out.println("No Pizzas inputted. Reset to 1 Pizza");
        }
        
        switch (pizzaNum){
	    	case 3:
	    		pizza3 = new pizza();
	    	case 2:
	    		pizza2 = new pizza();
	    	case 1:
	    		pizza1 = new pizza();
	    	break;
	    }
    }

    //Get Pizza1 Description
    public pizza getPizza1(){
        if (pizza1 == null){
            return null;
        }  
        else{
            return pizza1;
        }
    }

    //Setting up Pizza1
    public void setPizza1(pizza Pizza1){
        pizza1 = new pizza(pizza1);
    }

    //Get Pizza2 Description
    public pizza getPizza2(){
        if (pizza2 == null){
            return null;
        }  
        else{
            return pizza2;
        }
    }

    //Setting up Pizza2
    public void setPizza2(pizza Pizza2){
    	if (pizzaNum > 1) {
    		pizza2 = new pizza(pizza2);
    	}
        
    }

    //Getting Pizza3 Description
    public pizza getPizza3(){
        if (pizza3 == null){
            return null;
        }  
        else{
            return pizza3;
        }
    }

    //Setting up Pizza3
    public void setPizza3(pizza Pizza3){
    	if (pizzaNum > 2) {
    		pizza3 = new pizza(pizza3);
    	}
    }

    //Calculating Costs for Pizza
    public double calcTotal(){
        double price = 0.0;
        if (pizzaNum == 1){
            price = pizza1.calcCost();
        }
        else if (pizzaNum == 2){
            price = pizza1.calcCost() + pizza2.calcCost();
        }
        else if (pizzaNum == 3){
            price = pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
        }
        return price;
    }




}