@org.junit.Test
public void testScheduleThread() throws java.lang.InterruptedException {
    basic.threads.ThreadPoolTest.scheduledExecutorService.scheduleAtFixedRate(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.lang.System.out.println("123324232");
        }
    }, 0, 1, java.util.concurrent.TimeUnit.SECONDS);
    java.lang.Thread.sleep(10000L);
}