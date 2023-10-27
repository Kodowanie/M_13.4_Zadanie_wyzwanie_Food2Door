package good.patterns.v4;

import good.patterns.v4.abstractPackage.IUserChoseProduct;

import java.util.*;

public class UserChoseProduct implements IUserChoseProduct {
    public Map<String, String> choseProduct(Map<String, String> choseSupplier) {
        Integer keyNumber = 0;
        for(String key : choseSupplier.keySet()){
            keyNumber++;
            System.out.println(keyNumber + ". " + key);
        }

        System.out.print("Chose the product you want to order: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        Map<String, String> returnProduct = new HashMap<>();
        String keyString = "";
        String valueString = "";
        String errorMessage = "";

        for (Map.Entry<String, String> mapProduct : choseSupplier.entrySet()) {
            if (choice.equals("1")) {
                if (mapProduct.getKey().equals("Oyster sauce") ||
                        mapProduct.getKey().equals("Steak") ||
                        mapProduct.getKey().equals("Gluten free pasta")) {
                    keyString = mapProduct.getKey();
                    valueString = mapProduct.getValue();
                    returnProduct.put(keyString,valueString);
                }
            } else if (choice.equals("2")) {
                if (mapProduct.getKey().equals("Soy sauce") ||
                        mapProduct.getKey().equals("Eggs") ||
                        mapProduct.getKey().equals("Gluten free pasta")) {
                    keyString = mapProduct.getKey();
                    valueString = mapProduct.getValue();
                    returnProduct.put(keyString,valueString);
                }
            } else if (choice.equals("3")) {
                if (mapProduct.getKey().equals("Sake") ||
                        mapProduct.getKey().equals("Milk") ||
                        mapProduct.getKey().equals("Gluten free bread")) {
                    keyString = mapProduct.getKey();
                    valueString = mapProduct.getValue();
                    returnProduct.put(keyString,valueString);
                }
            } else {
                    errorMessage = "Chosen value incorrect... please try again";
                }
            }
        System.out.println(errorMessage);
        return returnProduct;
    }
}
