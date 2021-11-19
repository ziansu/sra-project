@org.junit.Test
public void shouldBid() {
    com.rainasmoon.onepay.model.Product p = service.bidAddMoney(1L, 1L, 10);
    org.junit.Assert.assertNotNull(p);
}