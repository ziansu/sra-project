@Objects.Test
public void testRoll() throws java.lang.Exception {
    Objects.Dice dice = new Objects.Dice();
    org.junit.jupiter.api.Assertions.assertTrue((((dice.roll()) > 0) || ((dice.roll()) < 7)));
}