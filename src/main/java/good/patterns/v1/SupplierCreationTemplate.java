package good.patterns.v1;

import good.patterns.v1.abstractPackage.ISupplierCreationTemplate;

import java.util.HashMap;
import java.util.Map;

public class SupplierCreationTemplate implements ISupplierCreationTemplate {
    public Map<String, Map <String, Double>> availableProducts(String supplierName, Map <String, Double> mapFromSuppier){
        Map<String, Map<String, Double>> productMap = new HashMap<>();
        productMap.put(supplierName , mapFromSuppier);
        return  productMap;
    }
}
