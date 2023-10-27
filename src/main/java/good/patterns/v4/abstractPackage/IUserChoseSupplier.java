package good.patterns.v4.abstractPackage;

import java.util.Map;

public interface IUserChoseSupplier {
    Map<String, String> choseSupplier(Map<Integer, Map<String, Map<String, String>>> supplier);
}
