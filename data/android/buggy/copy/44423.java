@org.junit.Test
public void testANewPurchaseRecordHasTheCurrentDaytime() {
    model.products.ProductList aProductListMock = org.mockito.Mockito.mock(model.products.ProductList.class);
    org.junit.Assert.assertEquals(org.joda.time.DateTime.now().getMinuteOfHour(), new model.registers.PurchaseRecord(aProductListMock).getPurchasingDate().getMinuteOfHour());
}