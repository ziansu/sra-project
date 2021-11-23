public static void buy(final java.lang.String productID, final java.lang.String devPayload) {
    org.haxe.extension.iap.InAppPurchase.inAppPurchaseHelper.launchPurchaseFlow(Extension.mainActivity, productID, 1001, org.haxe.extension.iap.InAppPurchase.mPurchaseFinishedListener, devPayload);
}