//Pizza Class
//Class Definition
//Written by Timothy Tu
//September 18 2020
//Language: Java

package PizzaClass;

public class pizza{
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    //Different Pizza Functions Depending on Input Styles
    public pizza(){
        size = "Small";
        cheese = 0;
        pepperoni = 0;
        ham = 0;
    }

    public pizza(int sizeInt, int cheese, int pepperoni, int ham){
        setPizzaDesc(sizeInt, cheese, pepperoni, ham);
    }

    public pizza(String sizeString, int cheese, int pepperoni, int ham){
        setPizzaDesc(sizeString, cheese, pepperoni, ham);
    }

    public pizza(int ham){
        setPizzaDesc(0, 0, 0, 0);
    }

    public pizza(pizza pizza1){
        if (pizza1 == null){
            System.out.println("No Pizza Inputted");
            System.exit(0);
        }

        size = pizza1.size;
        cheese = pizza1.cheese;
        pepperoni = pizza1.pepperoni;
        ham = pizza1.ham;
    }

    //Setting Pizza Descriptions
    public void setPizzaDesc(int sizeInt, int cheese, int pepperoni, int ham){
        if ((descCheck(sizeInt, cheese, pepperoni, ham))){
            this.size = sizeString(sizeInt);
            this.cheese = cheese;
            this.pepperoni = pepperoni;
            this.ham = ham;
        }
        else{
            System.out.println("No Pizza Inputted");
            System.exit(0);
        }
    }

    public void setPizzaDesc(String sizeString, int cheese, int pepperoni, int ham){
        if (descCheck(sizeString, cheese, pepperoni, ham)){
            this.size = sizeString;
            this.cheese = cheese;
            this.pepperoni = pepperoni;
            this.ham = ham;
        }
        else{
            System.out.println("No Pizza Inputted");
            System.exit(0);
        }
    }

    //Setting Cheese
    public void setCheese(int cheese){
        if ( (cheese < 0 || cheese > 10)){
            System.out.println("No Cheese Inputted");
            System.exit(0);
        }
        else{
            this.cheese = cheese;
        }
    }

    //Setting Pepperoni
    public void setPepperoni(int pepperoni){
        if ( (pepperoni < 0 || pepperoni > 10)){
            System.out.println("No Pepperoni Inputted");
            System.exit(0);
        }
        else{
            this.pepperoni = pepperoni;
        }
    }

    //Setting Ham
    public void setHam(int ham){
        if ( (ham < 0 || ham > 10)){
            System.out.println("No Ham Inputted");
            System.exit(0);
        }
        else{
            this.ham = ham;
        }
    }
    
    //Setting Size
    public void setSize(String size) {
    	 if (size == null){
             System.out.println("No Ham Inputted");
             System.exit(0);
         }
         else{
             this.size = size;
         }
    }

    //Get Size
    public int getSize(){
        if (size.equals("Small")){
            return 1;
        } 
        else if(size.equals("Medium")){
            return 2;
        } 
        else if(size.equals("Large")){
            return 3;
        }
        else{
            System.out.println("No Size Inputted");
            System.exit(0);
            return 0;
        }
    }

    //Get Cheese
    public int getCheese(){
        return cheese;
    }

    //Get Pepperoni
    public int getPepperoni(){
        return pepperoni;
    }

    //Get Ham
    public int getHam(){
        return ham;
    }

    //Calculating Costs
    public double calcCost(){
        double price = 0;
        if (size.equals("Small")){
            price = 10;
        }
        else if(size.equals("Medium")){
            price = 12;
        }
        else if(size.equals("Large")){
            price = 14;
        }

        price = price + (2 * cheese);
        price = price + (2 * pepperoni);
        price = price + (2 * ham);
        System.out.println(price);

        return price;
    }

    //Print Pizza Description
    public String getDescription(){
        return("You ordered a " + size + " pizza with " + cheese + " servings of cheese, " + pepperoni + " servings of pepperoni, and " + ham + " servings of ham. For a total of $" + calcCost());
    }

    //Checking Pizza Descriptions to make Pizza
    private boolean descCheck(int sizeInt, int cheese, int pepperoni, int ham){
        return ((sizeInt >= 1 || sizeInt <= 3) &&
                (cheese >= 0 || cheese <= 10) &&
                (pepperoni >= 0 || pepperoni <= 10) &&
                (ham >= 0 || ham <= 10));
    }

    private boolean descCheck(String sizeString, int cheese, int pepperoni, int ham){
        return ((sizeCheck(sizeString) || sizeCheck(sizeString)) &&
                (cheese >= 0 || cheese <= 10) &&
                (pepperoni >= 0 || pepperoni <= 10) &&
                (ham >= 0 || ham <= 10));
    }

    //Checking Size to make Pizza
    private boolean sizeCheck(String size){
        return (size.equals("Small") || size.equals("Medium") || size.equals("Large"));
    }

    //Size converting
    private String sizeString(int sizeNum){
        switch (sizeNum){
            case 1: 
                return "Small";
            case 2:
                return "Medium";
            case 3:
                return "Large";
            default:
                System.out.println("No Size Input");
                System.exit(0);
                return "No Size Input";
        }
    }
}


        
