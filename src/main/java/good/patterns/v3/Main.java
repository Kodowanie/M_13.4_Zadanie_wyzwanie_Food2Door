package good.patterns.v3;

import good.patterns.v3.abstractPackage.ISupplierCreationTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> mapExtraFoodShop = new HashMap<>();
        mapExtraFoodShop.put("Soy sauce", "10.00/EUR per unit");
        mapExtraFoodShop.put("Sake","80.00/EUR per unit");
        mapExtraFoodShop.put("Oyster sauce","20.00/EUR per unit");

        Map<String, String> mapHealthyShop = new HashMap<>();
        mapHealthyShop.put("Eggs", "1.00/EUR per unit");
        mapHealthyShop.put("Milk","2.00/EUR per unit");
        mapHealthyShop.put("Steak","15.00/EUR per unit");

        Map<String, String> mapGlutenFreeShop = new HashMap<>();
        mapGlutenFreeShop.put("Gluten free bread","13.00/EUR per unit");
        mapGlutenFreeShop.put("Gluten free pasta", "9.00/EUR per unit");
        mapGlutenFreeShop.put("Gluten free cookies","12.00/EUR per unit");

        ISupplierCreationTemplate supplier = new SupplierCreationTemplate();
        Map <String, Map<String, String>> ExtraFoodShop = supplier.availableProducts("ExtraFoodShop",mapExtraFoodShop);
        Map <String, Map<String, String>> HealthyShop = supplier.availableProducts("HealthyShop",mapHealthyShop);
        Map <String, Map<String, String>> GlutenFreeShop = supplier.availableProducts("GlutenFreeShop",mapGlutenFreeShop);

        List<Map <String, Map<String, String>>> finalList = new ArrayList<>();
        finalList.add(ExtraFoodShop);
        finalList.add(HealthyShop);
        finalList.add(GlutenFreeShop);

        System.out.println(finalList + "\n");

        //Start program
        UserChoseSupplier choiceSupp = new UserChoseSupplier();
        Map <String, Map<String, String>> supplierChoice = choiceSupp.choseSupplier(finalList);

        UserChoseProduct choseProduct =  new UserChoseProduct();
        System.out.println("XXX" + choseProduct.choseProduct(supplierChoice));



    }
}