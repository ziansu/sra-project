@org.junit.After
public void shutdown() throws java.lang.Exception {
    mProducer.close();
    mConsumer.close();
    mBroker.stop();
    if ((mService) != null) {
        mService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS);
    }
}