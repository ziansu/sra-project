@org.junit.Test
public void testSellShares() {
    boolean result = FrontEnd.sellShares("GOOG", "COMMON", 500, new common.Customer("John"));
    assertTrue(result);
}