@org.junit.Test
public void testSwitchingDirectionFalse() {
    model.WalkerTest.walker.switchDirection();
    org.junit.Assert.assertEquals(false, model.WalkerTest.walker.isFacingRight());
}