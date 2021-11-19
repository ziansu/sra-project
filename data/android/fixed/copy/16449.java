@java.lang.Override
public void purchase(java.lang.String sku) {
    if ((listener()) != null)
        listener().onPrePurchase();
    
    super.purchase(sku);
    com.amazon.device.iap.PurchasingService.purchase(sku);
}