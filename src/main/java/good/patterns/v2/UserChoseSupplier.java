package good.patterns.v2;

import good.patterns.v2.abstractPackage.IUserChoseSupplier;

import java.util.Scanner;

public class UserChoseSupplier implements IUserChoseSupplier {
    @Override
    public String choseSupplier(){
        System.out.println("Pick supplier number, chose from the list bellow:");
        System.out.println("1. ExtraFoodShop");
        System.out.println("2. HealthyShop");
        System.out.println("3. GlutenFreeShop");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        String supplier = "";

        if (choice.equals("1")){
            supplier = "ExtraFoodShop";
        } else if (choice.equals("2")) {
            supplier = "HealthyShop";
        } else if (choice.equals("3")) {
            supplier = "GlutenFreeShop";
        } else {
            System.out.println("No supplier was chosen... please try again");
        }
        return supplier;
    }
}
