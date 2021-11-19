@org.junit.Test
public final void testIsRunning() {
    cTimer.reset();
    org.junit.Assert.assertTrue(cTimer.isRunning());
    cTimer.stop();
    junit.framework.TestCase.assertFalse(cTimer.isRunning());
}