@org.junit.Test
public void testSetHouseFalse() {
    Test.TestHouse.fC.setHouseAmount(39, 1);
    int expectedHouseAmount = -1;
    int actualHouseAmount = Test.TestHouse.fC.getHouseAmount(39);
    assertEquals(expectedHouseAmount, actualHouseAmount);
}