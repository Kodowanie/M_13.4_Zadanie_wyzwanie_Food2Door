package good.patterns.v1;

import good.patterns.v1.abstractPackage.ISupplierCreationTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> ExtraFoodShop = new HashMap<>();
        ExtraFoodShop.put("Soy sauce",10.00);
        ExtraFoodShop.put("Sake",80.00);
        ExtraFoodShop.put("Oyster sauce",20.00);

        Map<String, Double> HealthyShop = new HashMap<>();
        HealthyShop.put("Egg",1.00);
        HealthyShop.put("Steak",50.00);
        HealthyShop.put("Sirloin",120.00);

        Map<String, Double> GlutenFreeShop = new HashMap<>();
        GlutenFreeShop.put("Gluten free bread",13.00);
        GlutenFreeShop.put("Gluten free pasta", 9.00);
        GlutenFreeShop.put("Gluten free cookies",12.00);

        ISupplierCreationTemplate supplierExtraFoodShop = new SupplierCreationTemplate();
        Map <String, Map<String, Double>> addExtraFoodShop = supplierExtraFoodShop.availableProducts("ExtraFoodShop",ExtraFoodShop);
        Map <String, Map<String, Double>> addHealthyShop = supplierExtraFoodShop.availableProducts("HealthyShop",HealthyShop);
        Map <String, Map<String, Double>> addGlutenFreeShop = supplierExtraFoodShop.availableProducts("GlutenFreeShop",GlutenFreeShop);


        //User interface start from here
        System.out.println("Chose your shop you want to order from:");
        System.out.print("1.: " + addExtraFoodShop.entrySet().stream().map(s -> s.getKey()).toList());
                addExtraFoodShop.entrySet().stream().map(v -> v.getValue()).forEach(System.out::println);
        System.out.print("2.: " +addHealthyShop.entrySet().stream().map(s -> s.getKey()).toList());
            addHealthyShop.entrySet().stream().map(v -> v.getValue()).forEach(System.out::println);
        System.out.print("3.: " + addGlutenFreeShop.entrySet().stream().map(s -> s.getKey()).toList());
            addGlutenFreeShop.entrySet().stream().map(v -> v.getValue()).forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        String choseSupplier = scanner.next();




    }
}