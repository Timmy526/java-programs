//Pizza Test Code 3
//Class Definition
//Written by Timothy Tu
//September 18 2020
//Language: Java

package PizzaClass;

public class pizzaTest3 {
    public static void main(String[] args){
        pizza pizza1 = new pizza("Large", 1, 0, 1);
        pizza pizza2 = new pizza("Medium", 2, 2, 0);
    
        pizzaOrder order1 = new pizzaOrder(2);
        order1.setPizza1(pizza1); 
        order1.setPizza2(pizza2);
        
        pizzaOrder order2 = new pizzaOrder(order1);
    
        order2.getPizza1().setCheese(3);
    
        System.out.printf("Total order 1: $%.2f%n", order1.calcTotal());
        System.out.printf("Total order 2: $%.2f%n", order2.calcTotal());
        }
}
