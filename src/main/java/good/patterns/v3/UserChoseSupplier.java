package good.patterns.v3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserChoseSupplier {


    public Map <String, Map<String, String>> choseSupplier (List<Map <String, Map<String, String>>> supplier){
        System.out.println("Pick supplier number, chose from the list bellow:");
        System.out.println("1. ExtraFoodShop");
        System.out.println("2. HealthyShop");
        System.out.println("3. GlutenFreeShop");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        Map <String, Map<String, String>> returnChoiceSupplier = new HashMap<>();

        if (choice.equals("1")){
            returnChoiceSupplier = supplier.get(0);
        } else if (choice.equals("2")) {
            returnChoiceSupplier = supplier.get(1);
        } else if (choice.equals("3")){
            returnChoiceSupplier = supplier.get(2);
        } else {
            System.out.println("No supplier was chosen... please try again");
        }
        return returnChoiceSupplier;
    }

}
