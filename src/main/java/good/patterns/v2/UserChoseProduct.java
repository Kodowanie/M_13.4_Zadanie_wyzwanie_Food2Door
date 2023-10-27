package good.patterns.v2;

import good.patterns.v2.abstractPackage.IUserChoseProduct;

import java.util.Scanner;

public class UserChoseProduct implements IUserChoseProduct {
    public String choseProduct(String supplierChoice){
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        String product = "";


        System.out.println("Chose the product you want to order:");

        //supplier ExtraFoodShop
        if (supplierChoice.equals("ExtraFoodShop")){
            System.out.println("1. Soy sauce = 10.00/EUR per unit");
            System.out.println("2. Sake = 80.00/EUR per unit");
            System.out.println("3. Oyster sauce = 20.00/EUR per unit");
            choice = scanner.next();
            if (choice.equals("1")){
                product = "Soy sauce = 10.00/EUR per unit";
            } else if (choice.equals("2")) {
                product = "Sake = 80.00/EUR per unit";
            } else if (choice.equals("3")) {
                product = "Oyster sauce = 20.00/EUR per unit";
            } else {
                System.out.println("Chosen value incorrect... please try again");
            }
        //supplier HealthyShop
        } else if (supplierChoice.equals("HealthyShop")){
            System.out.println("Eggs = 1.00/EUR per unit");
            System.out.println("Milk = 2.00/EUR per unit");
            System.out.println("Steak = 15.00/EUR per unit");
            choice = scanner.next();
            if (choice.equals("1")){
                product = "Eggs = 1.00/EUR per unit";
            } else if (choice.equals("2")){
                product = "Milk = 2.00/EUR per unit";
            } else if (choice.equals("3")){
                product = "Steak = 15.00/EUR per unit";
            } else {
                System.out.println("Chosen value incorrect... please try again");
            }
        } else if (supplierChoice.equals("GlutenFreeShop")){
            System.out.println("Gluten free bread = 13.00/EUR per unit");
            System.out.println("Gluten free pasta = 9.00/EUR per unit");
            System.out.println("Gluten free cookies = 12.00/EUR per unit");
            choice = scanner.next();
            if (choice.equals("1")){
                product = "Gluten free bread = 13.00/EUR per unit";
            } else if (choice.equals("2")){
                product = "Gluten free pasta = 9.00/EUR per unit";
            } else if (choice.equals("3")){
                product = "Gluten free cookies = 12.00/EUR per unit";
            } else {
                System.out.println("Chosen value incorrect... please try again");
            }
        } else {
            System.out.println("No product was chose... please try again");
        }
        return product;
    }

}
