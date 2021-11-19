@org.junit.Test
public void testMinDiceResult() {
    int range = dice.rollTheDice();
    junit.framework.Assert.assertEquals(dice.getResult(), range);
}