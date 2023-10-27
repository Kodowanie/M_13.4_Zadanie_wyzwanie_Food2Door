package good.patterns.v3;

import java.io.BufferedWriter;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserChoseProduct {

    public  Map <String, String> choseProduct (Map <String, Map<String, String>> choseSupplier){
        Map <String, String> printProducts = new HashMap<>();
        Map <String, String> returnProduct = new HashMap<>();
        for (Map.Entry <String, Map<String, String>> mapTotal : choseSupplier.entrySet()){
            printProducts = mapTotal.getValue();
            System.out.println(printProducts);

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            for (Map.Entry<String,String> mapProduct : printProducts.entrySet()){
                if (choice.equals("1")){
                    if (mapProduct.getKey().equals("Soy sauce")){
                        System.out.println(mapProduct.getKey() + " = " + mapProduct.getValue());
                    }




                } else if (choice.equals("2")) {
                    printProducts = choseSupplier.get(1);
                } else if (choice.equals("3")) {
                    printProducts = choseSupplier.get(2);
                } else {
                    System.out.println("Chosen value incorrect... please try again");
                }
            }



        }









        return returnProduct;

    }
}
