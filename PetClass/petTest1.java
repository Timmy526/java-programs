//Pet Test File 1
//Inheritance & Polymorphism
//Written by Timothy Tu
//October 9 2020
//Language: Java

package PetClass;

public class petTest1 {
    public static void main(String[] args)
    {
    //Creating Pets
    pet shawn = new pet("Shawn", 4, 22.3);
    dogTest nick = new dogTest("Nick", 8, 28.6);
    catTest jay = new catTest("Jay", 2, 10.4);

    //Testing Dog
    System.out.println("Editing Nick's Profile:");
    nick.printData();
    nick.setName("Nessy");
    nick.setAge(nick.getAge() + 1);
    nick.setWeight(nick.getWeight() - 0.4);
    System.out.println();
    System.out.println("Nick's Profile Edited!");
    nick.printData();
    System.out.println();

    //Testing Medicine
    System.out.println("Shawn's medicine:");
    System.out.printf("Shawn needs %.3f ml of Acepromazine\n", shawn.acepromazine());
    System.out.printf("Shawn needs %.3f ml of Carprofen\n\n", shawn.carprofen());

    System.out.println("Nick's medicine:");
    System.out.printf("Nick needs %.3f ml of Acepromazine\n", nick.acepromazine());
    System.out.printf("Nick needs %.3f ml of Carprofen\n\n", nick.carprofen());

    System.out.println("Jay's medicine:");
    System.out.printf("Jay needs %.3f ml of Acepromazine\n", jay.acepromazine());
    System.out.printf("Jay needs %.3f ml of Carprofen\n\n", jay.carprofen());
    }
}
