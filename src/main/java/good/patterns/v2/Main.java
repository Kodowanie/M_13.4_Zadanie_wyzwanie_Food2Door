package good.patterns.v2;

import good.patterns.v2.abstractPackage.IUserChoseProduct;
import good.patterns.v2.abstractPackage.IUserChoseQuantity;
import good.patterns.v2.abstractPackage.IUserChoseSupplier;

public class Main {
    public static void main(String[] args) {

//        Map<String, String> mapExtraFoodShop = new HashMap<>();
//        mapExtraFoodShop.put("Soy sauce", "10.00/EUR per unit");
//        mapExtraFoodShop.put("Sake","80.00/EUR per unit");
//        mapExtraFoodShop.put("Oyster sauce","20.00/EUR per unit");
//
//        Map<String, String> mapHealthyShop = new HashMap<>();
//        mapExtraFoodShop.put("Eggs", "1.00/EUR per unit");
//        mapExtraFoodShop.put("Milk","2.00/EUR per unit");
//        mapExtraFoodShop.put("Steak","15.00/EUR per unit");
//
//        Map<String, String> mapGlutenFreeShop = new HashMap<>();
//        mapGlutenFreeShop.put("Gluten free bread","13.00/EUR per unit");
//        mapGlutenFreeShop.put("Gluten free pasta", "9.00/EUR per unit");
//        mapGlutenFreeShop.put("Gluten free cookies","12.00/EUR per unit");
//
//        ISupplierCreationTemplate supplier = new SupplierCreationTemplate();
//        Map <String, Map<String, String>> ExtraFoodShop = supplier.availableProducts("ExtraFoodShop",mapExtraFoodShop);
//        Map <String, Map<String, String>> HealthyShop = supplier.availableProducts("HealthyShop",mapHealthyShop);
//        Map <String, Map<String, String>> GlutenFreeShop = supplier.availableProducts("GlutenFreeShop",mapHealthyShop);
//
//        List <Map <String, Map<String, String>>> finalList = new ArrayList<>();
//        finalList.add(ExtraFoodShop);
//        finalList.add(HealthyShop);
//        finalList.add(GlutenFreeShop);

        //Start program
        while (true){
            IUserChoseSupplier choiceS = new UserChoseSupplier();
            String supplierNumber = choiceS.choseSupplier();
            if (supplierNumber.equals("ExtraFoodShop")
            || supplierNumber.equals("GlutenFreeShop"));
            else if (supplierNumber.equals("HealthyShop")) {
                System.out.println("Chose delivery country/state");
            } else break;

            IUserChoseProduct choiceP =  new UserChoseProduct();
            String productNumber = choiceP.choseProduct(supplierNumber);
            if (productNumber.equals("Soy sauce = 10.00/EUR per unit") ||
                    productNumber.equals("Sake = 80.00/EUR per unit") ||
                    productNumber.equals("Oyster sauce = 20.00/EUR per unit") ||
                    productNumber.equals("Eggs = 1.00/EUR per unit") ||
                    productNumber.equals("Milk = 2.00/EUR per unit") ||
                    productNumber.equals("Steak = 15.00/EUR per unit") ||
                    productNumber.equals("Gluten free bread = 13.00/EUR per unit") ||
                    productNumber.equals("Gluten free pasta = 9.00/EUR per unit") ||
                    productNumber.equals("Gluten free cookies = 12.00/EUR per unit"));
            else break;

            IUserChoseQuantity choiceQ = new UserChoseQuantity();
            Integer quantityNumber = choiceQ.choseQuantity();
            if(quantityNumber != 0);
            else break;

            System.out.println("\nCongratulation! You have successfully order from '" + supplierNumber +
                    "'\nthe product '" + productNumber + "' in quantity of '" + quantityNumber + "'");
            break;
        }
    }
}