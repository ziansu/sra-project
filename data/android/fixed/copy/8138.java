@org.junit.Test
public final void testOnTickWhenFinished() {
    org.junit.Assert.assertTrue(cTimer.cRunning);
    long timeStamp = java.lang.System.currentTimeMillis();
    cTimer.cFinishTime = timeStamp - (cTimer.cDuration);
    cTimer.tick(timeStamp);
    org.junit.Assert.assertFalse(cTimer.cRunning);
}