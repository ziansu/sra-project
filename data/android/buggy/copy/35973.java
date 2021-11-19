@java.lang.Override
public void fetchInventory(java.lang.String... sku) {
    java.util.Set<java.lang.String> skuList = new java.util.HashSet<>();
    java.util.Collections.addAll(skuList, sku);
    com.amazon.device.iap.PurchasingService.getProductData(skuList);
}