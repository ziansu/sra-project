public void updateCacheWithException() throws java.lang.Exception {
    org.oscm.billing.external.pricemodel.service.PriceModel priceModel = new org.oscm.billing.external.pricemodel.service.PriceModel(org.oscm.internal.pricemodel.external.ExternalPriceModelServiceBeanTest.PRICE_MODEL_UUID);
    org.mockito.Mockito.doThrow(new org.oscm.internal.types.exception.BillingApplicationException()).when(externalPriceModelBean).convertToLocalizedBillingResource(priceModel, null);
    externalPriceModelBean.updateCache(priceModel);
}