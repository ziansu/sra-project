@org.junit.Test
public void TestThatHotelInitializes() {
    Expedia.Hotel target = new Expedia.Hotel(5);
    org.junit.Assert.Assert.assertNotNull(target);
}