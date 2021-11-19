@org.junit.Test
public void testDisplay() throws java.io.IOException, org.oscm.internal.types.exception.SaaSApplicationException {
    org.oscm.billing.external.pricemodel.service.PriceModelContent createPriceModelContent = createPriceModelContent();
    doReturn(createPriceModelContent).when(model).getSelectedPriceModelContent();
    ctrl.display();
}