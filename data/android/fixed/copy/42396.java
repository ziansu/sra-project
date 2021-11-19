@org.junit.Test
public void testShouldThrowAnErrorIfCallingLoadDoesNotCauseTheComponentToLoadBeforeTimeout() {
    org.openqa.selenium.support.ui.FakeClock clock = new org.openqa.selenium.support.ui.FakeClock();
    try {
        new org.openqa.selenium.support.ui.SlowLoadableComponentTest.BasicSlowLoader(clock, 2).get();
    } catch (java.lang.Error e) {
        return ;
    }
    org.junit.Assert.fail();
}