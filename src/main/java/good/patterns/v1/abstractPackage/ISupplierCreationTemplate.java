package good.patterns.v1.abstractPackage;

import java.util.Map;

public interface ISupplierCreationTemplate {

    public Map<String, Map <String, Double>> availableProducts(String supplierName, Map <String, Double> mapFromSuppier);
}
