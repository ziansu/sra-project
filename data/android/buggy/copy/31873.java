@org.junit.Test
public void sleeps() throws java.lang.InterruptedException {
    long start = java.lang.System.currentTimeMillis();
    java.lang.Thread.sleep(100);
    long duration = (java.lang.System.currentTimeMillis()) - start;
    assertTrue("Thread.sleed did not wait enogh", (duration < 100));
}