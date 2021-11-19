@org.junit.Test
public void equalsFalseYTest() {
    com.sem.btrouble.model.StayRopePowerUp compare = new com.sem.btrouble.model.StayRopePowerUp(1, 2, 10);
    assertFalse(compare.equals(power));
}