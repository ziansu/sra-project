@org.junit.Test
public void equalsFalseXTest() {
    com.sem.btrouble.model.StayRopePowerUp compare = new com.sem.btrouble.model.StayRopePowerUp(2, 1);
    assertFalse(compare.equals(power));
}