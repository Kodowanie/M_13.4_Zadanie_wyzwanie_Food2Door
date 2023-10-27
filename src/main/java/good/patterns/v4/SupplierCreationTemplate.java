package good.patterns.v4;

import good.patterns.v4.abstractPackage.ISupplierCreationTemplate;

import java.util.HashMap;
import java.util.Map;

public class SupplierCreationTemplate implements ISupplierCreationTemplate {
    public Map<String, Map <String, String>> availableProducts(String supplierName, Map <String, String> mapFromSupplier){
        Map<String, Map<String, String>> productMap = new HashMap<>();
        productMap.put(supplierName , mapFromSupplier);
        return  productMap;
    }
}
