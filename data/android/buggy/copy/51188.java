public void onIabPurchaseFinished(es.claucookie.recarga.iabutil.IabResult result, es.claucookie.recarga.iabutil.Purchase purchase) {
    publiRemovePurchased = result.isSuccess();
    checkInappStatusAndShowInfo();
}