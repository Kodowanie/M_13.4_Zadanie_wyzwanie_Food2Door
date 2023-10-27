package good.patterns.v4;

import good.patterns.v4.abstractPackage.ISupplierCreationTemplate;
import good.patterns.v4.abstractPackage.IUserChoseSupplier;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> mapExtraFoodShop = new HashMap<>();
        mapExtraFoodShop.put("Oyster sauce","20.00/EUR per unit");
        mapExtraFoodShop.put("Soy sauce", "10.00/EUR per unit");
        mapExtraFoodShop.put("Sake","80.00/EUR per unit");


        Map<String, String> mapHealthyShop = new HashMap<>();
        mapHealthyShop.put("Steak","15.00/EUR per unit");
        mapHealthyShop.put("Eggs", "1.00/EUR per unit");
        mapHealthyShop.put("Milk","2.00/EUR per unit");

        Map<String, String> mapGlutenFreeShop = new HashMap<>();
        mapGlutenFreeShop.put("Gluten free pasta", "9.00/EUR per unit");
        mapGlutenFreeShop.put("Gluten free cookies","12.00/EUR per unit");
        mapGlutenFreeShop.put("Gluten free bread","13.00/EUR per unit");

        ISupplierCreationTemplate supplier = new SupplierCreationTemplate();
        Map <String, Map<String, String>> ExtraFoodShop = supplier.availableProducts("ExtraFoodShop",mapExtraFoodShop);
        Map <String, Map<String, String>> HealthyShop = supplier.availableProducts("HealthyShop",mapHealthyShop);
        Map <String, Map<String, String>> GlutenFreeShop = supplier.availableProducts("GlutenFreeShop",mapGlutenFreeShop);

        Map<Integer,Map <String, Map<String, String>>> finalList = new HashMap();
        finalList.put(1,ExtraFoodShop);
        finalList.put(2,HealthyShop);
        finalList.put(3,GlutenFreeShop);

//        System.out.println(finalList + "\n");

        //Start program
        boolean whileLoop = true;
        while (true){
            IUserChoseSupplier choiceSupp = new UserChoseSupplier();
            Map <String, String> supplierChoice = choiceSupp.choseSupplier(finalList);
            System.out.println();
            if (supplierChoice.size() == 0){
                break;
            }
            UserChoseProduct choseProduct =  new UserChoseProduct();
            Map <String, String> productChoice = choseProduct.choseProduct(supplierChoice);
            if (productChoice.size() == 0){
                break;
            }
            System.out.println("You have successfully order '" + productChoice + "' from the supplier ");
            break;
        }

    }
}