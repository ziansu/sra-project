private void firePurchase(java.lang.String sku, com.idkjava.thelements.error.ErrorHandler handler) {
    mProductManager = com.idkjava.thelements.ElementsApplication.getProductManager();
    mProductManager.bindErrorHandler(handler);
    mProductManager.launchPurchase(this, sku);
}