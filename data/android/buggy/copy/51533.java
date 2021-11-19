@org.junit.Test
public void testMaxDiceResult() {
    int range = dice.rollTheDice();
    junit.framework.Assert.assertEquals(dice.getResult(), range);
    org.junit.Assert.assertNotEquals(89, dice.getResult());
}