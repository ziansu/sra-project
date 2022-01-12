@org.junit.Test
public void getDriverTest() {
    driver.setPoints(10);
    driver2.setPoints(15);
    driver4.setPoints(25);
    assertEquals(driver4, season.getDriver(0));
}