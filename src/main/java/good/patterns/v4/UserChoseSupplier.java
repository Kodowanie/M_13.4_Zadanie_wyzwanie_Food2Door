package good.patterns.v4;

import good.patterns.v4.abstractPackage.IUserChoseSupplier;

import java.sql.SQLOutput;
import java.util.*;

public class UserChoseSupplier implements IUserChoseSupplier {

    @Override
    public Map <String, String> choseSupplier(Map<Integer, Map<String, Map<String, String>>> supplier){
        System.out.println("Welcome to your shoppingWebPage.com!");
        for (Map.Entry<Integer,Map <String, Map<String, String>>> map1 : supplier.entrySet()){
            Integer companyNumber = map1.getKey();
            String companyName = map1.getValue().toString();
            companyName = companyName.substring(1,30);
            companyName = companyName.split("=")[0];
            System.out.println(companyNumber + ". " + companyName);
        }
        System.out.print("Pick supplier number, chose from the list above: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        Map <String, String> returnChoiceSupplier = new HashMap<>();

        if (choice.equals("1")){
            for (Map.Entry<String,Map <String,String>> map2 : supplier.get(1).entrySet()){
                System.out.println("Our store sells only Asian food. Do you want to buy some?: (y/n)");
                String answer = scanner.next();
                if (answer.equals("y")){
                    System.out.println("Great to hear that we are happy to be of service!");
                    returnChoiceSupplier = map2.getValue();
                } else if (answer.equals("n")) {
                    System.out.println("We are sorry to hear that. The shop will now close.");

                } else {
                    System.out.println("Incorrect answer... please try again");
                }

            }
        } else if (choice.equals("2")) {
            for (Map.Entry<String,Map <String,String>> map2 : supplier.get(2).entrySet()) {
                returnChoiceSupplier = map2.getValue();
            }
        } else if (choice.equals("3")){
                for (Map.Entry<String,Map <String,String>> map2 : supplier.get(3).entrySet()) {
                    returnChoiceSupplier = map2.getValue();
                }
        } else {
            System.out.println("No supplier was chosen... please try again");
        }
        return returnChoiceSupplier;
    }

}
