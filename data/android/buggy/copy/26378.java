public void checkAssetErrors(net.jodah.concurrentunit.Waiter waiter, int numModelErrors, int numTexErrors) {
    mWaiter.assertEquals(numModelErrors, ModelErrors);
    mWaiter.assertEquals(numTexErrors, TextureErrors);
    mWaiter.resume();
}