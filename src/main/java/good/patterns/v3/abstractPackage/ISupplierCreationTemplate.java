package good.patterns.v3.abstractPackage;

import java.util.Map;

public interface ISupplierCreationTemplate {

    public Map<String, Map <String, String>> availableProducts(String supplierName, Map <String, String> mapFromSuppier);
}
